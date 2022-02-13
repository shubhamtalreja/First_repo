package Assignment;
import java.util.*;
public class Can_You_Read {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner (System.in);
		String str= sc.next();
		read(str);

	}
	public static void read(String str) {
		String ans=""+str.charAt(0);
		for (int i=1; i<str.length();i++) {
			char ch= str.charAt(i);
			if (ch>='A' && ch<='Z') {
				System.out.println(ans);
				ans="";
				ans=ans+ch;
			}
			else {
				ans=ans+ch;

			}
		}
		System.out.println(ans);
	}

}
