package StepDefintions;

import java.util.Optional;

import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.chromium.ChromiumDriver;
import org.openqa.selenium.devtools.DevTools;
import org.openqa.selenium.devtools.v113.network.Network;



import org.openqa.selenium.devtools.DevTools;


import net.serenitybdd.junit.runners.SerenityRunner;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import net.serenitybdd.core.Serenity;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import pages.Orangehrmlogin;

@RunWith(SerenityRunner.class)
public class OrangeHRMLoginSteps {
	
	  @Managed(driver = "remote")  // Use remote WebDriver (BrowserStack)
	    WebDriver driver;
    @Steps
    Orangehrmlogin loginPage;

    @Given("To launch the browser and enter the url")
    public void to_launch_the_browser_and_enter_the_url() {
    	
    	loginPage.open();  // This will open the URL defined in @DefaultUrl
    }

    @When("Enter the username and password")
    public void enter_the_username_and_password() {
        loginPage.enterUsername("Admin");
        loginPage.enterPassword("admin123");
    }

    @When("Click the Submit button")
    public void click_the_submit_button() {
        loginPage.clickLogin();
    }

    @Then("Take the screenshot")
    public void take_the_screenshot() {
    	 Serenity.takeScreenshot();
    }
}
