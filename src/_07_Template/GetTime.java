package _07_Template;

public abstract class GetTime {

	public final void getTime(){
		long start = System.currentTimeMillis() ;
		
		runcode() ;
		
		long end = System.currentTimeMillis() ;
		System.out.println("���룺" + (end - start));
	}
	public abstract void runcode() ;
}
