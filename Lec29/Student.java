package Lec29;

public class Student {
	private String name;
	private int age;
	
	
	public void SetName( String name) {
		this.name=name;
	}
	public void SetAge( int  age) throws Exception{
		if(age<0) {
			throw new  Exception("enter valid age");
		}
		this.age=age;
	}
	public String GetName() {
		 return this.name;
	}
	public int  GetAge() {
		 return this.age;
	}

}
