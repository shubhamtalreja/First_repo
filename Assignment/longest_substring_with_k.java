package Assignment;
import java.util.*;
public class longest_substring_with_k {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t>0) {
		String str= sc.next();
		int n= sc.nextInt();
		System.out.println(count(str, n ));
		t--;
		}
	}
	public static int count(String str, int n ) {
		int [] freq= new int[256];
		int ei=0; int dis=0;
		int si=0;
		int ans=0;
		while(ei<str.length()) {
			// window 
			freq[str.charAt(ei)]++;
			if(freq[str.charAt(ei)]==1) {
				dis++;
			}
			
			// small
			while(dis>n) {
				freq[str.charAt(si)]--;
				if(freq[str.charAt(si)]==0) {
					dis--;
				}
				si++;
			}
			
			// ansn
			ans= Math.max(ei-si+1, ans);
			ei++;
		}
		return ans;
	}
}