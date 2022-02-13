package Assignment;
import java.util.*;
public class Arrays_Wave_Print_Row_Wise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner (System.in);
		int N= sc.nextInt();
		int M=sc.nextInt();
		int [][]arr = new int[N][M];
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[0].length;j++) {
				arr[i][j]=sc.nextInt();
			}
		}
		row_spiral(arr);
		System.out.print("END");

	}
	public static void row_spiral(int [][] arr) {
		for (int row = 0; row < arr[0].length; row++) {
			if (row % 2 == 0) {
				for (int col = 0; col < arr.length; col++) {
					System.out.print(arr[row][col] +","+ " ");

				}
			} else {
				for (int col = arr.length - 1; col >= 0; col--) {
					System.out.print(arr[row][col] +","+" ");

				}
			}
			

		}

	}

}

