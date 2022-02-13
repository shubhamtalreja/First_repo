package Lec13;

import java.util.Scanner;

public class vertical_wave_2d {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int M = sc.nextInt();
		int N = sc.nextInt();
		int[][] arr = new int[M][N];
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++) {
				arr[i][j] = sc.nextInt();
			}
			
		}
		display(arr);
		System.out.println("END");

	}

	public static void display(int[][] arr) {
		for (int N = 0; N < arr[0].length; N++) {
			if (N % 2 == 0) {
				for (int M = 0; M < arr.length; M++) {
					System.out.print(arr[M][N] +","+ " ");

				}
			} else {
				for (int M = arr.length - 1; M >= 0; M--) {
					System.out.print(arr[M][N] +","+" ");

				}
			}
			

		}

	}

}