package assing3;

public class threadprint implements Runnable {
	public void run() {
		for(int i =1; i<=10;i++) {
			System.out.println("run thread"+ Thread.currentThread().getName()+" "+i);
		}
	}
	

}
