package Assignment;
import java.util.*;
public class Nthtraingle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner (System.in);
		int N=sc.nextInt();
        System.out.println(nthtriangle( N));
    }
    public static int nthtriangle(int N){
        if (N==1){
            return 1;
        }
        else {
        	System.out.println(N);
            return nthtriangle(N-1)+N;
        }
    }
}