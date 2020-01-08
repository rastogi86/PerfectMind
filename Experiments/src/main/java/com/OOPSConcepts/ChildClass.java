package com.OOPSConcepts;

public class ChildClass extends ParentClass{
	
	public void childMethod()
	{
		System.out.println("Creating a child method in child class");
	}
	
	@Override
	public void parentMethod()
	{
		System.out.println("Creating a parent method in child class");
	}
	public static void main(String[] args) {
		
	ChildClass cc=new ChildClass();
	ParentClass cc1=new ParentClass();
	cc.parentMethod();
	cc.parentMethod(4, 5);
	cc.childMethod();
	cc1.parentMethod();
	}

}
