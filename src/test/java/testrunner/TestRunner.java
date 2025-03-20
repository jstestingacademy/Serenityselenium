package testrunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
    features = "src/test/resources/Features",
    glue = "StepDefintions",
    plugin = {
        "pretty",
        "json:target/cucumber-report.json",
        "html:target/cucumber-report.html"
    },
    monochrome = true, // Cleaner console output
    tags = "@Regression" // Run only tests with the @Regression tag
)
public class TestRunner {
}
