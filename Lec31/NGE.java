package Lec31;
import java.util.Stack;
public class NGE {

	public static void main(String[] args) {
		int[] arr = { 11 ,13 ,21, 3 };
		nextGreterELE(arr);

	}

	public static void nextGreterELE(int[ ] arr) {
		int[] ans = new int[arr.length];
		Stack<Integer> st = new Stack<>();
		for (int i = 0; i < arr.length; i++) {

			while (!st.isEmpty() && arr[i] > arr[st.peek()]) {
				ans[st.pop()] = arr[i];
			}
			st.push(i);
		}

		
		
		while (!st.isEmpty()) {
			ans[st.pop()] = -1;
		}

		for (int i = 0; i < ans.length; i++) {
			System.out.println(arr[i] + "," + ans[i] );
		}

	}

}