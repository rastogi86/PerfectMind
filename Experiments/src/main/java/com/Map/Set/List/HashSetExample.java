package com.Map.Set.List;

import java.util.HashSet;
import java.util.Set;

public class HashSetExample {

	public static void main(String[] args) {
		
		Set<String> set=new HashSet<String>();
		//Set is unordered and doesn't accept duplicates.
		set.add("First");
		set.add("1");
		set.add("Second");
		set.add("1");
		
		System.out.println(set);
		set.add("4");
		System.out.println(set);
	}
}
