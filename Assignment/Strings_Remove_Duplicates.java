package Assignment;
import java.util.*;
public class Strings_Remove_Duplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner (System.in);
		String str=sc.next();
		duplicate( str);

	}
	public static void duplicate(String str){
		
		for (int i=1; i<str.length();i++) {
			if (str.charAt(i-1)!=str.charAt(i) ) {
				System.out.print(str.charAt(i-1));
			}
			
		}
		System.out.print(str.charAt(str.length()-1));
	}

}
