package com.basics;

public class BitwiseOperators {

	public static void main(String[] args) {
		
		int i = 6 & 5;
		System.out.println(i);
		int j = 11 | 13;
		System.out.println(j);
/*		
		1011
		1101
		1111
		1001*/
		// compiler error operator && is not defined for int int
		//boolean i2 = 5 && 3;
		
		boolean i1 = true && false;
	}
	
}
