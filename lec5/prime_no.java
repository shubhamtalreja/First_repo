package lec5;
import java.util.*;

public class prime_no {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner (System.in);
		int n= sc.nextInt();
		int i=2;
		int fact=0;
		while (i<n) {
			if (n%i==0) {
				fact++;
			}
			i++;
		}
		if (fact==0) {
			System.out.println("prime");
		}
		else {
			System.out.println("not prime");
		}
		

	}

}
