package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class loginPage {
	WebDriver driver;

	By txt_username = By.xpath("//input[@id='user-name']");
	By txt_password = By.xpath("//input[@id='password']");
	By btn_login = By.xpath("//input[@id='login-button']");
	By lbl_logo = By.xpath("//div[@class='app_logo']");

	public loginPage(WebDriver driver) {
		this.driver = driver;
	}

	public void enterUsername(String username) {
		driver.findElement(txt_username).sendKeys(username);
	}

	public void enterpassword(String password) {
		driver.findElement(txt_password).sendKeys(password);
	}

	public void loginbtn() {
		driver.findElement(btn_login).click();
	}

	public void user_login(String username, String password) {
		driver.findElement(txt_username).sendKeys(username);
		driver.findElement(txt_password).sendKeys(password);
		driver.findElement(btn_login).click();
	}

	public boolean verify_logo() {
		return driver.findElement(lbl_logo).isDisplayed();
	}
}
