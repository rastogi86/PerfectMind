package com.perfectmind.utility;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserFactory {
	WebDriver driver;

	public static WebDriver startApplication(WebDriver driver, String browserName, String appURL) {
		if (browserName.equalsIgnoreCase("Chrome")) {

			WebDriverManager.chromedriver().setup();

			ChromeOptions options = new ChromeOptions();

			driver = new ChromeDriver(options);

		} else if (browserName.equalsIgnoreCase("Firefox")) {

			System.setProperty("driver.gecko.driver", "./Drivers/geckodriver.exe");

		} else if (browserName.equalsIgnoreCase("IE")) {

		} else {

			System.out.println("Please check the browser specified");
		}
		driver.get(appURL);
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		return driver;
	}

	public static void endApplication(WebDriver driver) {
		driver.quit();
	}
}
