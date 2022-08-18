package Activity5;
import java.util.*;
public class unique {

	public static void main(String[] args) {
		HashSet <Integer> uniq = new LinkedHashSet<>();
		
		uniq.add(5);
		uniq.add(5);
		uniq.add(9);
		uniq.add(11);
		uniq.add(7);
		uniq.add(7);
		System.out.println(uniq);

	}

}
