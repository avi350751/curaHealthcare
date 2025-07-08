package pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {
	
	WebDriver driver;
	
	
	public HomePage(WebDriver driver) {
		
		this.driver = driver;
	}
	
	
	By makeAppointmentButton = By.id("btn-make-appointment");
	By menu = By.id("menu-toggle");
	By home = By.xpath("//a[normalize-space()='Home']");
	By login = By.xpath("//a[normalize-space()='Login']");
	By footerLinks = By.xpath("//ul[@class='list-inline']/li/a/i");
	
	
	public LoginPage makeAppointment() {
		
		driver.findElement(makeAppointmentButton).click();
		
		LoginPage loginpage = new LoginPage(driver);
		return loginpage;
	}
	
	public void menu() {
		
		driver.findElement(menu).click();
	}
	
	public int countFooterLinks() {
		
		List<WebElement> footerlinks = driver.findElements(footerLinks);
		int links = footerlinks.size();
		return links;
	}

}
