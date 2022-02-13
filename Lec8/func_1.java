package Lec8;

public class func_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sb=8;
		int num=33;
		int db=2;
		int newnum=Any_to_10( sb,  num);
		dec_to_Any( db, newnum);
		System.out.println(dec_to_Any( db, newnum));
		
		
	}
	public static int Any_to_10(int sb, int num) {
		int ans =0;
		sb=1;
		while(num>0) {
			int rem=num%10;
			ans= ans+rem*sb;
			sb*=8;num/=10;
			
			
		}
		return ans;
				
	}
	public static int dec_to_Any(int db, int newnum) {
		int ans=0;
		int mul=1;
		while(newnum>0) {
			int rem=newnum%db;
			ans=ans+rem*mul;
			mul*=10;newnum/=db;
		}
		return ans;
		
	}

}
