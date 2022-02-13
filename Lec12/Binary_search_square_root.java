package Lec12;

public class Binary_search_square_root {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=83;
		System.out.println(square( n));

	}
	public static int square(int n) {
		int lo=1;
		int hi=n;int ans=0;
		while(lo<=hi) {
			int mid= (lo+hi)/2;
			if (mid*mid<=n) {
				ans =mid;
				lo=mid+1;
				
			}
			else {
				hi=mid-1;
			}
			
		}
		return ans;
	}
	
	
	

}
