package _11_thread;

public class BankDemo {

	
	public static void main(String[] args) {

		/**
		 * 137-138
		 * ����
		 * ������һ����⡣
 		 * 
		 * ͬ�������õ���һ�����أ�
		 * ������Ҫ��������á���ô��������һ�������������ã�����this��
		 * ����ͬ������ʹ�õ�����this��
		 * 
		 * ͨ���ó��������֤��
		 * 
		 * ʹ�������̴߳�Ǯ
		 * һ���߳���ͬ��������С�
		 * һ���߳���ͬ�������С�
		 * ����ִ�д�Ǯ������ 
		 * 
		 * 
		 * ���ͬ����������̬���κ�ʹ�õ�����ʲô�أ�
		 * 
		 * ͨ����֤�����ֲ�����this����Ϊ��̬������Ҳ�����Զ���this��
		 * 
		 * ��̬���ڴ�ʱ���ڴ���û�б�����󣬵���һ���и����Ӧ���ֽ����ļ�����
		 * ����.class
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
