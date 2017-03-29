package _11_thread;

public class Single {

	//¿¡∫∫ Ω
	private static  Single s = null;
	
	private Single(){
		
	}
	
	public static Single getInstance(){
		if(s == null){
			synchronized (Single.class) {
				if(s == null)
					s = new Single();
			}
		}
		return s;
	}
}
