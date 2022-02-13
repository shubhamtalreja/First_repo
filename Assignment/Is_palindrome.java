package Assignment;
import java.util.*;
public class Is_palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);

		 String str =sc.next();
        System.out.println(isPalindrome(str));
   }
   public static int isPalindrome(String str){
       int i=0;int ans=0;
       int j= str.length()-1;int count=0;
       while(i<j){
           if (str.charAt(i)!=str.charAt(j)){
               count++;
               ans=count;
           }
           i++;
           j--;
       }
       return ans;
   }
}