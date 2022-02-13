package Assignment;
import java.util.*;
public class sorting_linear_time {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[N];
        for(int i = 0 ;i <arr.length;i++){
            arr[i]= sc.nextInt();
        }
        Sort(arr);
        for( int val: arr){
            System.out.print(val);
        }
    }
public static void Sort(int [] arr) {
       int pt1 = 0 ;
       int pt2 = arr.length-1 ;
       int pt0 = 0;	
       int temp;
	while(pt1<=pt2){
        if(arr[pt1]==0){
            temp = arr[pt1];
            arr[pt1] = arr[pt0];
            arr[pt0]=temp;
            pt0++;
            pt1++;
        }
        else if (arr[pt1]==2){
            temp = arr[pt1];
            arr[pt1] =arr[pt2];
            arr[pt2] = temp;
            pt2--;
        }
        else{
            pt1++;
        }
    }
	}
}
