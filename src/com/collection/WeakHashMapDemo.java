package com.collection;

import java.util.WeakHashMap;

class EmployeeDemo{
	int id;
	String name;
	public EmployeeDemo(int id, String name) {
		this.id = id;
		this.name = name;
	}
	@Override
	public String toString() {
	
		return this.name;
	}
}

public class WeakHashMapDemo {

	public static void main(String[] args) {
		WeakHashMap<EmployeeDemo, Integer> weakmap = new WeakHashMap<>();
		
		EmployeeDemo thirdEmployee = new EmployeeDemo(3, "Tejas3");
		
		weakmap.put(new EmployeeDemo(1, "Tejas1"),  1);
		weakmap.put(new EmployeeDemo(2, "Tejas2"),  2);
		weakmap.put(thirdEmployee,  3);
		weakmap.put(new EmployeeDemo(4, "Tejas4"),  4);
		
		System.out.println("Before GC");
		weakmap.entrySet().stream().forEach(System.out::println);
	
		System.gc();
		
		System.out.println("After GC");
		weakmap.entrySet().stream().forEach(System.out::println);
	}
	
	
}
