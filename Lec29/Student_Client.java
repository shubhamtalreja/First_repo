package Lec29;
import java.util.*;
public class Student_Client {

	public static void main(String[] args) throws Exception{
		Student s= new Student();
		
		s.SetName("Rahul");
		s.SetAge(28);
		System.out.println(s.GetAge());
		System.out.println(s.GetName());

	}

}
