package _22_Frame;

import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Menu;
import java.awt.MenuBar;
import java.awt.MenuItem;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class MyMenuDemo {

	private Frame f;
	private MenuBar mb;
	private Menu m,subMenu ;
	private MenuItem closeItem,subItem,openItem,savaItem ;
	
	MyMenuDemo(){
		init();
	}
	public void init(){
		f = new Frame("my window");
		f.setBounds(300,100,500,600);
		f.setLayout(new FlowLayout());
		
		mb = new MenuBar();
		
		m = new Menu("文件");
		subMenu = new Menu("子菜单") ;
		
		subItem = new MenuItem("子条目");
		openItem = new MenuItem("打开文件");
		savaItem = new MenuItem("保存文件");
		closeItem = new MenuItem("退出") ;
		
		subMenu.add(subItem) ;// menubar .add() menu.add()menuItem
		
		m.add(subMenu) ;
		m.add(openItem);
		m.add(savaItem) ;
		m.add(closeItem) ;
		mb.add(m) ;
		
		f.setMenuBar(mb);
		f.setVisible(true);
		myEvent();
	}
	private void myEvent(){
		f.addWindowListener(new WindowAdapter()
		{
			public void windowClosing(WindowEvent e)
			{
				System.exit(0);
			}
		});
		
		closeItem.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
	}
	public static void main(String[] args) {
		new MyMenuDemo() ;
	}

}
