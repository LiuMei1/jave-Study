package _11_thread;

public class StopThread implements Runnable
{

	private boolean flag = true;
	@Override
	public synchronized void run() {
		
		while (flag) {
			try {
				wait();
			} catch (InterruptedException e) {
				System.out.println(Thread.currentThread().getName()+"..Exception");
				flag = false;
			}
			System.out.println(Thread.currentThread().getName()+"....run");
		}
	}

	public void changeFlag() {

		flag = false;
		
	}

}
