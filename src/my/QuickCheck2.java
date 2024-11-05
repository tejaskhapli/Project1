package my;
//https://www.besanttechnologies.com/oracle-interview-questions-and-answers#
class Employee{

	int age;
	String name;
		
	public Employee(int age, String name) {
		//this();
		this.age = age;
		this.name = name;
		System.out.println("Indside Parametrized constructor");
	}
	public Employee() {
		this(49, "Dhanesh");
		this.age = 0;
		this.name = null;
		//Employee(19, "Dhanesh");
		System.out.println("Inside Default constructor");
		
	}

	
}

public class QuickCheck2 {
	public static void main(String[] args) {
		//Employee e = new Employee();
		//System.out.println(e.age);
		//System.out.println(e.name);
		
	
		
	}
}
