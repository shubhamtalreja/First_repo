package Assignment;
import java.util.*;
public class permutation_arr_leet {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] str= {1,1,2};
		List<List<Integer>> list2= new ArrayList<>();
		List<Integer> list1= new ArrayList<>();
		boolean [] freq= new boolean[str.length];
		permut(str,list1,list2,freq);
		System.out.println(list2);
		

	}
	public static void permut(int[] str,List<Integer> list1,List<List<Integer>> list2, boolean [] freq ) {
		if(list1.size()==str.length) {
			list2.add(new ArrayList<>(list1));
			return;
		}
		for(int i=0;i<str.length;i++) {
			if(!freq[i]) {
				
				freq[i]=true;
				list1.add(str[i]);
				permut(str,list1,list2,freq);
				freq[i]=false;
				list1.remove(list1.size()-1);
				
			}
			
		
		}
	}

}
