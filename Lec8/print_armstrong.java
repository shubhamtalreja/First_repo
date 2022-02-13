package Lec8;

public class print_armstrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n1=400; int n2=1000;

	}
	public static void printArmstrongNumbers(int n1, int n2) {
		for (int i = n1; i <=n2; i++) {
			if(armstrong(i)==true) {
				System.out.println(i);
			}
			
		}
		
		
	}
	
	public static int count_of_num(int num) {
		int count=0;
		while(num>0) {
			
			
			num/=10;
			count++;
			
			
			
		}
		return count;
	}
	public static int armstrong(int num,int count) {
		int ans=0;int m=num;
		while(num>0) {
			int rem=num%10;
			ans= ans+(int)Math.pow(rem, count);
			num/=10;
			
		}
		return ans;
	}
}
