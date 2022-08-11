package unit2;
import java.util.concurrent.*;
public class thredpool {
	 static final int max_val = 5;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ExecutorService pool = Executors.newFixedThreadPool(max_val);
		Runnable one = new activity1();
		pool.execute(one);

		Runnable Two = new activity1();
		pool.execute(Two);

		Runnable Three = new activity1();
		pool.execute(Three);

		Runnable four = new activity1();
		pool.execute(four);

		Runnable five = new activity1();
		pool.execute(five);

		
		
		pool.shutdown();

		


	}

}
