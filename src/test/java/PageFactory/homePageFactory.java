package PageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class homePageFactory extends basePage{
	
	public homePageFactory(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(xpath="//div[@class='app_logo']") WebElement lbl_logo;
	@FindBy(xpath="//a[@class='shopping_cart_link fa-layers fa-fw']//*[name()='svg']") WebElement icn_cart;
	@FindBy(xpath="//select[@class='product_sort_container']") WebElement prd_filter;
	@FindBy(xpath="//div[@class='inventory_list']//div[1]//div[3]//button[1]") WebElement add_to_cart;
	
	public void addToCart() {
		add_to_cart.click();
	}
	
	public void product_filter() {
		WebElement drpfilterEle = prd_filter;
		Select drpfilter = new Select(drpfilterEle);
		drpfilter.selectByValue("hilo");
	}
	
	public void gotoCart() {
		icn_cart.click();
	};
	
	public boolean verify_logo() {
		return lbl_logo.isDisplayed();
	}

}
