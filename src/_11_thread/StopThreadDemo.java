package _11_thread;

public class StopThreadDemo {

	public static void main(String[] args) {

		/*
		 * 148
		 * stop �����Ѿ���ʱ��
		 * 
		 * ���ֹͣ�̣߳�
		 * ֻ��һ�֣�run����������
		 * �������߳����У����д���ͨ����ѭ���ṹ��
		 * 
		 * ֻҪ����סѭ�����Ϳ�����run����������Ҳ�����߳̽�����
		 * 
		 * ���������
		 *   ���̴߳��ڶ���״̬��
		 *   �Ͳ����ȡ����ǣ���ô�߳̾Ͳ��������
		 *   
		 *   ��û��ָ���ķ�ʽ�ö�����ָ̻߳�ʱ����ʱ��Ҫ�Զ�����������
		 *   ǿ�����ָ̻߳�������״̬�����������Ϳ��Բ���������߳̽�����
		 *   
		 * Thread���ṩ�÷���interrupt������
		 * 
		 * �ػ��̣߳����ȷ���ػ��߳��ػ�˭����
		 * setDaemon(true)  �����ػ��߳�
		 * isDaemon   
		 * 1.����ǰ����
		 * 2.�û��߳̽��������Ͻ���
		 * 
		 *   
		 */
		
		
		StopThread st = new StopThread();
		
		Thread t1 = new Thread(st);
		Thread t2 = new Thread(st);
		
		t1.start();
		t2.start();
		
		int num = 0;
		
		while (true) {
			if(num++ == 60){
//				st.changeFlag();
				t1.interrupt();
//				t2.interrupt();
				break;
				
			}
			System.out.println(Thread.currentThread().getName()+".."+num++);
		}
		System.out.println("over");
		
	}

}
