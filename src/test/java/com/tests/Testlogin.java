package com.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.browserutility.Browser;
import com.pageobjects.Loginpage;

public class Testlogin {
	
	WebDriver driver;

	@Test
	public void testlogin()
	{
		driver=	Browser.browser("firefox", "https://www.facebook.com/");
		Loginpage l=PageFactory.initElements(driver, Loginpage.class);
		l.login("manu@gmail.com", "manu");
	}
	
	@AfterTest
	public void teardown()
	{
		driver.quit();
	}
	

}
