package Assignment;
import java.util.*;

public class fibbi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner (System.in);
		int n=sc.nextInt();
		System.out.println(fibbi(n));
		
		
	}
	public static int fibbi(int n) {
		int a=0;
		int b=1;
		for(int i=1;i<n;i++) {
			int sum=a+b;
			a=b;
			b=sum;
		}
		return b;
		
	}

}
