package streams;
import java.util.*;
import java.util.stream.*;
public class string_len {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list = Arrays.asList("a","hello","world","program","or","examples");
		long sum = list.stream()
				.filter(x -> x.length() > 3)
				.count();
		System.out.println(sum);
		
		

	}

}
