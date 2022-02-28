package Revision;

public class power {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a= 3; int ans=1;
		int b=6;
		System.out.println(power( a,  b,ans));

	}
	public static int power(int a, int b,int ans) {
		if(b==0) {
			return ans;
		}
		return power(a,b-1,ans*a);
		
	}


}
