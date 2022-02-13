package Lec3;

public class Pattern_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5;
		int nst=n;
		int row=1;
		while(row<=n) {
			int cst=1;
			while(cst<=nst) {
				System.out.print("* ");
				cst++;
			}
			System.out.println();
			row++;
		}

	}

}
