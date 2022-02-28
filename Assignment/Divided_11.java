package Assignment;

public class Divided_11 {
	
	public static void main(String []args) {
		String str="1331231";
		divide(str);
		 
	}
		public static void divide( String str) {
			
			int ans =0; 
			for (int i =0; i<str.length();i++) {
				int ch = str.charAt(i)-48;
				
				 ans = (ans *10 +ch)%11;
			}
			
System.out.println(ans);
			 
		}
	


}
