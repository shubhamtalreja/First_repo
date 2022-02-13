package Lec13;

import java.util.Scanner;

public class array_2d {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int row = sc.nextInt();
		int column = sc.nextInt();
		int[][] arr = new int[row][column];
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++) {
				arr[i][j] = sc.nextInt();
			}
			
		}
		display(arr);

	}

	public static void display(int[][] arr) {
		for (int j = 0; j < arr[0].length; j++) {
			if (j % 2 == 0) {

				for (int i = 0; i < arr.length; i++) {
					System.out.print(arr[i][j] + " ");
				}System.out.println();
			} else {
				for (int i = arr.length - 1; i >= 0; i--) {
					System.out.print(arr[i][j] + " ");
				}

			}

		}
		

	}

}

