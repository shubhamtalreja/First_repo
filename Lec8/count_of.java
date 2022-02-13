package Lec8;

public class count_of {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=371;int n1=400; int n2=1000;
		int count=count_of_num( num);
		System.out.println(count);
		System.out.println(armstrong( num, count));

	}
	public static int count_of_num(int num) {
		int count=0;
		while(num>0) {
			
			
			num/=10;
			count++;
			
			
			
		}
		return count;
	}
	public static boolean armstrong(int num,int count) {
		int ans=0;int m=num;
		while(num>0) {
			int rem=num%10;
			ans= ans+(int)Math.pow(rem, count);
			num/=10;
			
		}
		return m==ans;
	}
	
	

}
