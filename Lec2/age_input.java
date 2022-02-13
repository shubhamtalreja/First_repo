package Lec2;
import java.util.*;

public class age_input {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ab= new Scanner(System.in);
		int age =ab.nextInt();
		if (age>=18) {
			System.out.println("adult");
		}
		else{
			System.out.println("child");
		}

	}

}
