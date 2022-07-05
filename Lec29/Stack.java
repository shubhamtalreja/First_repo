package Lec29;

public class Stack {

	protected int[] arr;
	private int top = -1;

	public Stack() {
		arr = new int[5];
	}

	public Stack(int cap) {
		arr = new int[cap];

	}

	public boolean ISempty() {
		return top == -1;
	}

	public void push(int item) throws Exception {
		if (isfull() == true) {
			throw new Exception("pgl hai ho  jb tumhe pata stack full hai , element push kyu kr  raha hai ");
		}
		this.top = this.top + 1;
		this.arr[this.top] = item;
	}

	public boolean isfull() {

		return this.top == this.arr.length - 1;
	}

	public int pop() throws Exception {
		if (ISempty()) {
			throw new Exception("Stack Empty hai bhai kya kr raha hai");
		}
		int item = arr[top];
		this.top--;
		return item;
	}

	public int top() throws Exception {
		if (ISempty()) {
			throw new Exception("Stack Empty hai bhai kya kr raha hai");
		}
		int item = arr[top];

		return item;
	}

	public int size() {
		return this.top + 1;
	}

	public void Display() {
		for (int i = 0; i <= top; i++) {
			System.out.print(this.arr[i] + " ");

		}
		System.out.println();
	}

}