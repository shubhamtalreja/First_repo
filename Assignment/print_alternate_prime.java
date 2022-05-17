package Assignment;

public class print_alternate_prime {

	public static void main(String[] args) {
		int num = 100;   
		printAlternatePrimeNumber(num);   
		}  
		static int checkPrime(int num)   {   
		int i, flag = 0;   
		for(i = 2; i<= num / 2; i++)   {   
		if(num % i == 0)   {   
		flag = 1;   
		break;   
		}   
		}   
		if(flag == 0)   
		return 1;   
		else  
		return 0;   
		}   
		static void printAlternatePrimeNumber(int n)   {    
		int temp = 0;   
		for(int num = 2; num < n; num++)   
		{   
		if (checkPrime(num) == 1)   
		{    
		if (temp % 2 == 0)   
		System.out.print(num + " ");   
		temp ++;   
		}   
		}   
		}   
		}  