package _22_Frame;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class AwtDemo {

	public static void main(String[] args) {

		/*
		 * 创建图形化界面
		 * 1.创建frame窗体。
		 * 2.对窗体进行基本设置，
		 *     比如大小，位置，布局。
		 * 3.定义组件。
		 * 4.将组件通过窗体的add方法添加到窗体中。
		 * 5.让窗体显示，通过setVisible(true)
		 * 
		 * 
		 *事件监听机制的特点：
		 *1.事件源
		 *2.事件
		 *3.监听器
		 *4.事件处理
		 *事件源：就是awt包或者swing包中的那些图形界面组件。
		 *事件：每一个事件源都有特有的对应事件和共性事件。
		 *监听器：将可以触发某一个事件的动作（不只一个动作）都已经封装到了监听器中。
		 以上三者在java中都已经定义好了。
		 直接获取其对象就可以了
		 
		 我们要做的事是，就是对产生的动作进行处理。
		 */
		Frame f = new Frame("my awt");
		f.setSize(500, 400); //设置窗口大小
		f.setLocation(300,200);//设置坐标
		f.setLayout(new FlowLayout());//页面布局
		
		Button b = new Button("我是一个按钮") ;
		f.add(b) ;
		
		f.addWindowListener(new WindowAdapter(){
			public void windowClosing(WindowEvent e)
			{
				System.out.println("我关");
				System.exit(0);
			}
		});
		
		
		f.setVisible(true);  //让窗体显示
		
	}

}


/*class Mywin implements WindowListener
{
	//覆盖七个方法。可是我只用到了关闭的动作
	//其他动作都没有用到，可是却必须复写。
}*/

//因为WindowListener的子类WindowAdapter已经实现了WindowListener接口。
//并覆盖了其中的所有方法，那么我只要继承自WindowAdapter覆盖我需要的方法即可。
/*class MyWin extends WindowAdapter
{
	public void windClosing(WindowEvent e)
	{
		System.out.println("Window closing");
	}
}*/
