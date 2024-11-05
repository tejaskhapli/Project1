package com.collection;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class UnmodifiableCollectionDemo {

	public static void main(String[] args) {
		ArrayList<Integer> aList = new ArrayList<Integer>();
		aList.add(10);aList.add(101);aList.add(100);
		
		List readOnlyList = Collections.unmodifiableList(aList);
		
		readOnlyList.stream().forEach(x -> System.out.println(x));
	
		//java.lang.UnsupportedOperationException
		readOnlyList.add(10000);
	}
	
	
}
