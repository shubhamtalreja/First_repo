package Lec10;
import java.util.*;
public class insertion_Sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner (System.in);
		int n= sc.nextInt();
		int []arr = new int[n];
		for (int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
			}
		Sort(arr);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");

	}
	}
public static void Sort(int [] arr) {
		
		for (int counter = 1; counter < arr.length; counter++) {
			int j=counter-1;
			int item=arr[counter];
			while(j>=0 && arr[j]>item) {
				arr[j+1]=arr[j];
				j--;
			}
			arr[j+1]=item;		
			
		}
		
	}

}
