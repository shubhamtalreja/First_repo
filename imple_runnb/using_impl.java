package imple_runnb;

public class using_impl  implements Runnable{

	@Override
	public void run() {
		for (int i =0; i<5;i++) {
			System.out.println(" Thread in run state by implementing runnable"+" "+Thread.currentThread().getName() +" "+i);
			}
		
	}

}
