package _11_thread;

public class Demo extends Thread{

	public Demo() {
		
	}
	
	public Demo(String name) {
		super(name);
	}
	
	@Override
	public void run() {
		// TODO �Զ����ɵķ������
		super.run();
		for(int i = 0 ; i< 20 ;i++)
		System.out.println(Thread.currentThread().getName()+" demo run"+i);
	}
}
