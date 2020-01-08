package com.ReflectionAPI;

import java.lang.reflect.Method;

public class CheckingReflectionAPImethods {

	public static void main(String[] args) {

		DummyClassWithMethods dcm=new DummyClassWithMethods();
		Class c=dcm.getClass();
		Method[] methods=c.getDeclaredMethods();
		
		for(int i=0;i<methods.length;i++)
		System.out.println(methods[i]);
		
		
	}

}
