package Lec29;

public class Stack {

	protected int[] arr;
	private int peek = -1;

	public Stack() {
		arr = new int[5];
	}

	public Stack(int cap) {
		arr = new int[cap];

	}

	public boolean ISempty() {
		return peek == -1;
	}

	public void push(int item) throws Exception {
		if (isfull() == true) {
			throw new Exception("pgl hai ho  jb tumhe pata stack full hai , element push kyu kr  raha hai ");
		}
		this.peek = this.peek + 1;
		this.arr[this.peek] = item;
	}

	public boolean isfull() {

		return this.peek == this.arr.length - 1;
	}

	public int pop() throws Exception {
		if (ISempty()) {
			throw new Exception("Stack Empty hai bhai kya kr raha hai");
		}
		int item = arr[peek];
		this.peek--;
		return item;
	}

	public int peek() throws Exception {
		if (ISempty()) {
			throw new Exception("Stack Empty hai bhai kya kr raha hai");
		}
		int item = arr[peek];

		return item;
	}

	public int size() {
		return this.peek + 1;
	}

	public void Display() {
		for (int i = 0; i <= peek; i++) {
			System.out.print(this.arr[i] + " ");

		}
		System.out.println();
	}

}