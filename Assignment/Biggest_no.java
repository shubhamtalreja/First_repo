package Assignment;
import java.util.*;
public class Biggest_no {

	public static void main(String[] args) {
		Scanner sc= new Scanner (System.in);
        int t=sc.nextInt();int i=0;
        while(i<t){
            int n=sc.nextInt();
            int []arr = new int [n];
            for(int j=0;j<arr.length;j++){
                arr[j]=sc.nextInt();
            }
            i++;
            findBig( arr);
        }
        
    }

    public static void findBig(int[] arr) {
        String ans = "";
        for (int j = 1; j < arr.length; j++) {
            for (int i = 0; i < arr.length - j; i++) {
                if (big(arr[i],arr[i+1]) >0) {
                    int t = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = t;
                }
        }
        }
         for (int i = arr.length-1; i>=0 ; i--) {
            ans += arr[i];
        }
        System.out.println(ans);
        }
 public static long big(int val1, int val2){
String s1 = "" ;
String s2 = "" ;
s1+=val1;
s2+=val2;
String e1 = s1+s2;
String e2 = s2 +s1;
long a1 = Long.parseLong(e1);
long a2 = Long.parseLong(e2);
return a1-a2;
}
}
