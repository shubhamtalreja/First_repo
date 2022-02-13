package Assignment;
import java.util.*;
public class Pair_of_roses {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		while(n>0) {
			int m=sc.nextInt();
			int []arr= new int [m];
			for (int i=0; i<m;i++) {
				arr[i]=sc.nextInt();
			}
			int target=sc.nextInt();
			Arrays.sort(arr);
			Search_sum(arr, target);
			n--;
		}
	}
	public static void Search_sum(int []arr, int target) {
		int p=0;
		int q=0;
		int min=Integer.MAX_VALUE;
		for (int i=0; i<arr.length;i++) {
			for (int j=i+1;j<arr.length;j++) {
				if (arr[i]+arr[j]==target && min>arr[j]-arr[i]) {
					p=arr[i];
					q=arr[j];
					min=q-p;
				}
				
			}
		}
	
		System.out.println("Deepak should buy roses whose prices are "+p+" and " +q+".");

		
	}

//	public static void Swap(int []arr, int i, int j) {
//		if (arr[i]>=arr[j]) {
//			int t= arr[i];
//			arr[i]=arr[j];
//			arr[j]=t;
//			System.out.println("Deepak should buy roses whose prices are "+arr[i]+" and " +arr[j]);
//		}
//	}

}
