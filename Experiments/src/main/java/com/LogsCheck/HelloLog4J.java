package com.LogsCheck;

import java.util.Date;

import org.apache.log4j.Logger;

public class HelloLog4J {

	static Logger logs=Logger.getLogger(HelloLog4J.class);

	public static void main(String[] args) {
		Date date=new Date();
		System.setProperty("newDate", date.toString().replace(":","_").replace(" ", "_"));
		
		logs.debug("Debug message");
		logs.info("Info message");
		logs.error("Error message");
		
		
	}

}
