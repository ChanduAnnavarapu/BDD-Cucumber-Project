package PageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class cartPageFactorty extends basePage {
	public cartPageFactorty(WebDriver driver) {
		super(driver);
	}

	@FindBy(xpath = "//a[normalize-space()='CHECKOUT']")
	WebElement btn_checkout;
	@FindBy(xpath = "//a[normalize-space()='Continue Shopping']")
	WebElement btn_cnt_shopping;
	@FindBy(xpath = "//div[@class='inventory_item_name']")
	WebElement item_name;
	@FindBy(xpath = "//input[@id='first-name']")
	WebElement txt_fname;
	@FindBy(xpath = "//input[@id='last-name']")
	WebElement txt_lname;
	@FindBy(xpath = "//input[@id='postal-code']")
	WebElement txt_postalcode;
	@FindBy(xpath = "//input[@value='CONTINUE']")
	WebElement btn_continue;
	@FindBy(xpath = "//a[normalize-space()='FINISH']")
	WebElement btn_finish;
	@FindBy(xpath = "//h2[normalize-space()='THANK YOU FOR YOUR ORDER']")
	WebElement success_msg;

	public void btnContinue() {
		btn_continue.click();
		}
	
	public String validateSuccessMsg() {
		return success_msg.getText();
	}

	public void clickFinish() {
		btn_finish.click();
	}

	public void cartDetails() {
		txt_fname.sendKeys("abcd");
		txt_lname.sendKeys("abcd");
		txt_postalcode.sendKeys("12345");
	}

	public boolean itemName() {
		return item_name.isDisplayed();
	}

	public void clickCheckout() {
		btn_checkout.click();
	}
}
