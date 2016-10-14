package com.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.browserutility.Browser;
import com.pageobjects.Loginpage;

public class Pagetitle {
	
	WebDriver driver;
	@Test
	public void verifytitle()
	{
		driver=	Browser.browser("firefox", "https://www.facebook.com/");
		Loginpage l=PageFactory.initElements(driver, Loginpage.class);
		l.verifytitle();
	}

}
