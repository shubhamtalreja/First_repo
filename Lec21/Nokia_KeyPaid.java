package Lec21;

public class Nokia_KeyPaid {
	static int count=0;
	static String[] key = { "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wx", "yz" };
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "189";
		//System.out.println();
		kpc(str, "");
		System.out.println();
		System.out.println(count);

	}
	public static void kpc(String ques, String ans) {
		if(ques.length()==0) {
			System.out.print(ans+" ");count++;
			return;
		}

		char ch = ques.charAt(0);// char
		String keyString = key[ch-48];// abc
		for (int i = 0; i < keyString.length(); i++) {
			kpc(ques.substring(1), ans+keyString.charAt(i));

		}

	}


}
 