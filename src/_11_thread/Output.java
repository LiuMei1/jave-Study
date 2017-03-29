package _11_thread;

public class Output implements Runnable {

	private Res r;

	public Output(Res r) {
		super();
		this.r = r;
	}

	@Override
	public void run() {

		while(true){
			synchronized (r) {
				r.out();
//				notifyAll();
			}
		}

	}

}
