package Lec10;
import java.util.*;
public class Bubble_sort {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
		int []arr = new int[n];
		for (int i=0;i<n;i++) {
			arr[i]= sc.nextInt();
		}
		sort(arr);
		for (int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+ " ");
		}
		

	}
	public static void sort(int []arr) {
		for (int p=1;p<arr.length;p++) {
			for(int i=0;i<arr.length-p;i++) {
				if(arr[i]>arr[i+1]) {
					int t=arr[i];
					arr[i]=arr[i+1];
					arr[i+1]=t;
				}
			}
		}
	}

}
