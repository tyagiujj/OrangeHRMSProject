package PageObjectes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class OrangeHRMSLoginPOM extends BasePage {

    public OrangeHRMSLoginPOM(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//inpu[@placeholder='Username']")
    WebElement Username;

    @FindBy(xpath = "//input[@placeholder='Password']")
    WebElement Password;

    @FindBy(xpath = "//button[@type='submit']")
    WebElement Login;

    public void Username(String user) {
        Username.sendKeys(user);
    }

    public void Password(String password) {
        Password.sendKeys(password);
    }

    public void Submit() {
        Login.click();
    }

    public boolean isLoginButtonDisplayed() {
        return Login.isDisplayed();
    }

    public boolean isUsernameFieldEnabled() {
        return Username.isEnabled();
    }

    public boolean isPasswordFieldEnabled() {
        return Password.isEnabled();
    }
}
