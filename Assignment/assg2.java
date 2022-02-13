package Assignment;
import java.util.*;
public class assg2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
		int row=1;
		int nsp1=n-1;
		int nsp2=-1;
		int nst=1;int val;int r=1;
		while (row<=n) {
			int csp=1;
			
			while(csp<=nsp1) {
				System.out.print("  ");
				csp++;
			}
			int cst=1;val=r;
			
			while (cst<=nst) {
				System.out.print(val+" ");
				cst++;val--;
			}
			csp=1;
			
			while (csp<=nsp2) {
				System.out.print("  ");
				csp++;
			}
			 cst=1;val=1;
			if (row==1 || row==n) {
				cst=2;
			}
			
			while (cst<=nst) {
				System.out.print(val+" ");
				cst++;val++;
			}
			if (row<=n/2) {
				nsp1-=2;
				nst++;r++;
				nsp2+=2;
			}
			else {
				nsp1+=2;
				nst--;r--;
				nsp2-=2;
			}
			System.out.println();
			row++;
		
		}
	}

}
