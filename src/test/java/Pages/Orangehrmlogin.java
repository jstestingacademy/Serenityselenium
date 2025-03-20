package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import net.serenitybdd.annotations.DefaultUrl;
import net.serenitybdd.annotations.Step;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;

import net.serenitybdd.core.pages.PageObject;

@DefaultUrl("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login")
public class Orangehrmlogin extends PageObject {

    private By usernameField = By.name("username");
    private By passwordField = By.name("password");
    private By loginButton = By.cssSelector("button[type='submit']");

    public void enterusername(String username) {
        $(usernameField).type(username);
    }

    public void enterpassword(String password) {
        $(passwordField).type(password);
    }

    public void clickbutton() {
        $(loginButton).click();
    }
}
