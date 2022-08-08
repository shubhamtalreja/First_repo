package imple_runnb;

public class using_impl_client {

	public static void main(String[] args) {
		
		using_impl client = new using_impl();
		Thread thread = new Thread(client);
		
		thread.start();
		for (int i =0; i<5;i++) {
			System.out.println("Thread in start state by implementing runnable"+" "+Thread.currentThread().getName() +" "+i);
			}

		

	}

}
