package Assignment;
import java.util.*;

public class chewbacca {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		long n=sc.nextLong();
		chewbaca(n);
		

	}
	public static void chewbaca(long n) {
		long ans =0;
        long mul =1;
		while(n>0) {
			long rem = n%10;
			if(rem == 9 && n/10 == 0 ){
                ans = ans + rem*mul;
            }
			else if(rem>=5) {
				rem = 9-rem;
                ans = ans + rem*mul;
			}
            else {ans = ans + rem*mul;}
			mul = mul*10;
			n=n/10;
            
		}
		System.out.println(ans);
	}
}