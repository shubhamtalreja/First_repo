package Assignment;
import java.util.*;

public class print_primes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		int n= sc.nextInt(); 
		System.out.println("2");
		for (int i =3; i <=n; i++) {
			if(check_prime(i)) {
				System.out.println(i);
		}
		}
		

	}
	public static boolean check_prime(int n) {
		int i=2;
		int fact=0;
		while (i<n) {
			if (n%i==0) {
				fact++;
			}
			i++;
		}
		if (fact==0) {
			return true;
		}
		else {
			return false;
		}
		
			
			
			
		}
		
	}


