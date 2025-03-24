package testrunner;

import net.serenitybdd.cucumber.CucumberWithSerenity;


import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;
@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        plugin = {"pretty", "html:target/cucumber-report.html"},
        features = "src/test/resources/features",
        glue = "StepDefintions"  // Ensure this matches your actual package
)
public class TestRunner {
}
