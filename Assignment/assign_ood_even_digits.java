package Assignment;
import java.util.*;

public class assign_ood_even_digits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		int n= sc.nextInt();
		for(int i=1; i<=n;i++) {
			odd_even_digit(i);
		}
		

	}
	public static boolean odd_even_digit(int n) {
		int ans=0;int sum1=0;
		int sum2=0;
		int place=0;
		while (n>0) {
			ans=n%10;
			n/=10; place++;
			if (place%2==0) {
				sum1= sum1+ans;
				
				return true;
				
			}
			else {
				sum2= sum2+ans;
				return false;
				
			}
			
		}
		
		
		
	}

}
