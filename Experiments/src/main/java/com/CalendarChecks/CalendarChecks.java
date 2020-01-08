package com.CalendarChecks;

import java.util.Calendar;
import java.util.Date;

public class CalendarChecks 
{
	public static void main(String[] args) 
	{
		Date date=new Date();
		Calendar car=Calendar.getInstance();
		System.out.println(date.toString());
		System.out.println(date.getTime());  //milliseconds from start of year
		System.out.println(date.getYear()+1900);
		System.out.println(date.getMonth()+1);
		System.out.println(date.getDay());

	}

}
