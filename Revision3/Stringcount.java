package Revision3;

public class Stringcount {

	public static void main(String[] args) {
		isLeapYear(2007);
	}
	public static void isLeapYear(int year)
    {
        // flag to take a non-leap year by default
        boolean is_leap_year = false;
 
        if (year % 4 == 0) {
          is_leap_year = true;
            
            if (year % 100 == 0) {
                
                if (year % 400 == 0) {
                    is_leap_year = true;
                }
                else {
                    is_leap_year = false;
                }
            }
        }
        
        else {
            is_leap_year = false;
        }
        if (!is_leap_year) {
            System.out.println(year + " : Non Leap-year");
        }
        else {
            System.out.println(year + " : Leap-year");
        }
    }

}
