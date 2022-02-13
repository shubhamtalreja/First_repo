package Assignment;
import java.util.*;
public class Arrays_Spiral_Print_Anticlockwise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner (System.in);
		int N=sc.nextInt();
		int M=sc.nextInt();
		int [][]arr= new int [N][M];
		for (int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[0].length;j++) {
				arr[i][j]=sc.nextInt();
			}
		}
		anticlockwise(arr);
		System.out.println("END");

	}
	public static void anticlockwise(int [][]arr) {
		int minc = 0;
		int maxc = arr[0].length - 1;
		int minr = 0;
		int maxr = arr.length - 1;
		int count = 0;
		int total = arr.length * arr[0].length;
		while (count < total) {
			for (int r = minr; r <= maxr && count < total; r++) {
				System.out.print(arr[r][minc] +","+ " ");
				count++;

			}
			minc++;
			for (int c = minc; c <= maxc && count < total; c++) {
				System.out.print(arr[maxr][c] +","+ " ");
				count++;

			}
			maxr--;

			for (int r = maxr; r >= minr && count < total; r--) {
				System.out.print(arr[r][maxc] +","+ " ");
				count++;
			}
			maxc--;
			for (int c = maxc; c >= minc && count < total; c--) {
				System.out.print(arr[minr][c] +","+ " ");
				count++;

			}
			minr++;
		}

	}

}