package Assignment;

public class count_aphanumeric {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="A stream of characters terminated by $";

	int alpha=0;
	int space=0;
	int numb=0;
	 
	for (int i=0;i<str.length();i++) {
		if(str.charAt(i)>='a' && str.charAt(i)<='z') {
			alpha++;
		}
		if (str.charAt(i)>='0' && str.charAt(i)<='9') {
			numb++;
		}
		if(str.charAt(i) ==' ') {
			space++;
		}
		
		
		if(str.charAt(i)=='$') {
			break;
		}
	}
	System.out.println(alpha +" "+space+" "+numb);
	}
}
