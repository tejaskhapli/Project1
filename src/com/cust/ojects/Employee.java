package com.cust.ojects;

import java.util.Comparator;


public class Employee{

	private int age;
	private String name;
	public int getAge() {
		return age;
	}
	public Employee(int age, String name) {
		super();
		this.age = age;
		this.name = name;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Employee [age=" + age + ", name=" + name + "]";
	}
	
	
}
