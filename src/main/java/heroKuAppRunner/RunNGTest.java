package heroKuAppRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "src/test/resources/features/HeroKuApp.feature", glue = { "stepDefinitions",
		"objects" }, plugin = "html:target/cucumber-report.html", tags = "@Smoke")
public class RunNGTest extends AbstractTestNGCucumberTests{

}
