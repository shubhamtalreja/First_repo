package lec5;
import java.util.*;

public class reverse_no {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner (System.in);
		int n=sc.nextInt();
		
		int ans=0;
		while(n!=0) {
			int rem=n%10;
			ans = ans*10+rem;
			n=n/10;
			
		}
		System.out.println(ans);
		 
			
			
		}
		
			

	}


