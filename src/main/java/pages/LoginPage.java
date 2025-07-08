package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	
	
	WebDriver driver;
	
	public LoginPage(WebDriver driver) {
		
		this.driver = driver;
	}
	
	By username = By.id("txt-username");
	By password = By.id("txt-password");
	By login = By.id("btn-login");
	
	
	public MakeAppointmentPage loginToApplication(String uname, String pass) {
		
		driver.findElement(username).sendKeys(uname);
		driver.findElement(password).sendKeys(pass);
		driver.findElement(login).click();
		
		MakeAppointmentPage apt = new MakeAppointmentPage(driver);
		return apt;
	}

}
