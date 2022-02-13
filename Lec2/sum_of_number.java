package Lec2;
import java.util.*;

public class sum_of_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner nw = new Scanner (System.in);
		int n = nw.nextInt();
		int i= 1;
		int sum = 0;
		int rem =0;
		
		while (n>0) {
			rem= n%10;
			sum = sum+rem;
			n=n/10;
		}
		
		System.out.println(sum);

	}

}
