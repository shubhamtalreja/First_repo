package Lec23;

public class Coin_Permutaion {

	public static void main(String[] args) {
		int[] coin = { 10,1,2,7,6,1,5};
		int amount = 8;
		CoinPermutation(coin, amount, "");

	}

	public static void CoinPermutation(int[] coin, int amount, String ans) {
		if (amount == 0) {
			System.out.println(ans);
			return;
		}

		for (int i = 0; i < coin.length; i++) {
			if (amount >= coin[i]) {

				CoinPermutation(coin, amount - coin[i], ans + coin[i]);

			}

		}

	}

}