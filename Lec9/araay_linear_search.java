package Lec9;

import java.util.Scanner;

public class araay_linear_search {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner (System.in);
		int n=sc.nextInt();
		int []arr= new int[n];
		for (int i=0; i<n;i++) {
			arr[i]=sc.nextInt();
		}
		int target=sc.nextInt();
		System.out.println(linearsearch(arr, target));
	}
	public static int linearsearch(int []arr, int target) {
		
		for(int i=0;i<arr.length;i++) {
			if (arr[i]==target) {
				return i;
			}
		}
		return -1;
	
		 
	}

}
