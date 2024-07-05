package com.prep.java8.core;

import java.util.ArrayList;
import java.util.Collections;
import java.util.TreeSet;

public class PracticeCoreJava {
	
	public static void main(String[] args) {
		ArrayList<Integer> ints = new ArrayList<>();
		ints.add(1);
		ints.add(15);
		ints.add(19);
		ints.add(31);
		ints.add(19);
		
		System.out.println("before ----- "+ints);
		
		Collections.sort(ints, (a1,a2) -> (a1 > a2) ? -1 
				: (a1 < a2) ? 1 : 0 );
		
		System.out.println("after ----- "+ints);
		
		
		TreeSet<String> strs = new TreeSet<String>((a,b) -> (a.compareTo(b)));
		strs.add("a");
		strs.add("bc");
		strs.add("d");
		strs.add("y");
		strs.add("yz");
		
		System.out.println("Strs ----- "+strs);
		
	}
	

}
