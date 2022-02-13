package Lec21;
import java.util.*;
public class permutation {
static List<String> ll=  new ArrayList<>();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "AAB";
		
		print_permuataion(str, " ",ll);
		System.out.println(ll);

	}
	public static void print_permuataion(String ques, String ans,List<String> ll) {// abcde
		// TODO Auto-generated method stub
		if (ques.length() == 0) {
			ll.add(ans);
			
//			System.out.print(ans);
			return;
		}

		for (int i = 0; i < ques.length(); i++) {// i=1 abde ch -->c
			
			char ch = ques.charAt(i);
			
			String ros = ques.substring(0, i) + ques.substring(i + 1);
			print_permuataion(ros, ans + ch +" ",ll);
			

		}

	}

}
