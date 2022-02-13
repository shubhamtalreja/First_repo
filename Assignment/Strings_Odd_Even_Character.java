package Assignment;
import java.util.*;
public class Strings_Odd_Even_Character {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner (System.in);
		String str= sc.next();
		Strings_Odd_Even( str);

	}
	public static void Strings_Odd_Even(String str) {
		String ans="";
		for (int i=0;i<str.length();i++) {
			char ch =str.charAt(i);
			if ((i+1)%2==0) {
				ans= ans+ (char) (str.charAt(i)-1);
				
			}
			else{
				ans= ans+ (char) (str.charAt(i)+1);
			}
		}
		System.out.println(ans);
	}

}
