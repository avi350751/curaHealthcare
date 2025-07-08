package com.hybridframework.cura.testcases;

import org.openqa.selenium.Alert;
import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseClass;
import helper.Utility;
import pages.ConfirmationPage;
import pages.HomePage;
import pages.LoginPage;
import pages.MakeAppointmentPage;

public class BookAppointment extends BaseClass{
	
	HomePage homepage;
	LoginPage loginpage;
	ConfirmationPage cp;
	
	
	@Test
	public void makeAnAppointment() throws InterruptedException {
		
		homepage = new HomePage(driver);
		loginpage = homepage.makeAppointment();
		MakeAppointmentPage apt = loginpage.loginToApplication("John Doe", "ThisIsNotAPassword");
	
		Thread.sleep(1000);
		
		apt.selectFacility("Seoul");
		apt.medicAid();
		apt.visitDate();
		apt.comment("Book");
		apt.bookAppointment();
		
		Thread.sleep(1000);
		
		cp = new ConfirmationPage(driver);
		String actualMsg = cp.verifyConfirmMessage();
		Assert.assertEquals("Appointment Confirmation", actualMsg);
	}

}
