package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.After;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src\\test\\resources\\features",
        glue = {
                "steps",
                "hooks"
        },
        plugin = {
                "pretty",
                "html:target/reports/cucumber.html",
                "json:target/reports/cucumber.json"
        },
        publish = true,
        tags = "@first"
)

public class RunCucumber {

}
