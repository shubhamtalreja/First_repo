package Lec4;

public class Pattern_27 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5;
		int row =1;
		int nsp=n-1;
		int nst =1;
		
		while (row<=n) {
			int csp =1;
			while(csp<=nsp) {
				System.out.print(" \t ");
				csp++;
			}
			
			int cst =1;
			int val=1;
			while (cst<=nst) {
				System.out.print(val+ "\t ");
				
				if (cst<=nst/2) {
					val++;
				}
				else {
					val--;
				}
				cst++;

				
				
			}
			System.out.println();
			row++;
			nsp--;
			nst +=2;
			
		}



	}

}
