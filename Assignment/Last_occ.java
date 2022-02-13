package Assignment;
import java.util.*;
public class Last_occ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc= new Scanner (System.in);
int N=sc.nextInt();
int []arr = new int[N];
for (int i=0;i<arr.length;i++) {
	arr[i]=sc.nextInt();
}
int M=sc.nextInt();
System.out.println(Last_Occ(arr,M,arr.length-1));
	}
	public static int Last_Occ(int [] arr, int M,int j) {
		if(j<=0) {
			return -1;
		}
		if (arr[j]==M) {
			return j;
		}
		return Last_Occ(arr,M,j-1);
	}

}
