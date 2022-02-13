package Assignment;
import java.util.*;

public class Asign1 {

	public static void main(String[] args){
		Scanner sc =new Scanner(System.in);
	    int n=sc.nextInt();
	    int c=2*n-1;
	    int val=1;
	    int r=c/2;
	    int q=1;
	    for(int i=1;i<=c;i++){
	      for(int j=1;j<=r;j++){
	        System.out.print("  ");
	      }
	      int temp=val;
	      for(int j=1;j<=q;j++){
	        System.out.print(temp+" ");
	        if(j<=q/2){
	          temp++;
	        }else{
	          temp--;
	          }
	        
	      }
	      if(i<=c/2){
	        r--;
	        q+=2;
	        val++;
	      }else{
	        val--;
	        r++;
	       q-=2;
	        }
	        System.out.println();
	      
	      
	      
	    }
	    
		
	}

}
