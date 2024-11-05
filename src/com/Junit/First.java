package com.Junit;

import javax.swing.plaf.SliderUI;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;


public class First {

/*	@BeforeClass
	public void before_Class_method(){
		System.out.println("Before Class Test Method");
	}
	
	@AfterClass
	public void after_Class_method(){
		System.out.println("After Class Test Method");
	}
*/
	
	@Before
	public void before_method(){
		System.out.println("Before Test Method");
	}
	
	@Test(timeout = 1000, expected = InterruptedException.class)
	public void test1() throws InterruptedException {
		//fail("Not yet implemented");
		System.out.println("inside test1 Method");
		//Thread.currentThread().sleep(500);
	}

	@Test
	public void test2() {
		//fail("Not yet implemented");
		System.out.println("inside test2 Method");
	}
	
	@After
	public void after_method(){
		System.out.println("After Test Method");
	}
	
	
}
