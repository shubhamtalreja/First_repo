package Lec11;

public class Selection_sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []arr = {4,19,6,7,9};
		Sort(arr); 
	}
	public static void Sort(int[] arr) {

		for (int i = 0; i < arr.length; i++) {
			int min = i;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[j] < arr[min]) {
					min = j;
				}
			}
			int temp = arr[min];
			arr[min] = arr[i];
			arr[i] = temp;

		}
		for (int i=0; i<arr.length; i++) {
			System.out.print(arr[i]+ " ");
		}

	}

}
