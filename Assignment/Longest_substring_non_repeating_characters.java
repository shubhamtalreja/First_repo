package Assignment;

import java.util.Scanner;

public class Longest_substring_non_repeating_characters {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String str= sc.next();
		
		System.out.println(count(str));
	
		
	}
	public static int count(String str) {
		int [] freq= new int[256];
		int ei=0; 
		int si=0;
		int ans=0;
		while(ei<str.length()) {
			// window 
			freq[str.charAt(ei)]++;
			
			
			// small
			while(freq[str.charAt(ei)]>1) {
				freq[str.charAt(si)]--;
				
				si++;
			}
			
			// ansn
			ans= Math.max(ei-si+1, ans);
			ei++;
		}
		return ans;
	}
}


