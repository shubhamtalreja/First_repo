package Lec12;
import java.util.*;
public class Binary_search {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int n=sc.nextInt();
		int []arr= new int[n];
		for (int i=0; i<n;i++) {
			arr[i]=sc.nextInt();
		}
		int target=sc.nextInt();
		System.out.println(binary_search(arr,target));
	}
	public static int binary_search(int[]arr,int target) {
		int lo=0;
		int hi=arr.length-1;
		while(lo<=hi) {
			int mid=(lo+hi)/2;
			if (arr[mid]==target) {
				return mid;
	}
			else if (arr[mid]<target) {
				lo=mid+1;
			}
			else {
				hi=mid-1;
			}
		}
			return -1;

}
}
