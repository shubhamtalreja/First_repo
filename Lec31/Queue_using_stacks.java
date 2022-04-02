package Lec31;

import Lec30.DynamicStack;


public class Queue_using_stacks {
	DynamicStack Primary = new DynamicStack();
	
	public void Enqueue(int item) throws Exception {
		DynamicStack helper = new DynamicStack();
		while(!Primary.ISempty()) {
			helper.push(Primary.pop());
		}
		Primary.push(item);
		while(!helper.ISempty()) {
			Primary.push(helper.pop());
			
		}
	
		
	}
	public int Dequeue () throws Exception {
		return Primary.pop();
		
		
	}
	public int  Getfront() throws Exception {
		return Primary.peek();
		
	}
	public static void main(String[] args) throws Exception {
		Queue_using_stacks qs = new Queue_using_stacks();
		qs.Enqueue(10);
		qs.Enqueue(20);
		qs.Enqueue(30);
		qs.Enqueue(40);
		qs.Enqueue(50);
		System.out.println(qs.Getfront());
		System.out.println(qs.Dequeue());
		System.out.println(qs.Getfront());
	}

}