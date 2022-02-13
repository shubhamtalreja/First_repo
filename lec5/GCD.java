package lec5;

public class GCD {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=60;//divident
		int b=36;//divisor
		int i=1;
		while (a%b!=0) {
			int rem=a%b;
			a=b;
			b=rem;
			
		}
		System.out.println(b);
		

	}

}
