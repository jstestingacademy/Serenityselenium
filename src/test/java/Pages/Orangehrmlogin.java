package pages;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.support.ui.ExpectedConditions;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


@DefaultUrl("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login")
public class Orangehrmlogin extends PageObject {

    @FindBy(name = "username")  // Updated locator
    private WebElement usernameField;

    @FindBy(name = "password")  // Updated locator
    private WebElement passwordField;

    @FindBy(xpath = "//button[@type='submit']")  // Updated locator
    private WebElement loginButton;

    public void enterUsername(String username) {
        waitFor(ExpectedConditions.visibilityOf(usernameField));
        usernameField.sendKeys(username);
    }

    public void enterPassword(String password) {
        waitFor(ExpectedConditions.visibilityOf(passwordField));
        passwordField.sendKeys(password);
    }

    public void clickLogin() {
        waitFor(ExpectedConditions.elementToBeClickable(loginButton));
        loginButton.click();
    }
}
