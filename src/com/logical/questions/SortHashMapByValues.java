package com.logical.questions;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map.Entry;

public class SortHashMapByValues {

	public static void main(String[] args) {
		HashMap<Integer, String> originalMap = new HashMap<>();
		originalMap.put(1, "Z");
		originalMap.put(7, "P");
		originalMap.put(5, "A");
		originalMap.put(4, "D");
		originalMap.put(3, "Y");
		originalMap.put(2, "U");
			
		ArrayList<Entry<Integer, String>> entryList = new ArrayList<Entry<Integer, String>>();

		originalMap.entrySet().stream().forEach(e -> entryList.add(e));		

		entryList.sort((o1 , o2) -> {
			return o2.getValue().compareTo(o1.getValue());
		});
		
		LinkedHashMap<Integer, String> sortedMap = new LinkedHashMap<>();

		entryList.stream().forEach(e  -> sortedMap.put(e.getKey(), e.getValue()));		
		sortedMap.entrySet().stream().forEach(e -> System.out.println(e.getValue()));
		
	}	
}
