package _11_thread;

public class Demo extends Thread{

	public Demo() {
		
	}
	
	public Demo(String name) {
		super(name);
	}
	
	@Override
	public void run() {
		// TODO 自动生成的方法存根
		super.run();
		for(int i = 0 ; i< 20 ;i++)
		System.out.println(Thread.currentThread().getName()+" demo run"+i);
	}
}
