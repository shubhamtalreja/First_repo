package Lec2;
import java.util.*;

public class count {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ct= new Scanner (System.in);
		int n=ct.nextInt();
		int i=1;
		int count= 0;
		
			while (n>0) {
			count =count+1;
			n/=10;
			}
			System.out.println(count);	

		

	}

}
