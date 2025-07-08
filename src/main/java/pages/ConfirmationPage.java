package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ConfirmationPage {
	
	
	WebDriver driver;
	
	public ConfirmationPage(WebDriver driver) {
		
		this.driver = driver;
	}

	
	By confirmationMessage = By.xpath("//div[contains(@class,'text-center')]/h2");
	By goToHomePage = By.xpath("//a[normalize-space()='Go to Homepage']");
	
	
	
	public String verifyConfirmMessage() {
		
		String msg = driver.findElement(confirmationMessage).getText();
		return msg;
	}
	
	public HomePage gotoHomePage() {
		
		driver.findElement(goToHomePage).click();
		HomePage homepage = new HomePage(driver);
		return homepage;
	}
}
