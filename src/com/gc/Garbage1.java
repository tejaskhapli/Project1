package com.gc;

public class Garbage1 {

	
	// Please Refer - 
	// https://www.geeksforgeeks.org/output-of-java-programs-set-10-garbage-collection/
	// https://www.geeksforgeeks.org/garbage-collection-java/
	
	
	public static void main(String[] args) {
		System.out.println("q");
		Runtime.getRuntime().exit(0);
		
		System.out.println(Runtime.getRuntime() 
        .availableProcessors());
		
		System.out.println("t");
	
	}
}
