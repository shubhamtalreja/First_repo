package Assignment;

public class valid_paranthesis {

	public static void main(String[] args) {
		// TODO Auto-generated method stub]
		String str= "()[]{}";
		System.out.println(validparan(str));

	}
	 public static boolean validparan(String str) {
		 for(int i=0; i<str.length();i++) {
			 if (str.charAt(i)=='(' && str.charAt(i+1)==')') {
				 i++;
			 }
		 }
		 return true;
	 }

}
