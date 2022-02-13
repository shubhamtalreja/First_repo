package Lec10;

public class rotate_array_in_range {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []arr= {1,2,3,4,5,6,7};
		rotatearray(arr, 3);
		for (int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+ " ");
		}

	}
	public static void rotatearray(int[]arr, int k) {
		int n=arr.length;
		k=k%n;
		reverse(arr,n-k,arr.length-1);
		reverse(arr,0,n-k-1);
		reverse(arr,0,arr.length-1);
		
	}
public static void reverse(int []arr,int i,int j) {
		
		while(i<j) {
			int t=arr[i];
			arr[i]=arr[j];
			arr[j]=t;
			i++;
			j--;
		}
}
}
