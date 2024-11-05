package com.string;

public class String1 {

	/*
	 * 1. intern method
	 * 2. equality between strings
	 * 3. string pool
	 * 4. split method
	 * 5... 
	 * 
	 * 
	*/
	
	public static void main(String[] args) {
		
		
		// new objects created in heap memory
		String newString1 = new String("String1");
		
		String newString2 = new String("String1");
		
		String newString1_pool = "String1";
		String poolintern = newString1_pool.intern();
		System.out.println(" newString1_pool.systemHashcode - " + System.identityHashCode(newString1_pool));
		System.out.println(" poolintern.systemHashcode - " + System.identityHashCode(poolintern));
		
		//System.out.println(" newString1 == newString2 ? -- " + newString1 == newString2 );
		//System.out.println(" newString1.equals(newString2) ? -- " + newString1.equals(newString2));
		
		System.out.println(" newString1.systemHashcode - " + System.identityHashCode(newString1));
		System.out.println(" newString2.systemHashcode - " + System.identityHashCode(newString2));
		
		
		//objects created in string pool and not in heap
		String quoteString1 = "quoteString";
		String quoteString2 = "quoteString";
		//System.out.println("quoteString1 == quoteString2 ? -- " + quoteString1 == quoteString2 );
		//System.out.println("quoteString1 == quoteString2 ? -- " + quoteString1.equals(quoteString2));
		System.out.println(" quoteString1.systemHashcode - " + System.identityHashCode(quoteString1));
		System.out.println(" quoteString2.systemHashcode - " + System.identityHashCode(quoteString2));
		
		String newquoteString = new String("quoteString");
		System.out.println(" newquoteString.systemHashcode - " + System.identityHashCode(newquoteString));
		
		
		
		//INTERN method on string will get a reference from strting pool if same string present in pool
		//if not present, it will store a new string of same content into string pool and return the reference of the string from pool.
		
		
		
		String newinternString1 = newString1.intern();
		String newStringwithquote = "String1";
		System.out.println(" newStringwithquote.systemHashcode - " + System.identityHashCode(newStringwithquote));
		System.out.println(" newinternString1.systemHashcode - " + System.identityHashCode(newinternString1));
																																																					
		
	}
	
	
}
