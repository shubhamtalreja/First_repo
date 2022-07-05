package lec5;
import java.util.*;

public class fibinaci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc= new Scanner (System.in);
			int n=sc.nextInt();
			int a=0;
			int b=1;
			int nst=1;
			int i=1;
			while (i<=n) {
				int cst=1;
				while (cst<=nst) {
					System.out.print(a+" ");
					int sum =a+b;
					a=b;
					b=sum;
					cst++;
				}
				
				
				System.out.println();
				i++;
				nst++;
			}

	}

}
