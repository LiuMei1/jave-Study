package _11_thread;

public class DeadLock implements Runnable{

	private boolean flag;
	

	public DeadLock(boolean flag) {
		super();
		this.flag = flag;
	}

	@Override
	public void run() {

		if(flag){
			synchronized (Lock.locka) {
				System.out.println("if locka");
				synchronized (Lock.lockb) {
					System.out.println("if lockb");
				}
			}
		}else{
			synchronized (Lock.lockb) {
				System.out.println("else locka");
				synchronized (Lock.locka) {
					System.out.println("else lockb");
				}
			}
		}
	}
	
	
}
