package Assignment;

public class leet_roman_to_int {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str= "MCMXCIV";int sum=0;
		roman_toint(str,sum);

	}
	public static void roman_toint(String str,int num){
		 int ans = 0;
	        for (int i = str.length()-1; i >= 0; i--) {
	            switch(str.charAt(i)) {
	                case 'I': num = 1; break;
	                case 'V': num = 5; break;
	                case 'X': num = 10; break;
	                case 'L': num = 50; break;
	                case 'C': num = 100; break;
	                case 'D': num = 500; break;
	                case 'M': num = 1000; break;
	            }
	            if (4 * num < ans) ans -= num;
	            else ans += num;
	        }
	        System.out.println(ans);;
	    }
	}
