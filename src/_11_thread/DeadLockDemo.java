package _11_thread;

public class DeadLockDemo {

	public static void main(String[] args) {

		/*
		 * ������
		 * 
		 * ͬ����Ƕ��ͨͬ����
		 */
		 
		Thread t1 = new Thread(new DeadLock(true));
		Thread t2 = new Thread(new DeadLock(false));
		
		t1.start();
		t2.start();
	}

}
