package Assignment;
import java.util.*;
public class Sort_array_of_0s_1s_and_2s {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		int N=sc.nextInt();
		int []arr = new int [N];
		for(int i=0;i<N;i++) {
			arr[i]=sc.nextInt();
			
		}
		sort(arr);
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]+" ");
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



	
