package helper;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;

public class Utility {
	
	WebDriver driver;
	
	public void acceptAlert() {
		
		Alert alt = driver.switchTo().alert();
		alt.accept();
	}

}
