package Lec12;

public class max_subarray_twoloop {

	public static void main(String[] args) {
		int[] arr = { 2, 7, -19, 11, -17, 4 };
		System.out.println(SUbarray(arr));

	}
	public static int SUbarray(int[] arr) {
        int maxsum=Integer.MIN_VALUE;
		for (int i = 0; i < arr.length; i++) {
			int sum=0;
			for (int j = i; j < arr.length; j++) {
				
                    sum+=arr[j];
				maxsum=Math.max(maxsum, sum);
			}

		}
		return maxsum;
	}

}
