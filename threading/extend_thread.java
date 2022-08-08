package threading;

public class extend_thread extends Thread{
	
	@Override 
	public void run() {
		for (int i =0; i<5;i++) {
		System.out.println("run state"+" "+Thread.currentThread().getName() +" "+i);
		}
	}
}


	



