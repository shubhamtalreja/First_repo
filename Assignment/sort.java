package Assignment;

public class sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []arr = {1,2,5,8,2,6,5,5,9,10};
		sort(arr);
		for (int i=0;i<arr.length;i++) {
			System.out.println(arr[i]+ " ");
		}

	}
	public static void sort(int []arr ) {
		for (int p=1;p<arr.length;p++) {
			for (int i=0;i<arr.length-p;i++) {
				if (arr[i]>arr[i+1]) {
					int t= arr[i];
					arr[i]=arr[i+1];
					arr[i+1]=t;
				}
			}
		}
		
	}

}
