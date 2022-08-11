package unit2question2;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;


public class pool_usg_runnab {
	 static final int max_val = 5;

	public static void main(String[] args) {
		ExecutorService pool = Executors.newFixedThreadPool(max_val);
		Runnable one = new assign2();
		pool.execute(one);

		Runnable Two = new assign2();
		pool.execute(Two);

		Runnable Three = new assign2();
		pool.execute(Three);

		Runnable four = new assign2();
		pool.execute(four);

		Runnable five = new assign2();
		pool.execute(five);

		
		
		pool.shutdown();

	}

}
