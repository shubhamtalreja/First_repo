package Lec9;

public class reverse_array_argument {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []arr= {12,3,4,2,4,55,8,9};
		for (int i=0; i<arr.length;i++) {
			System.out.print(arr[i]+ " ");
		}
System.out.println();
		reverse(arr,2,4);
		for (int i=0; i<arr.length;i++) {
			System.out.print(arr[i]+ " ");
		}

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
