package com.perfectmind.pages;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.perfectmind.utility.BrowserFactory;
import com.perfectmind.utility.ConfigDataProvider;
import com.perfectmind.utility.ExcelDataProvider;
import com.perfectmind.utility.Helper;

public class BaseClass {

	public WebDriver driver;
	ConfigDataProvider config = new ConfigDataProvider();
	public ExcelDataProvider excel = new ExcelDataProvider();
	public ExtentReports report;
	public ExtentTest testLogger;

	@BeforeSuite
	public void init() {
		
		
		driver = BrowserFactory.startApplication(driver, config.getProperties("browser"),
				config.getProperties("alphaAppURL"));
		ExtentHtmlReporter html = new ExtentHtmlReporter(
				new File(System.getProperty("user.dir") + "/Reports/" + Helper.getCurrentDateTime() + ".html"));
		report = new ExtentReports();
		report.attachReporter(html);
	}

	@AfterSuite
	public void tearDown() {
		BrowserFactory.endApplication(driver);
	}

	@AfterMethod
	public void getScreenshots(ITestResult itestresult) throws IOException {
		if (itestresult.getStatus() == ITestResult.FAILURE) {

			testLogger.fail("Test failed",
					MediaEntityBuilder.createScreenCaptureFromPath(Helper.CaptureScreenshot(driver)).build());
		}

		if (itestresult.getStatus() == ITestResult.SUCCESS) {

			testLogger.fail("Test passed",
					MediaEntityBuilder.createScreenCaptureFromPath(Helper.CaptureScreenshot(driver)).build());
		}

		report.flush();

	}

}
