package Assignment;

public class Star_Pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 4;

        int Row = 1;
        
        while(Row <= n) {
            int spaces = 1;
            while(spaces <=(n-Row)) {
                System.out.print(" ");
                spaces += 1;
            }

            int Col = 1;
            while(Col <= (2 * Row) - 1) {
                System.out.print("*");
                Col += 1;
            }

            System.out.println();
            Row += 1;

	}

}
}
