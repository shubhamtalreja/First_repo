package Revision3;
import java.util.*;
import java.lang.*;
import java.io.*;
public class relevel {


	static int ans =0;
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int S= sc.nextInt();
		int D = sc.nextInt();
		System.out.println(no_of_steps(S, D));

		}
		public static int no_of_steps(int S,int D){
			if (S == D){
				return 1;
			}
			if(S>D){
				return 0;
			}
			int steps=1;
			
//			for( steps<=3 ; steps++){
			steps++;
				 ans+= no_of_steps(S + steps , D)+1;

//			}
			return ans;
		}

}
