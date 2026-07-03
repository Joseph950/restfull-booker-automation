package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.runner.RunWith;
import reports.CucumberReport;

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
        tags = "@prueba"
)

public class RunCucumber {
        public RunCucumber() {
        }

        @AfterClass
        public static void tearDown() {
                CucumberReport.generateReport();
        }

}
//target\reports\cucumber.json (El sistema no puede encontrar la ruta especificada)