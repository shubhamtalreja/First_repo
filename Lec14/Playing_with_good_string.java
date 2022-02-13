package Lec14;
import java.util.*;
public class Playing_with_good_string {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s=sc.next();
		System.out.println(GoodString(s));

	}

	public static int GoodString(String str) {
		int ans = 0;
		for (int i = 0; i < str.length(); i++) {

			char ch = str.charAt(i);
			if (isVowels(ch) == true) {
				int count = 0;

				while (i<str.length() && isVowels(str.charAt(i)) == true) {
					count++;
					i++;

				}
				ans=Math.max(ans, count);

			}

		}
		return ans;
	}

	public static boolean isVowels(char ch) {
		if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
			return true;
		}
		return false;
	}

}
