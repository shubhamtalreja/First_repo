package Lec13;
import java.util.*;
public class matrix_2d {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		int row= sc.nextInt();
		int column= sc.nextInt();
		int [] [] arr= new int [row] [column];
		for (int i=0; i<arr.length;i++) {
			for (int j=0; j<arr[0].length;j++) {
				arr[i][j]=sc.nextInt();
			}

		}display(arr);

	}
	public static void display(int [][]arr) {
		for (int i=0; i<arr.length;i++) {
			for (int j=0; j<arr[0].length;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		
	}

}
