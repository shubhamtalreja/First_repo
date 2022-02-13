package Assignment;
import java.util.*;
public class First_Index {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner (System.in);
		int N=sc.nextInt();
		int []arr = new int [N];
		for (int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		int M= sc.nextInt();
		System.out.println(First_index(arr,M,0));

	}
	public static int First_index(int []arr, int M, int j) {
		if (j==arr.length) {
			return -1;
		}
		if (arr[j]==M) {
			return j;
		}
		return First_index(arr,M,j+1);
	}

}
