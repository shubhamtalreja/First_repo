package Assignment;

public class Max_subarray_leetcode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr = {-100,-98,-1,2,3,4};  
		int left=1;
		int right=1; int max= Integer.MIN_VALUE;
		for(int i=0;i<arr.length;i++) {
			left *= arr[i];
			right *= arr[arr.length-i-1];
			
			if(max<left || max<right) {
				max = Math.max(left, right);
			}
			if(arr[i]==0) {
				left=1;
			}
			if(arr[arr.length-i-1]==0) {
				right=1;
			}
		}
		System.out.println(max);
	}
}
        