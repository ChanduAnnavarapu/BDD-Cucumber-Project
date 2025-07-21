package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class loginPage {
WebDriver driver;

@FindBy(xpath="//input[@id='user-name']") WebElement txt_username;
@FindBy(xpath="//input[@id='password']") WebElement txt_password;
@FindBy(xpath="//input[@id='login-button']") WebElement btn_login;
@FindBy(xpath="//div[@class='app_logo']") WebElement lbl_logo;

public loginPage(WebDriver driver) {
	this.driver=driver;
}

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

public boolean verify_logo() {
	return lbl_logo.isDisplayed();
}
}
