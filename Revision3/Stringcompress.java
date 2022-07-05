package Revision3;

public class Stringcompress {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str ="abcd";
		StringBuilder sb = new StringBuilder();
		char prev= str.charAt(0);
		int i=1;
		int count=1;
		
		while(i<str.length()) {
			char curr= str.charAt(i);
			if(prev==curr) {
				count++;
			}
			else {
				sb.append(prev);
				sb.append(count);
				prev= curr;
				count=1;
			}
			i++;
		}
		sb.append(prev);
		sb.append(count);
		if(str.length()<sb.length()) {
			System.out.println(str);
		}
		else {
			System.out.println(sb.toString());
		}

	}

}
