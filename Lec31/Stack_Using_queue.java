package Lec31;
import Lec30.*;
public class Stack_Using_queue {
	Dynamic_Queue Primary = new Dynamic_Queue();

	public void push(int item) throws Exception {
		Primary.Enqueue(item);
	}

	public int pop() throws Exception {
		Dynamic_Queue helper = new Dynamic_Queue();
		while (Primary.size() > 1) {
			int item = Primary.Dequeue();
			helper.Enqueue(item);
		}
		int rv = Primary.Dequeue();

		while (!helper.isEmpty()) {
			int item = helper.Dequeue();
			Primary.Enqueue(item);
		}
		return rv;

	}

	public int peek() throws Exception {
		Dynamic_Queue helper = new Dynamic_Queue();
		while (Primary.size() > 1) {
			int item = Primary.Dequeue();
			helper.Enqueue(item);
		}
		int rv = Primary.Dequeue();

		while (!helper.isEmpty()) {
			int item = helper.Dequeue();
			Primary.Enqueue(item);
		}
		Primary.Enqueue(rv);
		return rv;

	}

	public int size() {
		return Primary.size();
	}
	public static void main(String[] args) throws Exception {
		Stack_Using_queue sq = new Stack_Using_queue();
		sq.push(10);
		sq.push(20);
		sq.push(30);
		sq.push(40);
		System.out.println(sq.peek());
		System.out.println(sq.pop());
		System.out.println(sq.peek());

		
		
	}

	
}