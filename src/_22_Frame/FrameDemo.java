package _22_Frame;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class FrameDemo {

	//定义该图形中所需的组件的引用。
	private Frame f ;
	private Button but ;
	
	FrameDemo()
	{
		init();
	}
	
	public void init()
	{
		f = new Frame("my frame");
		//对frame进行基本设置。
		f.setBounds(300,100,600,500);
		f.setLayout(new FlowLayout());
		
		but = new Button("my button");
		
		//将组件添到frame中
		f.add(but);
		
		//加载一下窗体上事件。
		myEvent();
		//显示窗体
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
		//让按钮具备退出程序的功能
		/*
		 * 按钮就是事件源。
		 * 那么选择哪个监听器呢？
		 * 通过关闭窗体实例了解到，想要哪个组件具备什么样的特有监听器。
		 * 需要查看该组件对象的功能。
		 * 通过查阅button的API描述，发现按钮支持一个特有监听addActionListener.
		 */
		but.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				System.out.println("退出，按钮干的");
				System.exit(0);
			}
		});
		
	}
	public static void main(String[] args)
	{
		new FrameDemo();
	}
}
