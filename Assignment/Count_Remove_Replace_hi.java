package Assignment;
import java.util.*;
public class Count_Remove_Replace_hi {
static int count1 = 0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		String str= sc.next();
		count(str);
		System.out.println(remove(str));
		System.out.println(replace(str));
		

	}
	public static int count(String str) {
		if (str.length()<=0) {
			System.out.println(count1);
			return 1;
		}
		if (str.charAt(0)=='h' && str.charAt(1)=='i') {
			count1++;
			return count(str.substring(2, str.length()));
		
		}
		return count(str.substring(1, str.length()));
		
	}
	public static String remove(String str) {
		if(str.length()<=1) {
			return str;
		}
		if(str.charAt(0)=='h' && str.charAt(1)=='i') {
			return remove(str.substring(2, str.length()));
		}
		return str.charAt(0) + remove(str.substring(1, str.length()));	
	}
	public static String replace(String str) {
		if(str.length()<=0) {
			return str;
		}
		if(str.charAt(0)=='h' && str.charAt(1)=='i') {
			return replace("bye"+str.substring(2, str.length()));
		}
		return str.charAt(0) + replace(str.substring(1, str.length()));	
		
	}

}
