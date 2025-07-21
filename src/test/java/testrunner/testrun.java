package testrunner;

import io.cucumber.testng.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;

@CucumberOptions(tags="@smoke",
		features={"src/test/resources/features"},
		glue= {"stepdefinitions"},
		plugin = {"pretty",
			      "html:target/cucumber-reports.html",  // generates HTML report
			      "json:target/cucumber.json"}           // generates JSON report	
)
public class testrun extends AbstractTestNGCucumberTests{

}
