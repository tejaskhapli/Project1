package com.gc;

import java.io.PrintStream;

class Base1{

	int i;
	public Base1() {
		// TODO Auto-generated constructor stub
		i = 9;
		
	}
	@Override
	protected void finalize() throws Throwable {
		//super.finalize();
		System.out.println("Base Finallize");
	}
	
}

class Derived1 extends Base1{
	
	int j;
	public Derived1() {
		j = 18;
		// TODO Auto-generated constructor stub
	}
	
	
	@Override
	protected void finalize() throws Throwable {
		//super.finalize();
		System.out.println("Derived's Finallize");
	}
}

public class FinallizeDemo {

		public static void main(String[] args) {
		
			
			
			Base1 b = new Base1();
			b = null;
			System.gc();
			Derived1 d = new Derived1();
			d = null;
			System.gc();
			Base1 mixed = new Derived1();
			mixed = null;
			System.gc();
		}	
	
}
