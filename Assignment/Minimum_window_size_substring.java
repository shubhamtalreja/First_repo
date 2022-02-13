package Assignment;

import java.util.*;

public class Minimum_window_size_substring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		String str1 = sc.next();
		System.out.println(countfreq(str, str1));

	}

	public static String countfreq(String s, String t) {
		int count = 0;
		int si = 0;
		int min = Integer.MAX_VALUE;
		int[] freqs = new int[256];
		int[] freqt = new int[256];
		int start = -1;

		for (int i = 0; i < t.length(); i++) {
			freqt[t.charAt(i)]++;
		}
		for (int i = 0; i < s.length(); i++) {
			freqs[s.charAt(i)]++;
			char ch = s.charAt(i);

			if (freqs[ch] <= freqt[ch]) {
				count++;
			}
			if (count == t.length()) {
				while ( freqs[s.charAt(si)] > freqt[s.charAt(si)]) {
					freqs[s.charAt(si)]--;

					si++;

				}
				if (min > i - si + 1) {
					min = i - si + 1;
					start = si;
				}
			}
		}
		if (start == -1) {
			return "";
		}

		return s.substring(start, start + min);

	}
}
