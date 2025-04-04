package PageObjectes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AddEmployeePage extends BasePage {

	public AddEmployeePage(WebDriver driver) {
		super(driver);
		
	}
	@FindBy(xpath="//a[normalize-space()='Add Employee']")
	WebElement addemployee;
	
	@FindBy(xpath="//input[@placeholder='First Name']")
	WebElement FirstName;
	
	@FindBy(xpath="//input[@placeholder='Middle Name']")
	WebElement MiddleName;
	
	@FindBy(xpath="//input[@placeholder='Last Name']")
WebElement LastName;
	
	@FindBy(xpath="//button[@type='submit']")
	WebElement Save;
	
	public void fname(String F_Name) {
		FirstName.sendKeys(F_Name);
	}
	public void mname(String M_Name) {
		MiddleName.sendKeys(M_Name);
	}
	public void lname(String L_Name) {
		LastName.sendKeys(L_Name);
	}
	public void save() {
		Save.click();
	}
	public boolean isFirstNameFieldisEnabled() {
		return FirstName.isEnabled();
	}
	public boolean isMiddleNameFieldisEnabled() {
		return MiddleName.isEnabled();
	}
	public boolean isLastNameFieldisEnabled() {
		return LastName.isDisplayed();}
		
		public boolean isSaveButtonisEnabled() {
			return Save.isEnabled();
		}
		public boolean isSaveButtonisDisplay() {
			return Save.isDisplayed();
		}
	}


