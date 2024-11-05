package com.collection;

import java.awt.List;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.concurrent.CopyOnWriteArrayList;

/*
 * A thread-safe variant of ArrayList in which all mutative operations 
 * (add, set, and so on) are implemented by making a fresh copy of the
 * underlying array.
 * This is ordinarily too costly, but may be more efficient than alternatives 
 * when traversal operations vastly outnumber mutations, and is useful when you 
 * cannot or don't want to synchronize traversals, yet need to preclude
 * interference among concurrent threads.
 * 
 * The "snapshot" style iterator method uses a reference to the state of the 
 * array at the point that the iterator was created. This array never
 * changes during the lifetime of the iterator, so interference is impossible 
 * and the iterator is guaranteed not to throw ConcurrentModificationException.
 * The iterator will not reflect additions, removals, or changes to the list
 * since the iterator was created. Element-changing operations on iterators themselves
 * (remove, set, and add) are not supported.
 * 
 * These methods throw UnsupportedOperationException.
 * 
 * All elements are permitted, including null.
 * Memory consistency effects: As with other concurrent collections, 
 * actions in a thread prior to placing an object into a CopyOnWriteArrayList 
 * happen-before actions subsequent to the access or removal of that element from 
 * the CopyOnWriteArrayList in another thread.  
 * 
 * */

public class CopyOnWriteArrayListDemo {

	public static void main(String[] args) {
		CopyOnWriteArrayList<Integer> cpylist = new CopyOnWriteArrayList<>();
		cpylist.add(1);
		cpylist.add(100);
		cpylist.add(10);
		cpylist.add(12);
		cpylist.add(8);
		cpylist.add(2);
		
		ListIterator<Integer> listItr = cpylist.listIterator();
		//java.lang.UnsupportedOperationException
		while(listItr.hasNext()){
//			listItr.add(1998);
			listItr.next();
			cpylist.add(209);
			System.out.println("tejss");
		}
		System.out.println("==============================");
		Iterator<Integer> itr = cpylist.iterator();
		while(itr.hasNext()){
			Integer i = itr.next();
			System.out.println("Element - "+ i);
			cpylist.set(0, 99);
			//itr's remove is not allowed and throws UnsupportedOPerationException
			//itr.remove();			

			//allowed -
			//cpylist.remove(0);
		}
		
		System.out.println(cpylist);
		
		new Thread(() -> {
			Iterator<Integer> itr1 = cpylist.iterator();
			while(itr.hasNext()){
				Integer thisElement = itr.next();
				try {
					Thread.sleep(100);
				} catch (Exception e) {
					e.printStackTrace();
				}
				cpylist.add(8889);
				System.out.println("Thread1 Itreator - "+thisElement);
			}
			System.out.println("From thread1 - "+cpylist);
			cpylist.stream().forEach(System.out::println);			
		}).start();

		new Thread(() -> {
			Iterator<Integer> itr2 = cpylist.iterator();
			try {
				Thread.sleep(2000);
			} catch (Exception e) {
				e.printStackTrace();
			}
			while(itr.hasNext()){
				System.out.println("From thread2 - "+itr.next());
			}
			System.out.println("From thread2 - "+cpylist);
			cpylist.stream().forEach(System.out::println);
		}).start();
		
	}
	
}
