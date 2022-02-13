package Lec19;
import java.util.*;
public class SubSequnce {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner (System.in);
		String str=sc.next();
 
		
		Subsequnce(str, "");
		System.out.println();
		System.out.println(Subsequncount(str, ""));
	}
	public static void Subsequnce(String ques, String ans) {

		if (ques.length() == 0) {
			System.out.print(ans+ " ");
			return;
		}

		char ch = ques.charAt(0);// a
		Subsequnce(ques.substring(1), ans);// no
		Subsequnce(ques.substring(1), ans + ch);// yes

	}

	public static int Subsequncount(String ques, String ans) {

		if (ques.length() == 0) {

			return 1;
		}

		char ch = ques.charAt(0);// a
		int no = Subsequncount(ques.substring(1), ans);// no
		int yes = Subsequncount(ques.substring(1), ans + ch);// yes
		return no + yes;

	}

}

