package Assignment;

public class fibo_members {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int n=14;
		 int a=0;
		  int b=1;
		  while(a<n) {
			 int  c=a+b;
			  a=b;
			  b=c;
		  }
		  if(a==n) {
			  System.out.println(true); 
		  }
		  else {
			  System.out.println(false);
		  }

	}

}
