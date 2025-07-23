package PageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class loginPagefactory extends basePage{
	
	WebDriver driver;
	public loginPagefactory(WebDriver driver) {
		super(driver);
	}

	@FindBy(xpath="//input[@id='user-name']") WebElement txt_username;
	@FindBy(xpath="//input[@id='password']") WebElement txt_password;
	@FindBy(xpath="//input[@id='login-button']") WebElement btn_login;

	public void enterUsername(String username) {
		txt_username.sendKeys(username);
	}

	public void enterpassword(String password) {
		txt_password.sendKeys(password);
	}

	public void loginbtn() {
		btn_login.click();
	}

	public void user_login(String username, String password) {
		txt_username.sendKeys(username);
		txt_password.sendKeys(password);
		btn_login.click();
	}


}
