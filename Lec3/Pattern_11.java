package Lec3;

public class Pattern_11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5;
		int cst=1;
		while (cst<=n) {
			System.out.print("* ");
			cst++;
			
		}
		System.out.println();
		int row =2;
		int nsp=n-2;
		while (row<=n-1) {
			System.out.print("* ");
			int csp =1;
			while (csp<=nsp) {
				System.out.print("  ");
				csp++;
			}
			System.out.print("* ");
			System.out.println();
			row++;
		}
		cst=1;
		while (cst<=n) {
			System.out.print("* ");
			cst++;
		}
		
			
		

	}

}
