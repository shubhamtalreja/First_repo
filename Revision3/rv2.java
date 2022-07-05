package Revision3;

public class rv2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//fibo no
		int a=0;
		int b=1;
		int n=5;
		while(a<n) {
			int c = a+b;
			a=b;
			b=c;
		}
		if(a==n) {
			System.out.println("true");
		}
		else {
			System.out.println("false");
		}

	}

}
