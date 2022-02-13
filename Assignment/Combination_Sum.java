package Assignment;
import java.util.*;
public class Combination_Sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<List<Integer>> list2= new ArrayList<>();
		List<Integer> list1= new ArrayList<>();
		int [] coin = {1,2,3}; int ans=0;
		int amount= 7; int ind=1;
		combisum(coin, amount,  list1, list2, ind);
		System.out.println(list2);

	}
	public static void combisum(int [] coin, int amount,List<Integer> list1,List<List<Integer>> list2, int ind ) {
		if (amount==0) {
			list2.add(new ArrayList<>(list1));
			
			return;
		}
		for (int i =ind; i<coin.length;i++) {
			if(amount>=coin[i] ) {
//				amount -=coin[i]
				list1.add(coin[i]);
						combisum(coin,amount - coin[i], list1,list2,i);
						list1.remove(list1.size()-1);
			}
			
		}
	}

}
