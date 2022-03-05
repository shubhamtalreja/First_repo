package Assignment;

import java.util.Scanner;

public class subseq_ascii {
static int count =0;
	public static void main(String[] args) {
		Scanner sc= new Scanner (System.in);
		String str=sc.next();
 

//		System.out.println();
		Subsequnce(str, "");
		System.out.println();
		System.out.println(count);
	}
	public static void Subsequnce(String ques, String ans) {

		if (ques.length() == 0) {
			System.out.print(ans+ " ");
			count++;
			return;
		}

		char ch = ques.charAt(0);// a
		Subsequnce(ques.substring(1), ans);// no
		Subsequnce(ques.substring(1), ans + ch);// yes
		int chh= (int)(ch);
		Subsequnce(ques.substring(1),ans+chh  );// yes


	}
}