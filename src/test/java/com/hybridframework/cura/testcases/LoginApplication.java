package com.hybridframework.cura.testcases;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseClass;
import pages.HomePage;
import pages.LoginPage;

public class LoginApplication extends BaseClass{
	
	HomePage homepage;
	LoginPage loginpage;
	
	@Test(priority=1)
	public void loginWithValidCredentials() {
		
		homepage = new HomePage(driver);
		loginpage = homepage.makeAppointment();
		loginpage.loginToApplication("John Doe", "ThisIsNotAPassword");
		
		
		Assert.assertTrue(driver.findElement(By.xpath("//h2[normalize-space()='Make Appointment']")).isDisplayed(),"Login failed");
		
	}
	
	@Test(priority=2)
	public void verifyFooterLinks() {
		
		int count = homepage.countFooterLinks();
		Assert.assertEquals(count,3, "footer links count mismatched");
		
	}

}
