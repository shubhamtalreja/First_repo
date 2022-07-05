package Revision3;
import java.util.*;
public class Revision {

	public static void main(String[] args) {
		String str ="I.Love.Chocolates";
		StringBuffer sb = new StringBuffer("");
		
		int i=0;
		while(i<str.length()) {
			int j=i;

		while(j<str.length() && str.charAt(j) =='.') {
			j++;

		}
		StringBuffer sb2= new StringBuffer("");

		while(j<str.length() && str.charAt(j)!='.') {
			sb2.append(str.charAt(j));
			System.out.println(sb2);

			j++;
		}
		if(sb2.length()!=0) {
			sb.insert(0,sb2 +".");
			System.out.println(sb2);

		}
		i=j+1;
		
		
	}
		if(sb.length()==0) {
			System.out.println(sb.toString());
		}
		System.out.println(sb.substring(0, sb.length()-1).toString());
	}
	

	}

