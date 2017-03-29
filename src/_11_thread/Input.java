package _11_thread;

public class Input implements Runnable {

	private Res r;

	public Input(Res r) {
		super();
		this.r = r;
	}

	@Override
	public void run() {

		int x = 0;
		while (true) {

			if (x == 0) {
				r.set("mike", "man");

			} else {
				r.set("lili", "Ů");

			}
			x = (x + 1) % 2;

		}
	}

}
