import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(strict = true,
    features = {"classpath:feature/Login.feature"},
    format = {"json:target/cucumber-parallel/1.json", "html:target/cucumber-parallel/1.html", "pretty"},
    monochrome = false,
    tags = {"~@ignored"},
    glue = { "StepDefinitions" })
public class Parallel01IT {
}