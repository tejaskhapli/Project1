package com.basics;

class Employee{
	Integer age;
	String name;
	
	public void setAge(Integer age) {
		this.age = age;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getAge() {
		return age;
	}
	public String getName() {
		return name;
	}
	
	public Employee(Integer age, String name) {
		this.age = age;
		this.name = name;
	}
}

public class PassByValueReference {

	public static void main(String[] args) {
		
		Employee e1 = new Employee(26, "Abhishek");
		Employee e2 = new Employee(25, "Tejas");
		
		//swap(e1, e2);
		
		changename(e1, e2);
		
		//reassign(e1, e2);
		
		System.out.println("E1.NAME - "+ e1.getName());
		System.out.println("E2.NAME - "+ e2.getName());

	}

	private static void reassign(Employee e1, Employee e2) {
		e1 = new Employee(26, "Parimal");
		e2 = new Employee(25, "Devesh");
	}

	private static void changename(Employee e1, Employee e2) {
		e1.setName("Abhishek Changed");
		e2.setName("Tejas Changed");
	}

	private static void swap(Employee e1, Employee e2) {
		Employee temp;
		temp = e1;
		e1 = e2;
		e2 = temp;
	}	
}
