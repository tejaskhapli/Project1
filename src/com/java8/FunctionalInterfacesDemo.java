package com.java8;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

class Person{
	String name;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public Person(String name) {
		this.name = name;
	}
}

public class FunctionalInterfacesDemo {

	public static void main(String[] args) {
		List<String> names = Arrays.asList("Geek","GeeksQuiz","g1","QA","Geek2"); 
  
        // declare the predicate type as string and use 
        // lambda expression to create object 
        Predicate<String> p = (s)->s.startsWith("G"); 
  
        // Iterate through the list 
        for (String st:names) 
        { 
            // call the test method 
            if (p.test(st)) 
                System.out.println(st); 
        }
        
        
        Consumer <String> consumer1 = (arg) -> {
            System.out.println(arg + "OK");
        };
        consumer1.accept("TestConsumerAccept - ");

        Consumer <String> consumer2 = (x) ->{
            System.out.println(x + "OK!!!");
        };
        System.out.println("And Then -- ");
        consumer1.andThen(consumer2).accept("TestConsumerAfterThen - ");
        
        
        Supplier <Person> supplier = ()->{
            return new Person("Varun");
        };
        Person person = supplier.get();
        System.out.println("Person Detail:\n" + person.getName() );

        
        
        Function <Integer, String> functionInterface = (arg) ->{
        	if(arg == 0)
        		return "Zero";
        	else if(arg > 0)
        		return "Positive";
        	else if(arg < 0)
        	    return "Negative";
        	return "Default...";
        };
        System.out.println("Supplier - ");
        System.out.println(functionInterface.apply(100));
        System.out.println(functionInterface.apply(-100));
        
        
	}
}
//https://docs.oracle.com/cd/E13150_01/jrockit_jvm/jrockit/geninfo/diagnos/garbage_collect.html
