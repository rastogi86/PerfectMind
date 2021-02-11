package com.perfectmind.testcases;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.perfectmind.pages.BaseClass;
import com.perfectmind.pages.LoginPage;

public class LoginTest extends BaseClass {

	@Test
	public void Login() throws InterruptedException {

		testLogger = report.createTest("Login to the application");
		
		LoginPage login = PageFactory.initElements(driver, LoginPage.class);
		
		testLogger.info("Login page has been initialized");
		
		login.loginToPM(excel.getData(0, 0, 0), excel.getData(0, 0, 1));
		
		testLogger.pass("User has successfully logged into the application");

	}

}
