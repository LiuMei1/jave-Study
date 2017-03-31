package _11_thread;

public class ProducerConsumerDemo {

	/**
	 * 对于多个生产者和消费者。
	 * 为什么要定义while判断标记。
	 * 原因：让被唤醒的线程再一次判断标记。
	 * 
	 * 为什么定义notifyAll,
	 * 因为需要唤醒对方线程。
	 * 因为只用notify，容易出现只唤醒本方线程的情况。导致程序中的所有线程都等待。
	 * 
	 * synchronize被lock替代
	 * notify被condition替代Condition 将 Object 监视器方法
	 * （wait、notify 和 notifyAll）分解成截然不同的对象，该对象可以通过lock锁进行获取
	 * 该示例中，实现了只唤醒对方操作。
	 * 用finally释放锁（一定要执行）
	 */
	public static void main(String[] args) {

		Resource r = new Resource();
		
		Producer pro = new Producer(r);
		Consumer con = new Consumer(r);
		
		Thread t1 = new Thread(pro);
		Thread t2 = new Thread(con);
		Thread t3 = new Thread(pro);
		Thread t4 = new Thread(con);
		
		t1.start();
		t2.start();
		t3.start();
		t4.start();
	}

}
