package stepdefinitions;

import java.time.Duration;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import PageFactory.homePageFactory;
import PageFactory.loginPagefactory;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;
import testBase.baseClass;

public class PageFactoryloginStepDefinitions {
	 WebDriver driver;
	 loginPagefactory lpf;
	 homePageFactory hpf;
	
	@Given("user on the login page")
	public void user_on_the_login_page() {
		driver=baseClass.getDriver();
		driver.get("https://www.saucedemo.com/v1/");
	    driver.manage().window().maximize();
		/* ChromeOptions options = new ChromeOptions();
			options.addArguments("--incognito");
		    driver = new ChromeDriver(options);
		    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));*/
	    }

	@When("provided {string} and {string}")
	public void provided_username_and_password(String username,String password) {
	    lpf = new loginPagefactory(driver);
	    lpf.enterUsername(username);
	    lpf.enterpassword(password);
	}

	@When("clicked on login")
	public void clicked_on_login() {
		lpf.loginbtn();
	}

	@Then("user navigated to homepage")
	public void user_navigated_to_homepage() {
		hpf = new homePageFactory(driver);
	    boolean status=hpf.verify_logo();
	    Assert.assertEquals(status,true);
	}
	
	@Then("close the browser")
	public void close_the_browser() {
		driver.quit();
	}

}
