package testrunner;

import io.cucumber.testng.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;

@CucumberOptions(tags="",
		features={"src/test/resources/feature/backgroundScenario.feature"},
		glue= {"stepdefinitions","testBase"},
		plugin = {"pretty",
			      "html:target/cucumber-reports.html",  // generates HTML report
			      "json:target/cucumber.json"}           // generates JSON report	
)
public class testrun extends AbstractTestNGCucumberTests{

}
