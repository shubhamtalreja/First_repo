package Lec12;

public class First_Bad_Version_leet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

	}
	public static int First_Bad_Version(int n) {
		int lo=1;
		int hi=n;
		int ans=0;
		while (lo<=hi) {
			int mid=lo+(hi-lo)/2;
			if ( isBadVersion(mid)==true) {
				ans =mid;
				hi=mid-1;
			}
			else {
				lo=mid+1;
			}
		}
	}

}
