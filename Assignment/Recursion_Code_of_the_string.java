package Assignment;
import java.util.*;
public class Recursion_Code_of_the_string {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		String str= sc.next(); int i=0;
		List<String> list= new ArrayList<>();
		codeofstring(str, "",list);
		System.out.println(list);

	}
	public static void codeofstring(String str,String ans,List<String> list) {
		if(str.length()==0) {
			list.add(ans);
			return;
		}
	 char ch =(char) (48+str.charAt(0));
	 
	codeofstring(str.substring(1), ans+ch,list);
	if(str.length()>=2) {
		String s= str.substring(0,2);
		if(Integer.parseInt(s)<=26) {
			ch= (char)(96+Integer.parseInt(s));
			codeofstring(str.substring(2), ans+ch,list);
		}
	}
	}

}
