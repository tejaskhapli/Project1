package com.java8;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

public class SortMapByValues {

	public static void main(String[] args) {
		
		 Map<String, Integer> unsortMap = new HashMap<String, Integer>();
	        unsortMap.put("z", 10);
	        unsortMap.put("b", 5);
	        unsortMap.put("a", 6);
	        unsortMap.put("c", 20);
	        unsortMap.put("d", 1);
	        unsortMap.put("e", 7);
	        unsortMap.put("y", 8);
	        unsortMap.put("n", 99);
	        unsortMap.put("j", 50);
	        unsortMap.put("m", 2);
	        unsortMap.put("f", 9);
	        
	        
	        
	        //store entrySet as list
	        List<Map.Entry<String,Integer>> li = new LinkedList<Map.Entry<String,Integer>>(unsortMap.entrySet());
	        
	        
	        //Sort accouding to value
	        Collections.sort(li, new Comparator<Map.Entry<String,Integer>>(){

				@Override
				public int compare(Entry<String, Integer> o1, Entry<String, Integer> o2) {
					
					return (o1.getValue().compareTo(o2.getValue()));
				}
			});
	        
	        //loop throug this list and put it into linked hashmap so that insertion order will
			//be preserved
			Map<String, Integer> mp = new LinkedHashMap<>();
			
			li.stream().forEach(x -> mp.put(x.getKey(), x.getValue()));
	        
			mp.entrySet().stream().forEach(x-> System.out.println(x.getKey()+" "+ x.getValue()));
	        
		
	}
	
}
