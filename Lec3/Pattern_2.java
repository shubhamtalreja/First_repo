package Lec3;

import java.util.*;

public class Pattern_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		int n= sc.nextInt();
		int row=1;
		int nst=1; // number of stars
		while (row<=n) {
			int cst=1; // count of stars
			while (cst<=nst) {
				System.out.print("* ");
				cst++;
			}
			System.out.println();
			row++;
			nst+=2;
		}

	}

}
