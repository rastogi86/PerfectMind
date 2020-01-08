package com.LogsCheck;

import java.util.Date;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class Log4JUsingPropertyFile {

	static Logger logs=Logger.getLogger(Log4JUsingPropertyFile.class.getName());

	public static void main(String[] args) {
			
		Date date=new Date(); 
		System.setProperty("newDate",date.toString().replace(":","_").replace(" ", "_"));
		PropertyConfigurator.configure("./src/main/java/com/LogsCheck/Log4J.properties");
		logs.debug("Debug message");
		logs.info("Info message");
		logs.error("Error message");
		
		
	}

}
