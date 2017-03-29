package _11_thread;

public class Ticket implements Runnable// extends Thread
{

	private int tick = 100;

	@Override
	public void run() {

		while (true) {
			synchronized (this) {

				if (tick > 0) {
					try {
						Thread.sleep(10);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					System.out.println(Thread.currentThread().getName()
							+ "......sale:" + tick--);
				} else {
					break;
				}
			}
		}
	}

}
