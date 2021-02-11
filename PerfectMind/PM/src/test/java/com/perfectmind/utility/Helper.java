package com.perfectmind.utility;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Helper {

	public static String CaptureScreenshot(WebDriver driver) {

		String path=System.getProperty("user.dir")+"/Screenshots/"+getCurrentDateTime()+".png";
		File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		try 
		{
			FileUtils.copyFile(src,new File(path));
			// or FileHandler.copy(src, new File("./Screenshots/login.png"));
		} catch (Exception e) {
			System.out.println("Unable to take screenshot " + e.getMessage());
		}
		return path;
	}
	
	public static String getCurrentDateTime()
	{
		SimpleDateFormat sdf=new SimpleDateFormat("MM_dd_yyyy_HH_mm_ss");
		Date currentDate=new Date();
		return sdf.format(currentDate); 
	}
	
	
}
