package Runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"pretty",
                "html:target/cucumber-html-report",
                "json:target/cucumber.json",
                "junit:target/cucumber.xml"},
        glue = "steps",
        features = "C:\\Users\\Administrator.DESKTOP-DMM2MC9\\IdeaProjects\\ExtentReportPractice\\src\\test\\resources\\features",
        dryRun = false
)
public class Runner {

}
