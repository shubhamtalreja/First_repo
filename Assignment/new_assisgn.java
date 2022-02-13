package Assignment;
import java.util.*;
public class new_assisgn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int newno=sc.nextInt();
		System.out.println(count_no( n,  newno));
		
		
	}
	public static int count_no(int n, int newno) {
		int count=0;
		while(n!=0) {
		  int rem=n%10;
		  if (rem==newno) {
			  count++;
		  }
		 n/=10;
		  
		}
		 return count;
			
	}
	

}
