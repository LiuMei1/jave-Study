package _11_thread;

public class DeadLockDemo {

	public static void main(String[] args) {

		/*
		 * 死锁。
		 * 
		 * 同步中嵌套通同步。
		 */
		 
		Thread t1 = new Thread(new DeadLock(true));
		Thread t2 = new Thread(new DeadLock(false));
		
		t1.start();
		t2.start();
	}

}
