package Lec11;

public class Gas_station_leet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []gas = {1,2,3,4,5};
		int [] cost= {3,4,5,1,2};
System.out.println(gas_station(gas,  cost));
	}
	public static int gas_station(int []gas, int [] cost) {
		int total=0;
		int current=0;
		int start=0;
		for (int i=0; i<cost.length; i++) {
			total +=(gas[i]-cost[i]);
			current +=(gas[i]-cost[i]);
			if (current<0) {
				start = i+1;
				current=0;
				
				
			}
		}
			if(total<0) {
				return -1;
				
			}
			
		
		return start;
	}

}
