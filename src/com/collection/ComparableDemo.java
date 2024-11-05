package com.collection;

import java.util.ArrayList;
import java.util.Collections;

class Movie implements Comparable<Movie>{
	int releaseYear;
	public int getReleaseYear() {
		return releaseYear;
	}
	public void setReleaseYear(int releaseYear) {
		this.releaseYear = releaseYear;
	}
	public Movie() {
		releaseYear = 0;
	}
	public Movie(int year) {
		releaseYear = year;
	}
	@Override
	public int compareTo(Movie o) {		
		return (this.getReleaseYear() - o.getReleaseYear());
	}
	@Override
	public String toString() {
		return ""+this.getReleaseYear();
	}
}

public class ComparableDemo {
	public static void main(String[] args) {
		ArrayList<Movie> movieList = new ArrayList<>();
		movieList.add(new Movie(2009));
		movieList.add(new Movie(2010));
		movieList.add(new Movie(2006));
		movieList.add(new Movie(2012));
		movieList.add(new Movie(2008));		
		Collections.sort(movieList);
		movieList.stream().forEach(System.out::println);
	}
}
