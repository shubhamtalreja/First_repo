package Revision3;

public class arraysum {

	public static void main(String[] args) {
		int []arr = {1, 14, 5, 7};
		int sum=0;
		for(int i =0;i<arr.length;i++) {
		if(prime(arr[i])==false) {
			sum+=arr[i];
			
		}
		}
		if(sum>0) {
			System.out.println(sum);
		}
		else {
			sum=0;
			System.out.println(sum);
		}
	}

	private static boolean prime(int n) {
		int i=2;
		int flag=0;
		if(n==1) {
			return false;
		}
		while(i<n) {
			
			if(n%i==0) {
				flag++;
			}
			i++;
		}
		if(flag==0) {
			return true;
		}
		else {
			return false;
		}
	}

}
