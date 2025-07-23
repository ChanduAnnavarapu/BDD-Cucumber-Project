package testBase;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;

public class baseClass {
	 private static WebDriver driver;

	    public static void initializeDriver() {
	        if (driver == null) {
	        	WebDriverManager.chromedriver().setup();
	        	ChromeOptions options = new ChromeOptions();
				options.addArguments("--incognito");
	            driver = new ChromeDriver(options);
	            driver.manage().window().maximize();
	            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	        }
	    }

	    public static WebDriver getDriver() {
	        return driver;
	    }

	    public static void quit() {
	        if (driver != null) {
	            driver.quit();
	            driver = null;
	        }
	    }
	    
	    @Before
	    public void setUp() {
	        baseClass.initializeDriver();
	    }

	    @After
	    public void tearDown() {
	        WebDriver driver = baseClass.getDriver();
	        if (driver != null) {
	            driver.quit();
	        }
	    }
}
