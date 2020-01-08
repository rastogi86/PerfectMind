package com.Map.Set.List;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.function.Consumer;

public class ArrayListExample {

	public static void main(String[] args) {

		//Arraylist is ordered and can hold duplicates. It can hold different data types provided it is generic.
		//If you declare for a specific data type, then we cannot give all sorts of data types
		
		ArrayList genericArrayList=new ArrayList();
		ArrayList<Integer> intArrayList=new ArrayList<Integer>();
		
		genericArrayList.add(0, "String");
		genericArrayList.add(1,1);
		genericArrayList.add(2,1.1);
		genericArrayList.add(3,1);

		
		System.out.println("Printing the generic arraylist : "+genericArrayList);
		for (int i=0;i<10;i++)
		{
		intArrayList.add(i, (int)(Math.random()*100));
		}
		
		System.out.println("Print integer arraylist :"+intArrayList);
	
		
		
//How to read values from the ArrayList
	
		//1st way. Basic for loop
		for (int i=0;i<intArrayList.size();i++)
			System.out.print(intArrayList.get(i)+"\t");
			System.out.println();
		//2nd way. Advanced for loop
		for(Integer j:intArrayList)
			System.out.print(j+"\t");
			System.out.println();
		//3rd way. Iterator
			Iterator<Integer> it=intArrayList.iterator();
			while(it.hasNext())
				System.out.print(it.next()+"\t");
		
	}

}
