package Assignment;
import java.util.*;


public class Von {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner (System.in);
		int n=sc.nextInt();
		for (int i=1;i<=n;i++) {
			int n1=sc.nextInt();
			System.out.println(Von(n1));
			
		}

	}
	public static int Von(int n1) {
		int ans=0;
		int mul=1;
		while (n1>0) {
			int rem =n1%10;
			ans= ans+rem*mul;
			mul*=2; n1/=10;
			
		}
		return ans;
	}
	

}
