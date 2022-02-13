package Assignment;
import java.util.*;
public class recursion_duplicate_formatting {
	 static String ans="";
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner (System.in);
		String str= sc.next();int i=0;
		System.out.print(duplicate_format(str,ans,i));
		System.out.print(str.charAt(str.length()-1));
	}
	public static String duplicate_format(String str,String ans,int i) {
		
		if(i==str.length()-1) {
			return ans;
		}
		if (str.charAt(i)!=str.charAt(i+1)) {
			return duplicate_format(str,ans+str.charAt(i),i+1 );
		}
		else {
			return duplicate_format(str,ans+(str.charAt(i) + "*"),i+1);
		}
	}

}
