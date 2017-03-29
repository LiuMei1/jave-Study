package _22_Frame;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class FrameDemo {

	//�����ͼ�����������������á�
	private Frame f ;
	private Button but ;
	
	FrameDemo()
	{
		init();
	}
	
	public void init()
	{
		f = new Frame("my frame");
		//��frame���л������á�
		f.setBounds(300,100,600,500);
		f.setLayout(new FlowLayout());
		
		but = new Button("my button");
		
		//�������frame��
		f.add(but);
		
		//����һ�´������¼���
		myEvent();
		//��ʾ����
		f.setVisible(true);
	}
	private void myEvent()
	{
		f.addWindowListener(new WindowAdapter()
		{
			public void windowClosing(WindowEvent e)
			{
				System.exit(0);
			}
		});
		//�ð�ť�߱��˳�����Ĺ���
		/*
		 * ��ť�����¼�Դ��
		 * ��ôѡ���ĸ��������أ�
		 * ͨ���رմ���ʵ���˽⵽����Ҫ�ĸ�����߱�ʲô�������м�������
		 * ��Ҫ�鿴���������Ĺ��ܡ�
		 * ͨ������button��API���������ְ�ť֧��һ�����м���addActionListener.
		 */
		but.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				System.out.println("�˳�����ť�ɵ�");
				System.exit(0);
			}
		});
		
	}
	public static void main(String[] args)
	{
		new FrameDemo();
	}
}
