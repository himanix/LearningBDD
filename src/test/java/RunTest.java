import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src\\main\\java\\feature\\search.feature"
        ,glue="StepDefinitions"
        ,plugin={"pretty","json:target/cucumberreports.json"}
)
public class RunTest {
}
