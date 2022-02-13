package Lec9;

public class Array_swapping_demo {
// example of call by reference 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 10, 20, 30, 40, 50 };
		System.out.println(arr[0] + " " + arr[1]);
		Swap(arr[0], arr[1]);
		System.out.println(arr[0] + " " + arr[1]);

	}
	public static void Swap(int a, int b) {
		int t = a;
		a = b;
		b = t;
	}

}//so there is no change beacuse java is call by value not reference
