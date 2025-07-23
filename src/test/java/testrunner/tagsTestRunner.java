package testrunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(tags="(@tag and @smoke) and not @perf",
features={"src/test/resources/featureWithTags"},
glue= {"stepdefinitions"},
plugin = {"pretty",
	      "html:target/cucumber-reports.html",  // generates HTML report
	      "json:target/cucumber.json"}           // generates JSON report	
)

public class tagsTestRunner extends AbstractTestNGCucumberTests{

}
