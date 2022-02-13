package Assignment;
import java.util.*;

public class shopping_game {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner (System.in);
		int n=sc.nextInt();
		while (n-->0) {
			int ayushcap=sc.nextInt();
			int harshitcap=sc.nextInt();
			game( ayushcap,  harshitcap);
		
			
		}
	}
		public static void game(int ayushcap, int harshitcap) {
		int ayushsum=0;
		int harshitsum=0;
		int val=1;
			while(true) {
				ayushsum+=val;
			if (ayushsum>ayushcap) {
				System.out.println("harshit");
				break;
				
			}
			val++;
			harshitsum+=val;
			
			 if (harshitsum>harshitcap) {
				System.out.println("ayush");
				break;
			}
			val++;
			}		
		
		}
	
		
}
