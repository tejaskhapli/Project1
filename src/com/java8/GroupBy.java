package com.java8;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class GroupBy {

	
	
	/*
	 * Please refer - 
	 * https://java2blog.com/java-8-interview-questions-answers/
	 * 
	 * Example of Intermediate operations are:

			filter(Predicate)
			map(Function)
			flatmap(Function)
			sorted(Comparator)
			distinct()
			limit(long n)
			skip(long n)
	 * Example of terminal operations are :
			forEach
			toArray
			reduce
			collect
			min
			max
			count
			anyMatch
			allMatch
			noneMatch
			findFirst
			findAny
	 * 
	 * 
	 */
	
	public static void main(String[] args) {
		
		List<String> items =
                Arrays.asList("apple", "apple", "banana",
                        "apple", "orange", "banana", "papaya", "banana");

        Map<String, Long> result =
                items.stream().collect(
                        Collectors.groupingBy(
                                Function.identity(), Collectors.counting()
                        )
                );

        System.out.println(result);
        
        Map<String, Long> finalMap = new LinkedHashMap<>();

        //Sort a map and add to finalMap
        result.entrySet().stream()
                .sorted(Map.Entry.<String, Long>comparingByValue()
                        .reversed()).forEachOrdered(e -> finalMap.put(e.getKey(), e.getValue()));

        System.out.println(finalMap);
        
        
        
	}
}
