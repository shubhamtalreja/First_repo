package Revision3;

public class charcount {
static int index=0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str ="geeksforgeeks";
		count(str);
			System.out.println(str.charAt(index));
		
		
	}
		public static int count(String str) {
		int []freq = new int [256];
		
		
		for(int i =0; i<str.length(); i++) {
			freq[str.charAt(i)]++;
		}
		for(int i =0; i<str.length(); i++) {
			if(freq[str.charAt(i)]==1) {
			 index =i;
				break;
			}
		}
		
		return index;

	}

}
