package _11_thread;

public class InputDemo {

	public static void main(String[] args) {

		/*142-145
		 * �̼߳�ͨѶ��
		 *   ��ʵ���Ƕ���߳��ڲ���ͬһ����Դ��
		 *   ���ǲ����Ķ�����ͬ��
		 *   
		 *   
		 *   
		 *   wait():
		 *   notify():
		 *   notifyAll():
		 *   ��ʹ����ͬ���У���ΪҪ�Գ��м��������������̲߳�����
		 *   ����Ҫʹ����ͬ���У���Ϊֻ��ͬ���ž�������
		 *   
		 *   
		 *   Ϊʲô��Щ�����̵߳ķ���Ҫ����object�����أ�
		 *   ��Ϊ��Щ�����ڲ���ͬ�����߳�ʱ��������Ҫ��ʶ�����������߳�ֻ������
		 *   ֻ��ͬһ�����ϵı��ȴ��̣߳����Ա�ͬһ������notify���ѡ�
		 *   �����ԶԲ�ͬ���е��߳̽��л��ѡ�
		 *   
		 *   �ȴ��ͻ��ѱ�����ͬһ������
		 *   
		 *   ��������������������Կ��Ա����������õķ���������object���С�
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
		
		//�Ż���
		new Thread(new Input(r)).start();
		new Thread(new Output(r)).start();
	}

}
