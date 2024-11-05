package com.inheritance;

class Base1{
	int i = 6;
	String j = "BaseString";
	static int staticIntA = 9;	
	public Base1() {
	}
	void argSeqTest(int i, String j){
		System.out.println("Inside int i, String j");
	}
	// argument sequence is also considered while overloading.
	void argSeqTest(String j, int i){
		System.out.println("Inside String j, int i");
	}
	static void staticMethA(){
		System.out.println("Parent's static Method");
	}
	void instanceMethA(){
		System.out.println("Parent's instance Method");
	}
	void checkReturnTypeInOverriding(int is){
		System.out.println("Parent's C Method");
	}
}
class Derived1 extends Base1{
	public Derived1() {
	}
	int i = 60;
	String j = "DerivedString";
	static int staticIntA = 90;
	static void staticMethA(){
		System.out.println("Child's static Method");
	}	
	void instanceMethA(){
		System.out.println("Child's instance Method");
	}
	void notInBase(){
		System.out.println("Child's instance Method, not in parent");
	}
	//Compilation Error - return type is incompatible with parent's method
//	int checkReturnTypeInOverriding(int is){
//		System.out.println("Child's C Method");
//		return 0;
//	}
}
public class StaticInInheritance {
	/*
	 * 				DERIVED static method cannot hide the instance method from Base
	 * 				DERIVED instance method cannot override the static method from Base
	 * 
	 */
	public static void main(String[] args) {
		Base1 basemixed = new Derived1();
		Base1 basepure = new Base1();	
		Derived1 derivedPure = new Derived1();
		
		//Derived1 derivedmixed = new Base1();  --> compilation error
		//basepure Operations
		System.out.println("basepure.i - "+basepure.i);
		System.out.println("basepure.j - "+ basepure.j);
		System.out.println(basepure.staticIntA);
		basepure.staticMethA();
		basepure.instanceMethA();
		
		System.out.println("\n");
		
		//basemixed Operations
		System.out.println("basemixed.i - "+basemixed.i);
		System.out.println("((Derived1)basemixed).i - "+((Derived1)basemixed).i);
		System.out.println("basemixed.j - "+ basemixed.j);
		System.out.println("((Derived1)basemixed).j - "+((Derived1)basemixed).j);
		System.out.println("basemixed.staticIntA - "+basemixed.staticIntA);
		basemixed.staticMethA();
		basemixed.instanceMethA();
		
		//compilation error---- The method notInBase() is undefined for the type Base1
		//basemixed.notInBase();
		
		System.out.println("\n");
		
		//derivedPure Operations
		System.out.println("derivedPure.i - "+derivedPure.i);
		System.out.println("derivedPure.j - "+ derivedPure.j);
		System.out.println("derivedPure.staticIntA - "+derivedPure.staticIntA);
		derivedPure.staticMethA();
		derivedPure.instanceMethA();
	}
}
