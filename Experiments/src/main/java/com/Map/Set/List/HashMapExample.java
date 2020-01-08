package com.Map.Set.List;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.apache.commons.compress.utils.Sets;

public class HashMapExample {

	public static void main(String[] args) {

		//Key value pair
		
		Map<String,String> hm=new HashMap<String,String>();
		Set<String> email=new HashSet<String>();
		email.add("sumeet.rastogi@gmail.com");
		email.add("rastogi86@gmail.com");
		//Alternatively, the above statements can be written as shown below
		Set<String> email1=new HashSet<String>(Arrays.asList("sumeet.rastogi@gmail.com","rastogi86@gmail.com"));
		//Another way
		Set<String> email2= Sets.newHashSet("sumeet.rastogi@gmail.com","rastogi86@gmail.com");
		List<String> myset=new ArrayList<String>(Arrays.asList("1","2","1"));
		System.out.println(myset);
		myset.sort(null);
		

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		System.out.println(email);
		System.out.println(email1);
		
		hm.put("First Name", "Sumeet");
		hm.put("Last Name", "Rastogi");
//Printing all values
		System.out.println(hm);
//Printing a specific key
		System.out.println(hm.get("First Name"));
		
	}

}
