package com.basics;

/*
 * 
 * NoClassDefFoundError is an error which is thrown when Java Runtime System tries to load the definition of a class 
 * and class definition is no longer available. 
 * The required class definition was present at compile time but it was missing at run time. 
 * 
 * Delete temporarily A1.class and run NoClassDefFoundDemo to get NoClassDefFoundError.
 * 
 * */

class A1
{
 
}

public class NoClassDefFoundDemo {
	 public static void main(String[] args)
	    {
	        A1 a = new A1();
	        System.out.println("Executing Main");
	    }
}
