package Assignment;
import java.util.*;
public class All_occ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc= new Scanner(System.in);
int N=sc.nextInt();
int []arr = new int [N];
for (int i=0;i<arr.length;i++) {
	arr[i]=sc.nextInt();
}
int M=sc.nextInt();
AllOcc(arr,M,0);
	}
	public static void AllOcc(int[] arr, int M, int i) {

		if (i == arr.length) {
			return;
		}
		if (arr[i] == M) {
			System.out.print(i + " ");

		}
		AllOcc(arr, M, i + 1);

	}

}
