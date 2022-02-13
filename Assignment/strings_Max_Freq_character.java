package Assignment;
import java.util.*;
public class strings_Max_Freq_character {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner (System.in);
		String str= sc.next();
		freq_char(str);

	}
	public static void freq_char(String str) {
		int count =1;int ans=0; char ch=0;
		for (int i=0; i<str.length();i++) {
			for (int j=i+1; j<str.length();j++) {
				if (str.charAt(i)==str.charAt(j)) {
					count++;
				}
				
				
			}
			if (ans<count) {
				ans = count;
				ch= str.charAt(i);
				
			}
			count=1;
		}
		System.out.println(ch);
	}

}
