package _11_thread;

public class Producer implements Runnable{

	private Resource res;
	
	public Producer() {
		
	}
	
	
	public Producer(Resource res) {
		super();
		this.res = res;
	}


	@Override
	public void run() {

		while(true){
			res.set("…Ã∆∑");
		}
	}

}
