package Assignment;

public class Reverse_string {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="Welcome   to Coding Ninjas";
	System.out.println(reverseString(str));

	}
	public static String reverseString(String str) 
	{

		if (str == null || str.length() == 0) 
		{
			return str;
		}

		StringBuilder ans = new StringBuilder();

		// if the string is " " then return ""
		if (str.length() == 1 && str.charAt(0) == ' ') 
		{
			return ans.toString();
		}

		int start = str.length() - 1;

		while (start >= 0) 
		{

			// Skip multiple spaces
			if (str.charAt(start) == ' ') 
			{
				start--;
			}

			else 
			{

				// Add space between words
				if (ans.length() > 0) 
				{
					ans.append(" ");
				}

				int j = start;

				// Loop for extracting word
				while (j >= 0 && str.charAt(j) != ' ') 
				{
					j--;
				}

				// add current word to ans
				ans.append(str.substring(j + 1, start + 1));
				start = j;
			}
		}

		return ans.toString();
	}

}
