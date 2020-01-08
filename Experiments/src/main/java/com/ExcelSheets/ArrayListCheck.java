package com.ExcelSheets;

import java.util.ArrayList;

public class ArrayListCheck 
{
	public static void main(String[] args) 
	{
		ArrayList<String> a=new ArrayList<String>();
		
		a.add(0, "Something");
		a.add(1,"1");
		a.add(2,"2.01");
		a.add(2,"2");
		
		System.out.println(a.size());
		System.out.println(a);
	}
}
