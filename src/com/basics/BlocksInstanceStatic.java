package com.basics;



class Student{
	Integer age;
	String name;
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Student(Integer age, String name) {
		System.out.println("Inside Constructor");
		this.age = age;
		this.name = name;
	}
	static {
		System.out.println("Inside Static Block");
		
		/*
		 * int i = 4/0;
		 * System.out.println("Inside Static Block, i = " + i);
		 * 
		 * Above code results into - 
		 *  		Exception in thread "main" java.lang.ExceptionInInitializerError
		 *  		at com.basics.BlocksInstanceStatic.main(BlocksInstanceStatic.java:41) 
		 */
	}
	
	{ 
		System.out.println("Inside Instance Block");
	}
}

public class BlocksInstanceStatic {
	
	
		public static void main(String[] args) {
			Student s1 = new Student(80, "Tejas");
			Student s2 = new Student(80, "Tejas");
			
		}
}
