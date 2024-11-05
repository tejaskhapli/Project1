package com.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class IteratorListIterator {

	
	public static void main(String[] args) {
		ArrayList<Integer> intList = new ArrayList<Integer>();
		intList.add(1);
		intList.add(3);
		intList.add(5);
		intList.add(7);
		//intList.add(9);
		Iterator<Integer> itr = intList.iterator();
		while(itr.hasNext()){
			//System.out.println("1st");
			System.out.println(itr.next());
			//itr.remove();
			
			//java.lang.IllegalStateException calling remove method twice after one call to next
			//itr.remove();
			
			//Throws concurentmodificationException 
			//intList.add(0);
			//intList.remove(0);
			//Set Doesn't throw concurrentModificationException only add and remove throw
			intList.set(0, 888);
			
			//System.out.println("2nd");
			//NoSuchElementException thrown if element not present in next place
			//System.out.println(itr.next());
		}
		System.out.println("ArrayList after removal - " + intList);
		System.out.println("\n");
		
		
		
		ListIterator<Integer> ltr = intList.listIterator();
		
		while(ltr.hasNext()){
			int fetchedNext = ltr.next();
			
			
			
			System.out.println(fetchedNext);
			/*
			 * Removes from the list the last element that was returned by next or previous (optional operation). 
			 * This call can only be made once per call to next or previous. 
			 * It can be made only if add has not been called after the last call to next or previous
			 */
			//ltr.remove();
			//ltr.previous();
			//ltr.next();
			/*
			 * listiterator.add is allowed in arraylist
			 * but not allowed on copyonwritearraylist as cpyalst works on snapshot
			 * 
			 * */
			
			
			ltr.add(1221);
			//ltr.set();
			System.out.println(ltr);

		}
		System.out.println(intList);
		
		//ltr.s
	}
	
	
	
	
}
