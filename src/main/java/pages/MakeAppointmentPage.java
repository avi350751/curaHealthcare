package pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class MakeAppointmentPage {
	
	WebDriver driver;
	
	public MakeAppointmentPage(WebDriver driver) 
	
	{
		
		this.driver = driver;
	}
	
	
	By facilityDropdown = By.id("combo_facility");
	By hospitalReadmin = By.id("chk_hospotal_readmission");
	By medicaid = By.id("radio_program_medicaid");
	By noHealthCare = By.id("radio_program_none");
	By visitDate = By.id("txt_visit_date");
	By day = By.xpath("//td[@class='day']");
	By comment = By.id("txt_comment");
	By bookAppointment = By.id("btn-book-appointment");
	
	
	
	public void selectFacility(String facility) {
		
		Select fac = new Select(driver.findElement(facilityDropdown));
		fac.selectByContainsVisibleText(facility);
	}
	
	public void reAdmit() {
		
		driver.findElement(hospitalReadmin).click();
	}
	
	public void medicAid() {
		
		driver.findElement(medicaid).click();
	}
	
	public void visitDate() {
		
		/*hard coding it as of now*/
		driver.findElement(visitDate).click();
		driver.findElement(By.xpath("(//td[@class='day'])[15]")).click();
		
	}
	
	public void comment(String text) {
		
		driver.findElement(comment).sendKeys(text);
	}
	
	public ConfirmationPage bookAppointment() {
		
		driver.findElement(bookAppointment).click();
		ConfirmationPage apt = new ConfirmationPage(driver);
		return apt;
	}

}
