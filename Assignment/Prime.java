package Assignment;

public class Prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=2;
		prime(n);
	}
	public static void prime(int n) {
		int i=0;
		while (i<=100) {
			if (i%2!=0) {
				System.out.println(i);
			}
		i++;
		}
	}

}
