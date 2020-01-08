package com.WebTables;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

class ByteArrayOutputStreamCheck
{
public static void main(String[] args) throws IOException {
	
	byte c1[]= {10,20,30,40,50};
	byte c2[]= {60,70,80,90};
	ByteArrayOutputStream b1=new ByteArrayOutputStream(5);
	ByteArrayOutputStream b2=new ByteArrayOutputStream(10);
	b2.write(100);
	try 
	{
		b1.write(c1);
	
	System.out.println(b1.size());
	System.out.println(b2.size());
	b2.write(c1,0,c2.length);  // (byte array, start offset, until where)
	System.out.println(b2.size());
	}
	
	catch (Exception e) {
		e.printStackTrace();
	}

}
}