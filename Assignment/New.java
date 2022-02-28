package Assignment;

public class New {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] nums= {2,2,1,1,1,2,2,1,2,1};
		System.out.println(count( nums));
		
		
//		for(i=2;i<6;++i) {
//			nums[nums[i]]= nums[i];
//		}
//		for(i=0;i<8;++i) {
//			System.out.println(nums[i]);
//		}
		

	}
	
	public static int count(int [] nums) {
		int finalcount= nums.length/2;
		for(int num : nums) {
			int count=0;
			for(int elem:nums) {
				if (elem==num) {
					count+=1;
				}
				
			}
			if (count>finalcount) {
				return num;
			}
		}
		return -1;
	}
//		if(nums.length==0) {
//			return 0;
//		}
//		int i=0;
//		for(int j=1; j <nums.length;j++) {
//			if(nums[i]==nums[j]) {
//				i++;
//				nums[i]=nums[j];
//			}
//		}
//		return i+1;
//	}

}
