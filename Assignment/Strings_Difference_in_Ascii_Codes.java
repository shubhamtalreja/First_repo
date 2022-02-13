package Assignment;
import java.util.*;
public class Strings_Difference_in_Ascii_Codes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner (System.in);
		String str= sc.next();
		Ascii_diff( str);

	}
	public static void Ascii_diff(String str) {
		String ans="";
		for (int i=1; i<str.length();i++) {
			ans= ans+str.charAt(i-1);
				ans = ans+ (str.charAt(i)-str.charAt(i-1));
				
			}
		System.out.print(ans);
		System.out.print(str.charAt(str.length()-1));
		}
	}


