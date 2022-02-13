package Lec15;
import java.util.*;
public class Arrays_Sorting {

	public static void main(String[] args) {
		int [] arr = {10,2,8,-10,7};
		Arrays.sort(arr);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}

}
