package testCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import PageObjectes.OrangeHRMSLoginPOM;

public class TC_001OrangeHRMSLogin {
    WebDriver driver;

    @BeforeClass
    public void setup() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
    }
    @Test(priority = 1)
    public void loginTest() throws InterruptedException {
        OrangeHRMSLoginPOM login = new OrangeHRMSLoginPOM(driver);
        Thread.sleep(2000);
        
        Assert.assertTrue(login.isUsernameFieldEnabled(), "Username field is not enabled.");
        Assert.assertTrue(login.isPasswordFieldEnabled(), "Password field is not enabled.");
        Assert.assertTrue(login.isLoginButtonDisplayed(), "Login button is not displayed.");

 
        login.Username("Admin");
        login.Password("admin123");
        login.Submit();

        Thread.sleep(3000); 

        String expectedUrl = "https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index";
        Assert.assertEquals(driver.getCurrentUrl(), expectedUrl, "Login failed: URL did not change.");

        String expectedTitle = "OrangeHRM";
        Assert.assertEquals(driver.getTitle(), expectedTitle, "Login failed: Page title is incorrect.");
    }

    @AfterClass
    public void tearDown() {
        driver.quit();
    }
}
