package Assignment;
import java.util.*;

public class array_target_sum_pairs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner (System.in);
		int n= sc.nextInt();
		int []arr = new int[n];
		for (int i=0; i<arr.length;i++) {
			arr[i]= sc.nextInt();
		}
		int target= sc.nextInt();
		Arrays.sort(arr);
		Sum_pairs(arr,  target);
	}
	public static void Sum_pairs(int []arr, int target) {
		for (int i=0; i <arr.length;i++) {
			for(int j= i+1;j<arr.length;j++) {
				for (int k=j+1; k<arr.length;k++) {
//				int k=j+1;
					if (arr[i]+arr[j]+arr[k]==target) {
						System.out.println(arr[i] + ", " + arr[j]+ " and "+ arr[k]);
						
							
						}
				}
				
				
			}
		}
	}		
	}
	



