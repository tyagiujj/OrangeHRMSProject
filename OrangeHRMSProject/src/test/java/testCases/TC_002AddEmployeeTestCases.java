package testCases;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import PageObjectes.AddEmployeePage;
import PageObjectes.OrangeHRMSLoginPOM;
import testBase.BaseClass;

public class TC_002AddEmployeeTestCases extends BaseClass {
	//WebDriver driver;
	

    @Test(priority=1)
    public void NavigateToAddEmployeePage() throws InterruptedException {
   Thread.sleep(2000);
   driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/pim/addEmployee");
    }
    @Test(priority=2)
    public void AddEmployee() throws InterruptedException {
    	AddEmployeePage addemp= new AddEmployeePage(driver);
    	Thread.sleep(2000);
    	
   	 Assert.assertTrue(addemp.isFirstNameFieldisEnabled(), "First Name field is not enabled.");
     Assert.assertTrue(addemp.isMiddleNameFieldisEnabled(), "Last Name field is not enabled.");
     Assert.assertTrue(addemp.isLastNameFieldisEnabled(), "Last Name field  is not enabled");
     Assert.assertTrue(addemp.isSaveButtonisDisplay(),"Save Button is not Display");
        
    	addemp.fname("Ujjwal");
    	addemp.mname("Kumar");
    	addemp.lname("Tyagi");
    	addemp.save();
    }
    @AfterClass()
    public void TearDown() {
    	driver.quit();
    }
    }
