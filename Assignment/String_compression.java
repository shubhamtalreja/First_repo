package Assignment;
import java.util.*;
public class String_compression {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String str= sc.next();
		string_compression(str);

	}
	public static void string_compression(String str) {
		int count=1;
		for(int i=1;i<str.length();i++) {
			
			if (str.charAt(i-1)!=str.charAt(i)) {
				System.out.print(str.charAt(i-1));
				if (count>1) {
					System.out.print(count);
				}
				
			    count=1;
			}
			else {
				count++;
			}
		}
		System.out.print(str.charAt(str.length()-1));
		if (count>1) {
			System.out.print(count);
		}
	}

}
