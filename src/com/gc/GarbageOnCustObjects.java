package com.gc;

import java.io.FileInputStream;

class Base{
	int i = 8;
	@Override
	protected void finalize() throws Throwable {
		// TODO Auto-generated method stub
		//super.finalize();
		System.out.println("Inside base finallize");
		//int i = 6/0;
		//FileInputStream fis2 = null;
		//fis2 = new FileInputStream("");
		//System.out.println("After kide karun zalet");
	}
}

class Derived extends Base{
	int i = 8;
	@Override
	protected void finalize() throws Throwable {
		//super.finalize();
		System.out.println("Inside derived finallize");
		int i = 8/0;
		FileInputStream fis2 = null;
		fis2 = new FileInputStream("");
	}
}

public class GarbageOnCustObjects {

	public static void main(String[] args) {
		
		Base t = new Base();
		//One o = new One();
		
		t = null;
		//o = null;
		System.gc();
	
	}
	
}
