package Lec23;
import java.util.*;
public class Coin_Combination {

	public static void main(String[] args) {
		int[] coin = {2,2,6};
		List<String> list= new ArrayList<>();
		List<List<String>> newans = new ArrayList<>();
		int amount = 7;
		CoinCombination(coin, amount, "", 0,list, newans);
		System.out.println(newans);

	}

	public static void CoinCombination(int[] coin, int amount, String ans, int idx, List<String> list,List<List<String>> newans) {
		if (amount == 0) {
			list.add(ans);
			newans.add(new ArrayList<>(list));
			list.remove(list.size()-1);
			return;
		}

		for (int i = idx; i < coin.length; i++) {
			if (amount >= coin[i]) {

				CoinCombination(coin, amount - coin[i], ans + coin[i], i,list,newans);
				

			}

		}

	}

}
