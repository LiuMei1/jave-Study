package _08_duotai;

public class MainBoard {

	/*public void run(){
		System.out.println("mainboard run");
	}
	
	public void useNetCard(NetCard c){
		c.open();
		c.close();
	}*/
	
	public void run(){
		System.out.println("mainboard run");
	}
	public void usePCI(PCI c){
		if(c!=null){
		c.open();
		c.close();
		}
	}
	
}
