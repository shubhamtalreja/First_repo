package Assignment;
import java.util.*;
public class Alex_Goes_Shopping {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int []arr = new int [n];
		for (int i =0; i<n;i++) {
			arr[i]= sc.nextInt();
		}
		int k=sc.nextInt();
		while(k>0) {
			int a=sc.nextInt();
			int b=sc.nextInt();
			int count=0;
			for (int i = 0; i < arr.length; i++) {
				if(a%arr[i]==0) {
					count++;
//					System.out.println(count);
					
				
			}
				
			
			
		}
		
			if (count>=b) {
				System.out.println("Yes");
			}
			else {
				System.out.println("No");
			}
		       k--;

		}
		
		

}
}
