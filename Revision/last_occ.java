package Revision;

public class last_occ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr= {2,5,6,4,5,2,6,5};
		int item=2;
		System.out.println(lastocc(arr,item,arr.length-1));

	}
	public static int lastocc(int [] arr,int item,int i) {
		if(i<0) {
			return -1;
		}
		if(arr[i]==item) {
			return i;
		}
		return lastocc( arr, item, i-1);
	}

}
