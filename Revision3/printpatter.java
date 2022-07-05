package Revision3;

public class printpatter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=4;
		int row=1;
		while(row<=n) {
			int space=1;
			while(space <= (n-row)) {
				System.out.print(" ");
				space++;
			}
			int col=1;
			while(col<=(2*row)-1) {
				System.out.print("*");
				col++;
			}
			System.out.println();
			row++;
		}
		

	}

}
