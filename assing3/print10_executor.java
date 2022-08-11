package assing3;
import java.util.concurrent.*;
public class print10_executor {
 static final int max_val =5;
	public static void main(String[] args) {
		
		ExecutorService pool = Executors.newFixedThreadPool(max_val);
		
		Runnable print = new threadprint();
		pool.execute(print);
		pool.shutdown();

	}

}
