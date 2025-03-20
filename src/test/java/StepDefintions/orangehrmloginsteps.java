package StepDefintions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Pages.Orangehrmlogin;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import net.serenitybdd.annotations.Managed;
import net.serenitybdd.annotations.Steps;
import net.serenitybdd.core.Serenity;

public class orangehrmloginsteps {

	@Managed
    WebDriver driver;
    
    @Steps
    Orangehrmlogin login;

    @Given("To launch the browser and enter the url")
    public void to_launch_the_browser_and_enter_the_url() {
        login.open(); // Let Serenity handle opening the browser and URL
    }

    @When("Enter the username and password")
    public void enter_the_username_and_password() {
        login.enterusername("Admin");
        login.enterpassword("admin123");
    }

    @When("Click the Submit button")
    public void click_the_submit_button() {
        login.clickbutton();
    }

    @Then("Take the screenshot")
    public void take_the_screenshot() {
        Serenity.takeScreenshot(); // Takes a screenshot using Serenity
    }


}
