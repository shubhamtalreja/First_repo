package Revision3;

public class maxxdiff {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []arr = {1,10,5,2,8,1};
		int maxele=arr[0];
		int minele=arr[0];
for(int i =0;i<arr.length;i++) {
	minele= Math.min(minele, arr[i]);
	maxele = Math.max(maxele,arr[i]);
}
System.out.println(maxele-minele);
	}

}
