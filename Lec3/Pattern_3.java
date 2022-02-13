package Lec3;



public class Pattern_3 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n= 5;
		int row=1;
		int nst=n; // number of stars
		while (row<=n) {
			int cst=1; // count of stars
			while (cst<=nst) {
				System.out.print("* ");
				cst++;
			}
			System.out.println();
			row++;
			nst--;
		}

	}



}



