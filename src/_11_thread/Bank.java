package _11_thread;

public class Bank {

	private int sum;
	
	public  void add(int n){
		sum  = sum + n;
		try {
			Thread.sleep(10);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(" sum="+sum);
	}
}
