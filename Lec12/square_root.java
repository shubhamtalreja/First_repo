package Lec12;

public class square_root {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=43;
		System.out.println(square(n));
		
	}
	public static int square(int n) {
		for (int i=1;i<n;i++) {
			if (i*i>n) {
				return i-1;
				
			}
		}
		return 0;
	}
}
		