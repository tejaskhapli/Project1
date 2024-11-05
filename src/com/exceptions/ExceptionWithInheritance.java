package com.exceptions;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;

class BaseEx{
	
	void m1() throws FileNotFoundException{
		System.out.println("Derived'd m1");
		//throw new RuntimeException();
	}
	
}

class DerivedEx extends BaseEx{
	
	void m1() throws FileNotFoundException {
		System.out.println("Derived'd m1");
	}
	
	
}
public class ExceptionWithInheritance {

	public static void main(String[] args) {
		
		BaseEx basemixed = new DerivedEx();
		DerivedEx der = new DerivedEx();
		try {
			basemixed.m1();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//der.m1();

	}
	
}
