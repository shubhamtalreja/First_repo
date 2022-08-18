package Activity5;
import java.util.*;
public class arrlist {

	public static void main(String[] args) {
		HashSet <ArrayList> set = new HashSet<>();
		ArrayList<Integer> list = new ArrayList<>();
		list.add(5);
		list.add(6);
		list.add(10);
		list.add(4);
		list.add(9);
		
		set.add(list);
		list.add(1);
		System.out.println(list);

	}

}
