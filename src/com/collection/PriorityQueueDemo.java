package com.collection;

import java.util.PriorityQueue;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

import com.collection.comparators.AgeComparator;
import com.collection.comparators.NameComparator;
import com.cust.ojects.Employee;
import com.sun.jmx.remote.internal.ArrayQueue;

public class PriorityQueueDemo {

	public static void main(String[] args) {
		PriorityQueue<Integer> pq = new PriorityQueue<>();
		pq.add(1);
		pq.add(8);
		pq.add(6);
		pq.add(9);
		pq.add(2);
		pq.stream().forEach(System.out::println);

		BlockingQueue bq1 = new ArrayBlockingQueue(2);
		BlockingQueue bq2 = new ArrayBlockingQueue(2);
		
		
		//also peek vs element difference - element thows NoSuchElementException
		//BlockingQueue  add() vs offer difference
		//http://www.interviewsansar.com/2015/05/22/which-method-will-you-prefer-between-add-and-offer-methods-to-add-elements-in-a-queue-and-why/
		//bq1.add(10);bq1.add(100);bq1.add(30);
		
		System.out.println(bq2.offer(30));
		System.out.println(bq2.offer(300));
		System.out.println(bq2.offer(301));
		PriorityQueue<Employee> empPq = new PriorityQueue<>(new AgeComparator());
		
		empPq.add(new Employee(10, "Tejas"));
		empPq.add(new Employee(11, "Abhishek"));
		empPq.add(new Employee(16, "Prashant"));
		empPq.add(new Employee(12, "Manoj"));
		empPq.add(new Employee(12, "Shreyas"));

		//empPq.stream().forEach(System.out::println);	
	}	
}
