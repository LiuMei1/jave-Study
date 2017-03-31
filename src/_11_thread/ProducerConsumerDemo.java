package _11_thread;

public class ProducerConsumerDemo {

	/**
	 * ���ڶ�������ߺ������ߡ�
	 * ΪʲôҪ����while�жϱ�ǡ�
	 * ԭ���ñ����ѵ��߳���һ���жϱ�ǡ�
	 * 
	 * Ϊʲô����notifyAll,
	 * ��Ϊ��Ҫ���ѶԷ��̡߳�
	 * ��Ϊֻ��notify�����׳���ֻ���ѱ����̵߳���������³����е������̶߳��ȴ���
	 * 
	 * synchronize��lock���
	 * notify��condition���Condition �� Object ����������
	 * ��wait��notify �� notifyAll���ֽ�ɽ�Ȼ��ͬ�Ķ��󣬸ö������ͨ��lock�����л�ȡ
	 * ��ʾ���У�ʵ����ֻ���ѶԷ�������
	 * ��finally�ͷ�����һ��Ҫִ�У�
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
