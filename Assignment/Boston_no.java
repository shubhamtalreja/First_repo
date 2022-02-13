package Assignment;
import java.util.*;

public class Boston_no {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner (System.in);
		int n =sc.nextInt();
		int m=n;int nw=0;
		int i=2;int fact=0;int ans=0;
		while(true) {
			
			if (n%i==0) {
//				System.out.println(i + "*");
				if (i>10){
					int j = i;
					while(j>0) {
						 fact=j%10;
		                    ans= ans+fact;
		                    j/=10;
//		                    System.out.println(ans + "&");
					}
					
                   
                }
				else {
					ans= ans+i;
				}
//				System.out.println(ans);
				n/=i;
			}
			
			else {
				i++;
			}
			
			if (n==1) {
				break;
			}
			
		}
		
		while(m>0) {
			int rem=m%10;
			nw=nw+rem;
			m/=10;
		
		}
//		System.out.println(ans);
//		System.out.println(nw);
		if (ans==nw) {
			System.out.println(1);
		}
		else {
			System.out.println(0);
		}
	
		
	}
	
	

}
