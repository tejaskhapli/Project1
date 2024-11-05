package com.cloneable;

import com.sun.org.apache.bcel.internal.generic.NEW;

class Dummy{
	int i = 8;
	
}
//Throws Exeception if not implements Cloneable
public class ClonnableEmployee implements Cloneable{
 
   private String name;
   private Dummy dummy = new Dummy();
   
   public ClonnableEmployee(String name) {
	this.name = name;
   }
 
   public String getName() {
    return name;
   }

   //  NEED TO OVERRIDE CLONE METHOD TO PERFORM DEEP COPY
   @Override
	protected Object clone() throws CloneNotSupportedException {
	
	   ClonnableEmployee e;
	   e = new ClonnableEmployee(this.name);
	   e.dummy = new Dummy();
	   return e;
	}
   
   public static void main(String[] args) {
	ClonnableEmployee emp = new ClonnableEmployee("Abhi");
	try {
	    ClonnableEmployee emp2 = (ClonnableEmployee) emp.clone();
		System.out.println(emp2.getName());
		
		System.out.println(emp.hashCode());
		System.out.println(emp2.hashCode());
		System.out.println("Dummy Object");
	
		//By default clone method makes shallow copy
		System.out.println(System.identityHashCode(emp.dummy));
		System.out.println(System.identityHashCode(emp2.dummy));
	
	} catch (CloneNotSupportedException e) {
		e.printStackTrace();
	}
   }
}