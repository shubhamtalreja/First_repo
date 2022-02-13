package Assignment;

public class Generate_Binary_Strings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input = "1??0?101";
        char[] str = input.toCharArray();
        print(str, 0);
		}
	public static void print(char str[], int index) {
		{
	        if (index == str.length)
	        {
	            System.out.println(str);
	            return;
	        }
	 
	        if (str[index] == '?')
	        {
	            // replace '?' by '0' and recurse
	            str[index] = '0';
	            print(str, index + 1);
	             
	            // replace '?' by '1' and recurse
	            str[index] = '1';
	            print(str, index + 1);
	             
	            // NOTE: Need to backtrack as string
	            // is passed by reference to the
	            // function
	            str[index] = '?';
	        }
	        else
	            print(str, index + 1);
	    }
	}
}
	 