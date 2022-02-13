package Lec18;
import java.util.*;
public class Power {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		int X =sc.nextInt();
		int N = sc.nextInt();
		System.out.println(pow(X, N));

	}

	public static int pow(int X, int N) {
		if (N == 1) {
			return X;
		}

		int p = pow(X, N - 1);
		return X * p;

	}

}
