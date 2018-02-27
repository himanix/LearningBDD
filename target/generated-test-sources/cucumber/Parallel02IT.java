import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(strict = true,
    features = {"classpath:feature/search.feature"},
    format = {"json:target/cucumber-parallel/2.json", "html:target/cucumber-parallel/2.html", "pretty"},
    monochrome = false,
    tags = {"~@ignored"},
    glue = { "StepDefinitions" })
public class Parallel02IT {
}