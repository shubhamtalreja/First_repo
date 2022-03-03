package Assignment;

public class Leao_year {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int N=4;
		if (N % 400 == 0) {
			System.out.println("1");
		}
            
    
        // Else If a year is multiple of 100,
        // then it is not a leap year
        if (N % 100 == 0) {
        	System.out.println("0");
        	
        }
            
    
        // Else If a year is multiple of 4,
        // then it is a leap year
        if (N % 4 == 0) {
        	 System.out.println("1");
        	
        }
//        System.out.println("0");
          

	}


}
