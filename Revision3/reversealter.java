package Revision3;

public class reversealter {

	public static void main(String[] args) {
		String str = "i.like.this.program.very.much";
		String word ="";
		String ans="";
		for(int i=str.length()-1;i>=0;i--) {
			if(str.charAt(i)=='.') {
				ans ='.'+ word +ans;
				word="";
			}
			else {
				word +=str.charAt(i);
//				System.out.println(ans);

			}
		}
		ans = word + ans;
		System.out.println(ans);

	}

}
