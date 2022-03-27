package Lec35;

public class Binary_Tree_Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Binary_tree bt = new Binary_tree();
		bt.dispaly();
		System.out.println(bt.find(90));
		System.out.println(bt.min());
		bt.size();
		bt.PreOrder();
		bt.InOrder();
		bt.PostOrder();
		//10 true 2 true 7 false false true 18 false false true 50 true 90 false true 17 false false false


	}

}
