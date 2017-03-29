package _11_thread;

public class Cus implements Runnable {

	private static int i = 100;
	private static Bank b = new Bank();

	boolean key = true;
	Object obj = new Object();

	@Override
	public void run() {

		if (key) {
			while (true) {
				synchronized (Cus.class){

					if(i<=0){
						break;
					}
					b.add(10);
					i--;
				}
				
			}
		}else{
			cun();
		}
	}

	public static synchronized void cun() {

		while (true) {
			if(i<=0){
				break;
			}
			b.add(10);
			i--;
			
		}
	}

}
