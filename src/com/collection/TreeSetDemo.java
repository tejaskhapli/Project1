package com.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

import com.collection.comparators.AgeComparator;
import com.collection.comparators.NameComparator;
import com.cust.ojects.Employee;

import my.QuickCheck;

public class TreeSetDemo {

	public static void main(String[] args) {
		
		/*TreeSet<String> ts = new TreeSet<>();	
		ts.add("JAVAZZZ");
		ts.add("a");
		ts.add("AM");
		ts.add("JAVA");
		ts.add("java programmer");		
		ts.stream().forEach(System.out::println);*/
		
		
		ArrayList<Employee> emplist = (ArrayList<Employee>) QuickCheck.createEmployees();
		//System.out.println(emplist);
		
		Set empSet = new HashSet<Employee>(emplist);
		
		TreeSet<Employee> tsNameSorted = new TreeSet<Employee>(new NameComparator());
		tsNameSorted.addAll(empSet);
		
		TreeSet<Employee> tsAgeSorted = new TreeSet<Employee>(new AgeComparator());
		tsAgeSorted.addAll(empSet);

		System.out.println(tsNameSorted);
		System.out.println("\n");
		System.out.println(tsAgeSorted);
		
		
	}
}
