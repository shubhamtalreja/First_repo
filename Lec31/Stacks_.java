package Lec31;
import java.util.*;
public class Stacks_ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<Integer> st = new Stack<>();
		st.push(10);
		st.push(20);
		st.push(30);
		st.push(40);
		st.push(50);
		System.out.println(st);
		System.out.println("-------------------");
		reverse(st);
		System.out.println(st);


	}

	private static void reverse(Stack<Integer> st) {
		if(st.isEmpty()) {
			return;
		}
		
		int item = st.pop();
		reverse(st);
		Insertdown(st,item);
		
	}

	private static void Insertdown(Stack<Integer> st, int item) {
		
		if(st.isEmpty()) {
			st.push(item);
			return;
		}
		
		int ii= st.pop();
		Insertdown(st, item);
		st.push(ii);
	}
	

}
