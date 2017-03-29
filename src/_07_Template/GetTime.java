package _07_Template;

public abstract class GetTime {

	public final void getTime(){
		long start = System.currentTimeMillis() ;
		
		runcode() ;
		
		long end = System.currentTimeMillis() ;
		System.out.println("∫¡√Î£∫" + (end - start));
	}
	public abstract void runcode() ;
}
