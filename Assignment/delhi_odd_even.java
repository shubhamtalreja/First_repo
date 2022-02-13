package Assignment;
import java.util.*;
public class delhi_odd_even {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
		for (int i=1;i<=n;i++) {
			int nw=sc.nextInt();
			delhi_odd_even( nw);
		}
			
			
		}
		public static void delhi_odd_even(int nw) {
			
			int ans=0;int sum1=0;
			int sum2=0;
			while (nw>0) {
				ans=nw%10;
				nw/=10; 
				if (ans%2==0) {
					sum1= sum1+ans;
					
				}
				else {
					sum2= sum2+ans;
					
				}
				

				
		}
			if (sum2%3==0 || sum1%4==0) {
				System.out.println("yes");;
			}
			else {
				System.out.println("no");
			}
	}

}
