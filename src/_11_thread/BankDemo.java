package _11_thread;

public class BankDemo {

	
	public static void main(String[] args) {

		/**
		 * 137-138
		 * 需求：
		 * 银行有一个金库。
 		 * 
		 * 同步函数用的哪一个锁呢？
		 * 函数需要被对象调用。那么函数都有一个所属对象引用，就是this。
		 * 所以同步函数使用的锁是this。
		 * 
		 * 通过该程序进行验证。
		 * 
		 * 使用两个线程存钱
		 * 一个线程在同步代码块中。
		 * 一个线程在同步函数中。
		 * 都在执行存钱动作。 
		 * 
		 * 
		 * 如果同步函数被静态修饰后，使用的锁是什么呢？
		 * 
		 * 通过验证，发现不再是this。因为静态方法中也不可以定义this。
		 * 
		 * 静态进内存时，内存中没有本类对象，但是一定有该类对应的字节码文件对象。
		 * 类名.class
		 * 
		 */
		
		Cus c  = new Cus();
		Thread t1 = new Thread(c);
		Thread t2 = new Thread(c);
		
		t1.start();
		try {
			Thread.sleep(10);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		c.key = false;
		t2.start();
	}

}
