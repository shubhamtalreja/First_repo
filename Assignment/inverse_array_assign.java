package Assignment;
import java.util.*;

public class inverse_array_assign {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner (System.in);
		int n= sc.nextInt();
		int []arr= new int[n];
		for (int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
	    int [] m= inverse(arr);
		for (int i=0; i<arr.length;i++) {
			System.out.print(m[i]+ " ");
		}

	}
	public static int [] inverse(int [] arr ) {
		int [] inv= new int[arr.length];
		for (int i=0; i<arr.length;i++) {
			int v = arr[i];
			inv [v]= i;
			
		}
		return inv;
		
		
	
	}

}
