package Lec2;
import java.util.*;

public class marks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner mk= new Scanner(System.in);
	int marks= mk.nextInt();
	if (marks>=70) {
		System.out.println("A");
	}
	else if (marks>=60 && marks<70){
		System.out.println("B");
	}
	else if (marks>=50 && marks<60){
		System.out.println("c");
	}
	else if (marks>=40 && marks<50){
		System.out.println("d");
	}
	else {
		System.out.println("fail");
	}
	

	}

}
