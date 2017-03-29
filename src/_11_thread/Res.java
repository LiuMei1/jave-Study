package _11_thread;

public class Res {

	String name;
	String sex;
	boolean flag = false;

	public Res() {

	}

	@Override
	public String toString() {
		return "Res [name=" + name + ", sex=" + sex + ", flag=" + flag + "]";
	}

	public synchronized void set(String name, String sex) {

		if (flag)
			try {
				this.wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		this.sex = sex;
		this.name = name;
		flag = true;
		this.notify();

	}

	public synchronized void out() {

		if (!flag)
			try {
				this.wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		System.out.println(name + "....." + sex);
		flag = false;
		this.notify();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public boolean isFlag() {
		return flag;
	}

	public void setFlag(boolean flag) {
		this.flag = flag;
	}

}
