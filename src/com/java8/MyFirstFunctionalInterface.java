package com.java8;

/*
 * If an interface declares an abstract method overriding one of the public methods of
 * java.lang.Object, that also does not count toward the interface’s abstract method count
 * since any implementation of the interface will have an implementation from java.lang.Object 
 * or elsewhere. e.g. Comparator is a functional interface even though it declared two abstract 
 * methods. Why? Because one of these abstract methods  “equals()” which has signature equal to 
 * public method in Object class.
 * */

@FunctionalInterface
public interface MyFirstFunctionalInterface {
public void firstWork();
@Override
public String toString();                //Overridden from Object class
@Override
public boolean equals(Object obj);        //Overridden from Object class
}

/*
 * 
 * List Of Imp Functional Interfaces - 
 * Predicate - boolean test(T t);
 * Supplier  - get
 * Consumer  - accept
 * Function  - apply
 *
 */
