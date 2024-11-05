package com.basics;

class Base{
	Base(){
		System.out.println("Base Constructor");
	}
	static{
		System.out.println("Base static block 1");
	}
	static{
		System.out.println("Base static block 2");
	}
	{
		System.out.println("Base instance block 1");
	}
	{
		System.out.println("Base instance block 2");
	}
}

class Derived extends Base{
	Derived(){
		System.out.println("Derived Constructor");
	}
	static{
		System.out.println("Derived static block 1");
	}
	static{
		System.out.println("Derived static block 2");
	}
	{
		System.out.println("Derived instance block 1");
	}
	{
		System.out.println("Derived instance block 2");
	}
}

public class BlocksInstanceStaticWithInheritance {

	public static void main(String[] args) {
		
		
		/*Base b = new Base();
		System.out.println("\n");*/
		Derived derived = new Derived();
		System.out.println("\n");
		
		//Derived derived2 = new Derived();
		//System.out.println("\n");

		//Base baseMixed = new Derived();
	}
	
}
