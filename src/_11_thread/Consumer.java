package _11_thread;

public class Consumer implements Runnable {

	private Resource res;

	public Consumer() {

	}

	public Consumer(Resource res) {
		super();
		this.res = res;
	}

	@Override
	public void run() {

		while(true){
			res.out();
		}
	}

}
