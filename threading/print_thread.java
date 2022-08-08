package threading;

public class print_thread {


		public static void main(String[] args) {
			extend_thread app = new extend_thread();
			app.start();
			for (int i =0; i<5;i++) {
				System.out.println("start state"+" "+Thread.currentThread().getName() +" "+i);
				}

		}
		}

