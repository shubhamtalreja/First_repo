package Lec30;

public class Student {
	String name ;
	int age;
	
	public Student () {
		this.name="Rahul";
		this.age=25;
		
	}
	
	@Override
	public String toString() {
		return this.age +" and "+ this.name;
	}

}
