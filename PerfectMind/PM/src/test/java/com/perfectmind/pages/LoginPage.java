package com.perfectmind.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage {
	
	WebDriver driver;
	
	public LoginPage(WebDriver ldriver)
	{
		this.driver=ldriver;
	}
	
	@FindBy(id="textBoxUsername") 
	WebElement eleusername;
	
	@FindBy(id="textBoxPassword")
	WebElement elepassword;
	
	@FindBy(id="buttonSignIn")
	WebElement btnlogin;
	
	@FindBy(xpath="//input[contains(@value,'Forgot Password')]")
	WebElement lnkForgotPassword;
	
	@FindBy(xpath="//span[@class='field-validation-error']")
	WebElement txtLoginUnsuccessful;
	
	public void loginToPM(String uname,String pwd) throws InterruptedException
	{
		Thread.sleep(2000);
		eleusername.sendKeys(uname);
		elepassword.sendKeys(pwd);
		btnlogin.click();
		
	}

}
