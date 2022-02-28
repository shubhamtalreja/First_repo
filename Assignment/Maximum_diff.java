package Assignment;

public class Maximum_diff {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr = {1,1,1,1,1,1};
		
	int max= -1;
	int min= 10*9;
	for(int i=0;i<arr.length;i++) {
		if(arr[i]>max) {
			max= arr[i];
		}
		if(arr[i]<min) {
			min = arr[i];
		}
	}
	if((max-min)%2==0) {
		System.out.println("EVEN");
	}
	else {
		System.out.println("ODD");
	}

	}

}
