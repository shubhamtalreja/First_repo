package Revision_2;

public class climbing_stairs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int curr=0;
		int dis=3;
		System.out.println(no_of_ways(curr, dis));
		

	}
	public static int no_of_ways(int curr, int dis) {
		if(curr==dis) {
			return 1;
		}
		if(curr>dis) {
			return 0;
		}
		
		
		int s1=no_of_ways(curr+1, dis);
		int s2=no_of_ways(curr+2, dis);
//		int s3=no_of_ways(curr+3, dis);
		return s1+s2;

	}

}
