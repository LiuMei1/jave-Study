package _22_Frame;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class AwtDemo {

	public static void main(String[] args) {

		/*
		 * ����ͼ�λ�����
		 * 1.����frame���塣
		 * 2.�Դ�����л������ã�
		 *     �����С��λ�ã����֡�
		 * 3.���������
		 * 4.�����ͨ�������add������ӵ������С�
		 * 5.�ô�����ʾ��ͨ��setVisible(true)
		 * 
		 * 
		 *�¼��������Ƶ��ص㣺
		 *1.�¼�Դ
		 *2.�¼�
		 *3.������
		 *4.�¼�����
		 *�¼�Դ������awt������swing���е���Щͼ�ν��������
		 *�¼���ÿһ���¼�Դ�������еĶ�Ӧ�¼��͹����¼���
		 *�������������Դ���ĳһ���¼��Ķ�������ֻһ�����������Ѿ���װ���˼������С�
		 ����������java�ж��Ѿ�������ˡ�
		 ֱ�ӻ�ȡ�����Ϳ�����
		 
		 ����Ҫ�������ǣ����ǶԲ����Ķ������д���
		 */
		Frame f = new Frame("my awt");
		f.setSize(500, 400); //���ô��ڴ�С
		f.setLocation(300,200);//��������
		f.setLayout(new FlowLayout());//ҳ�沼��
		
		Button b = new Button("����һ����ť") ;
		f.add(b) ;
		
		f.addWindowListener(new WindowAdapter(){
			public void windowClosing(WindowEvent e)
			{
				System.out.println("�ҹ�");
				System.exit(0);
			}
		});
		
		
		f.setVisible(true);  //�ô�����ʾ
		
	}

}


/*class Mywin implements WindowListener
{
	//�����߸�������������ֻ�õ��˹رյĶ���
	//����������û���õ�������ȴ���븴д��
}*/

//��ΪWindowListener������WindowAdapter�Ѿ�ʵ����WindowListener�ӿڡ�
//�����������е����з�������ô��ֻҪ�̳���WindowAdapter��������Ҫ�ķ������ɡ�
/*class MyWin extends WindowAdapter
{
	public void windClosing(WindowEvent e)
	{
		System.out.println("Window closing");
	}
}*/
