package stepdefinitions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;
import pageObjects.loginPage;

public class POMloginStepDefinitions {
	
	WebDriver driver; //= baseClass.driver;
	loginPage lp;
	
	@Given("user on the login page")
	public void user_on_the_login_page() {
		//ChromeOptions options=new ChromeOptions();
		//options.addArguments("--incognito");
	    driver = new ChromeDriver();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    }

	@When("provided {string} and {string}")
	public void provided_username_and_password(String username,String password) {
	    driver.get("https://www.saucedemo.com/v1/");
	    driver.manage().window().maximize();
	    lp=new loginPage(driver);
	    lp.enterUsername(username);
	    lp.enterpassword(password);
	}
	
	/*@When("provided username and password")
	public void provided_username_and_password() {
	    driver.get("https://www.saucedemo.com/v1/");
	    driver.manage().window().maximize();
	    driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys("standard_user");
	    driver.findElement(By.xpath("//input[@id='password']")).sendKeys("secret_sauce");
	}*/

	@When("clicked on login")
	public void clicked_on_login() {
		lp.loginbtn();
	}

	@Then("user navigated to homepage")
	public void user_navigated_to_homepage() {
	    boolean status=lp.verify_logo();
	    Assert.assertTrue(status);
	}

	@Then("close the browser")
	public void close_the_browser() {
	    driver.close();
	}

}
