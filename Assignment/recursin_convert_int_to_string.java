package Assignment;
import java.util.*;
public class recursin_convert_int_to_string {
static int ans=0;
	public static void main(String[] args) {
		Scanner sc= new Scanner (System.in);
        String str=sc.next();	
        System.out.println(string_to_int(str,ans));
        
    }
  
    public static int string_to_int(String str,int ans){
    
    		if (str.length()==0){

            return ans;
        }
        int ch= str.charAt(0)- 48;
//        System.out.println(ch);
//        System.out.println(ans);
        
        return string_to_int(str.substring(1),ans*10+ch);
        
    }
}