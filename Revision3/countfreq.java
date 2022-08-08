package Revision3;

public class countfreq {

	public static void main(String[] args) {
		
		int n=20;
		System.out.println(fibo(n));
	}
	public static int fibo(int n) {
		int a=0;
		int b=1;
		int sum =0;
		while(a<n) {
			
			int c= a+b;
			a=b;
			b=c;
			if(a==n) {
				return n;
			}
			if(a>n) {
				break;
			}
			if (a%2 !=0) {
				sum+=a;
				//System.out.println(b +" "+ sum);
			}
			
		}
		return sum;
		
	}
		
	}

