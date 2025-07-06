package com.hybridframework.cura.testcases;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseClass;

public class LoginApplication extends BaseClass{
	
	
	@Test
	public void loginWithValidCredentials() {
		
        driver.findElement(By.id("btn-make-appointment")).click();
		driver.findElement(By.id("txt-username")).sendKeys("John Doe");
		driver.findElement(By.id("txt-password")).sendKeys("ThisIsNotAPassword");
		driver.findElement(By.id("btn-login")).click();
		
		Assert.assertTrue(driver.findElement(By.xpath("//h2[normalize-space()='Make Appointment']")).isDisplayed(),"Login failed");
		driver.findElement(By.id("menu-toggle")).click();
		driver.findElement(By.xpath("//a[normalize-space()='Logout']")).click();
		
		Assert.assertTrue(driver.getCurrentUrl().contains("herokuapp.com"),"Logout failed");
		
	}

}
