package Lec3;

import java.util.Scanner;

public class Pattern_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		int n= sc.nextInt();
		int row=1;
		int nst=n; // number of stars
		int nsp=0;
		while (row<=n) {
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
			System.out.println();
			row++;
			nst--;
			nsp+=2;
		}

	}

}
