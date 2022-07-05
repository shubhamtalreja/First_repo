package Lec6;
import java.util.*;

public class bin_to_dec {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		int n =sc.nextInt();
		// src=2
		// dest=10;
		int ans =0;
		int mul=1;
		while(n>0) {
			int rem = n%10;
			ans =ans +rem*mul;
			n/=10;
			mul=mul*2;//mul*src
			
		}
		System.out.println(ans);

	}

}
