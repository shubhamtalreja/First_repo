package Revision3;

public class countchar {

	public static void main(String[] args) {
		String s= "rajasoftwarelabs";
		int b=0;
		int f=0;
		int j=0;
		int p=0;
		int v=0;
		for(int i=0; i<s.length();i++) {
			if(s.charAt(i)=='b' || s.charAt(i)=='B') {
				b++;
			}
			else if(s.charAt(i)=='f' || s.charAt(i)=='F') {
				f++;
			}
			else if(s.charAt(i)=='j' || s.charAt(i)=='J') {
				j++;
			}
			else if(s.charAt(i)=='p' || s.charAt(i)=='P') {
				p++;
			}
			else if(s.charAt(i)=='v' || s.charAt(i)=='V') {
				v++;
			}
		}
		if(b !=0) {
			System.out.println("b="+b);
		}
		if(f !=0) {
			System.out.println("f="+f);
		}
		if(j !=0) {
			System.out.println("j="+j);
		}
		if(v !=0) {
			System.out.println("v="+v);
		}
		if(p !=0) {
			System.out.println("p="+p);
		}
		
		System.out.println("other =" +(s.length()-b-j-f-v-p));
		
		
    }
}