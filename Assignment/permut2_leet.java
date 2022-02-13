package Assignment;
import java.util.*;
public class permut2_leet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] nums= {1,2,3}; int ind=0;
		List<Integer> list1= new ArrayList<>();
		List<List<Integer>> list2= new ArrayList<>();
		permut2(ind,nums, list1, list2);
		System.out.println(list2);

	}
	public static void permut2(int ind,int [] nums,List<Integer> list1,List<List<Integer>> list2 ) {
	
		if(ind == nums.length) {
			
			for (int i=0;i<nums.length;i++) {
				
			list1.add(nums[i]);
			
			}
			
			list2.add(list1);
	
			return;
		}
		for(int i =ind; i<nums.length;i++) {
			
			swap(i,ind,nums);
			
			permut2( ind+1,nums, list1, list2);
			
			swap(i,ind,nums);
			list1.remove(list1.size()-1);
			
		}
		
		
	}
	public static void swap( int i , int j,int [] nums) {
		int t= nums[i];
		nums[i]=nums[j];
		nums[j]=t;
		
	}

}
