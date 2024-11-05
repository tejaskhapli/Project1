package com.java8;

import java.util.ArrayList;
import java.util.Spliterator;

public class SplitIteratorDemo {
		public static void main(String[] args) {

			
			ArrayList<Integer> al = new ArrayList<>();
			
			al.add(10);
			al.add(12);
			al.add(7);
			al.add(13);
			al.add(111);
			al.add(109);
			al.add(108);
			al.add(100);
			
			Spliterator<Integer> sp = al.spliterator();
			
			
			//System.out.println(sp.estimateSize());
			//sp.forEachRemaining(System.out::println);
			System.out.println(sp.characteristics());
			displayCharacteristics(sp);
			
		}

		private static void displayCharacteristics(Spliterator<Integer> spliterator) {
			 
			int expected = Spliterator.ORDERED | Spliterator.SIZED | Spliterator.SUBSIZED;
			 
			System.out.println(spliterator.characteristics() == expected);  //true
			 
			if (spliterator.hasCharacteristics(Spliterator.ORDERED)) {
			    System.out.println("ORDERED");
			}
			 
			if (spliterator.hasCharacteristics(Spliterator.DISTINCT)) {
			    System.out.println("DISTINCT");
			}
			 
			if (spliterator.hasCharacteristics(Spliterator.SORTED)) {
			    System.out.println("SORTED");
			}
			 
			if (spliterator.hasCharacteristics(Spliterator.SIZED)) {
			    System.out.println("SIZED");
			}
			 
			if (spliterator.hasCharacteristics(Spliterator.CONCURRENT)) {
			    System.out.println("CONCURRENT");
			}
			 
			if (spliterator.hasCharacteristics(Spliterator.IMMUTABLE)) {
			    System.out.println("IMMUTABLE");
			}
			 
			if (spliterator.hasCharacteristics(Spliterator.NONNULL)) {
			    System.out.println("NONNULL");
			}
			 
			if (spliterator.hasCharacteristics(Spliterator.SUBSIZED)) {
			    System.out.println("SUBSIZED");
			}			
		}
}
