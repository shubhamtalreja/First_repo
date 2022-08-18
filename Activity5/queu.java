package Activity5;

import java.util.LinkedList;
import java.util.Queue;

public class queu {

	public static void main(String[] args) {
   Queue<Integer> queue = new LinkedList<>();
		
		queue.add(5);
		queue.add(8);
		queue.add(9);
		queue.add(14);
		queue.add(7);
		queue.add(3);
		System.out.println(queue);
		
		int first= queue.remove();
		System.out.println(first);
		
		int second= queue.remove();
		System.out.println(second);
		
		System.out.println(queue);

		
	}

}
