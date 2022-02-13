package Lec3;

import java.util.Scanner;

public class Pattern_9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		int n= sc.nextInt();
		int row=1;
		int nst=1; // number of stars
		int nsp=n-1;
		while (row<=2*n-1) {
			int csp=1;
			while(csp<=nsp) {
				System.out.print("  ");
				csp++;
			
			}
			int cst=1; // count of stars
			while (cst<=nst) {
				System.out.print("* ");
				cst++;
			}
			 if (row<n) {
				 nst++;
				 nsp--;
			
			 }
			 else {
				 nst--;
				 nsp++;
			 }
			System.out.println();
			row++;
			
		}

	}

}
