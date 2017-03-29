package _22_Frame;

import java.awt.Button;
import java.awt.Dialog;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.File;

public class Test {

	private Frame f;
	private TextField tf ;
	private TextArea ta;
	private Button but ;
	
	private Dialog d;
	private Label lab ;
	private Button okBut ;
	public Test(){
        f = new Frame("MyTest") ;
        f.setBounds(500,300,500,400);
        f.setLayout(new FlowLayout());
		
		tf = new TextField(40) ;
		ta = new TextArea(19,60) ;
		but = new Button("转到");
		
		d = new Dialog(f,"提示信息-self",true) ;
		d.setBounds(600,400,280,100);
		d.setLayout(new FlowLayout());
		lab = new Label() ;
		okBut = new Button("确定") ;
		d.add(lab) ;
		d.add(okBut);
		
		f.add(tf);
		f.add(but);
		f.add(ta) ;
		
		f.setVisible(true);
		
		myEvent();
	}
	
	private void myEvent(){
		f.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e){
				System.exit(0);
			}
		});
		d.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e){
				d.setVisible(false);
			}
		});
		okBut.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				
				d.setVisible(false);
			}
		});
		but.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				showDir();
			}
		});
		
		tf.addKeyListener(new KeyAdapter() {
			public void keyPressed(KeyEvent e){
				if(e.getKeyCode()==KeyEvent.VK_ENTER){
					showDir();
				}
			}
		});
	}
	
	private void showDir(){
		String path = tf.getText() ;
		System.out.println(path);
		File file = new File(path) ;
		System.out.println(file.isDirectory());
		if(file.isDirectory() && file.exists()){
			ta.setText("");
			String[] name = file.list();
			for (String n : name) {
				ta.append(n+"\n\r");
//				System.out.println(n);
			}
		}else{
			String info = "您输入的信息:"+tf.getText()+"是错误的,请重新输入！";
			lab.setText(info);
			d.setVisible(true);
		}
	}
	public static void main(String[] args) {

		new Test();
	}

}
