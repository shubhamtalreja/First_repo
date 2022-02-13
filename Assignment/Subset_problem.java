package Assignment;
import java.util.*;
public class Subset_problem {
static int count =0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt(); int ans=0;
		int [] arr = new int[n];
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		int target=sc.nextInt();
		subset( arr,target,ans,0,"");
		System.out.println();
		System.out.println(count);

	}
	public static void subset(int [] arr,int target, int ans,int i,String str) {
		if (i==arr.length) {
			
				if(ans==target) {
					System.out.print(str+" ");
					count++;
				}
			return;
			
		}
		subset(arr, target, ans+arr[i],i+1,str+arr[i]+" ");
		subset(arr, target, ans, i+1,str);
	}

}
