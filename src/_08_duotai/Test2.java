package _08_duotai;

public class Test2 {
	/*
	 * ������ѧ����ѧϰ��˯��
	 * �߼���ѧ����ѧϰ��˯��
	 * 
	 * ���Խ�������������г�ȡ��
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
		mb.usePCI(new NetCard()); //�ӿ�������ָ���Լ����������
	}
	
}
