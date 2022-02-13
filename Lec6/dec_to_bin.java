package Lec6;
import java.util.*;
public class dec_to_bin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner (System.in);
		int n=sc.nextInt();
		// src=10
		//destination=2;
		int ans=0;
		int mul=1;
		while(n>0) {
			int rem = n%2;
			ans = ans+rem*mul;
			n/=2;
			mul=mul*10;
		}
		System.out.println(ans);

	}

}
