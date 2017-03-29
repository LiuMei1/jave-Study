package _11_thread;

public class InputDemo {

	public static void main(String[] args) {

		/*142-145
		 * 线程间通讯：
		 *   其实就是多个线程在操作同一个资源，
		 *   但是操作的动作不同。
		 *   
		 *   
		 *   
		 *   wait():
		 *   notify():
		 *   notifyAll():
		 *   都使用在同步中，因为要对持有监视器（锁）的线程操作。
		 *   所以要使用在同步中，因为只有同步才具有锁。
		 *   
		 *   
		 *   为什么这些操作线程的方法要定义object类中呢？
		 *   因为这些方法在操作同步中线程时，都必须要标识它们所操作线程只有锁，
		 *   只有同一个锁上的被等待线程，可以被同一个锁上notify唤醒。
		 *   不可以对不同锁中的线程进行唤醒。
		 *   
		 *   等待和唤醒必须是同一个锁。
		 *   
		 *   而锁可以是任意对象，所以可以被任意对象调用的方法定义在object类中。
		 */
		
		
		Res  r = new Res();
		
//		Input in = new Input(r);
//		Output out = new Output(r);
//		
//		Thread t1 = new Thread(in);
//		Thread t2 = new Thread(out);
//		
//		t1.start();
//		t2.start();
		
		//优化：
		new Thread(new Input(r)).start();
		new Thread(new Output(r)).start();
	}

}
