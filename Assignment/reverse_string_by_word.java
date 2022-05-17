package Assignment;
import java.util.*;
public class reverse_string_by_word {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
         
        String inputString = sc.nextLine();
         
        String outputString = reverseTheSentence(inputString);
                  
        System.out.println("Output String : "+outputString);
        
	}
	public static String reverseTheSentence(String inputString)
    {
        String[] words = inputString.split("\\s");
         
        String outputString = "";
         
        for (int i = words.length-1; i >= 0; i--)
        {
            outputString = outputString + words[i] + " ";
        }
         
        return outputString;
    }
		
}
