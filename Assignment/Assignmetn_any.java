package Assignment;
import java.util.*;

public class Assignmetn_any {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner (System.in);
		int n1=sc.nextInt();
		int n2=sc.nextInt();
		series( n1,  n2);
		
		
		}
	public static void series(int n1, int n2) {
		int ans=0;int count=0;
		int i =1;
		while (true) {
			ans =3*i+2;
			if (ans%n2 !=0) {
				System.out.println(ans);
				count++;
			}
			if(count==n1) {
				break;
			}
			i++;
		}
			
			

		
	
	}
}
