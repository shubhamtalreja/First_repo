package Assignment;
import java.util.*;
public class Replace_all_pi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
		String str="";
		for(int i=0;i<n;i++) {
				 str= sc.next();
				 
				 System.out.println(replace_pi(str));	
		}
		
		
		
		

	}
	public static String replace_pi(String str) {
		String result="";
		for(int i=0;i<str.length();i++) {
			if (i+1<str.length() && str.charAt(i)=='p' && str.charAt(i+1) =='i' ) {
				result +=3.14;
				i++;
			}
			else {
				result += str.charAt(i);
			}
		}
		return result;
	}

}
