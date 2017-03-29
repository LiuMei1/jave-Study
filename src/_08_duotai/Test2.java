package _08_duotai;

public class Test2 {
	/*
	 * 基础班学生：学习、睡觉
	 * 高级版学生：学习、睡觉
	 * 
	 * 可以将这两类事物进行抽取。
	 */

	public static void main(String[] args) {
//		BaseStudent bs = new BaseStudent() ;
//		bs.sleep();
//		bs.study();
//		AdvStudent as = new AdvStudent() ;
//		as.sleep();
//		as.study();
		
		DoStudent ds = new DoStudent() ;
		ds.doSome(new AdvStudent() ); 
		ds.doSome(new BaseStudent() );
		
		//
		
		MainBoard mb = new MainBoard() ;
		mb.run();
		mb.usePCI(null);
		mb.usePCI(new NetCard()); //接口型引用指向自己的子类对象
	}
	
}
