package Lec14;
import java.util.*;
public class substrin_int {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);

		 String str =sc.next();
		 String(str);
		
	}
	public static void String(String str) {
		int count=0;
		 for (int i=0; i<str.length();i++) {
			 for(int j=i+1;j<=str.length();j++) {
					String ans=str.substring(i, j);
				if (palindrome(ans)==true) {
					System.out.println(ans);
					
				}
			 }
		 }
		 
	}
	public static boolean palindrome(String str) {
		int i=0;
		int j=str.length()-1;
		while(i<j) {
			if(str.charAt(i)!=str.charAt(j)) {
				return false;
			}
			i++;
			j--;
		}
		return true;
	}

}
