package com.hybridframework.cura.testcases;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginApplication {
	
	
	@Test
	public void loginWithValidCredentials() {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://katalon-demo-cura.herokuapp.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
		
		driver.findElement(By.id("btn-make-appointment")).click();
		driver.findElement(By.id("txt-username")).sendKeys("John Doe");
		driver.findElement(By.id("txt-password")).sendKeys("ThisIsNotAPassword");
		driver.findElement(By.id("btn-login")).click();
		
		Assert.assertTrue(driver.findElement(By.xpath("//h2[normalize-space()='Make Appointment']")).isDisplayed(),"Login failed");
		driver.findElement(By.id("menu-toggle")).click();
		driver.findElement(By.xpath("//a[normalize-space()='Logout']")).click();
		
		Assert.assertTrue(driver.getCurrentUrl().contains("herokuapp.com"),"Logout failed");
		driver.quit();
	}

}
