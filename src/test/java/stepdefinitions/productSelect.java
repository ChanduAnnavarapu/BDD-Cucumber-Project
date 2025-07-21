package stepdefinitions;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import io.cucumber.java.en.*;

public class productSelect{
	
	@Given("select the price high to low from drop down")
	public void select_the_price_high_to_low_from_drop_down() {
		WebDriver driver=baseClass.driver;
	    WebElement drpCategoryele = driver.findElement(By.xpath("//select[@class='product_sort_container']"));
	    Select drpCategory = new Select(drpCategoryele);
	    drpCategory.selectByValue("hilo");
	}

	@When("add the highest priced item to the cart")
	public void add_the_highest_peiced_item_to_the_cart() {
		WebDriver driver=baseClass.driver;
	    driver.findElement(By.xpath("//div[@class='inventory_container']//div[1][@class='inventory_item']//button")).click();
	}

	@When("the same item should be available in cart")
	public void the_same_item_should_be_available_in_cart() {
		WebDriver driver=baseClass.driver;
		driver.findElement(By.xpath("//*[name()='path' and contains(@fill,'currentCol')]")).click();

	}

	@Then("user should proceed with order by proving details")
	public void user_should_proceed_with_order_by_proving_details() {
		WebDriver driver=baseClass.driver;
	    driver.findElement(By.xpath("//a[@class='btn_action checkout_button']")).click();
	}

	@Then("click on finish")
	public void click_on_finish() {
		WebDriver driver=baseClass.driver;
		driver.findElement(By.xpath("//input[@id='first-name']")).sendKeys("abcd");
		driver.findElement(By.xpath("//input[@id='last-name']")).sendKeys("klmn");
		driver.findElement(By.xpath("//input[@id='postal-code']")).sendKeys("1234");
		driver.findElement(By.xpath("//input[@value='CONTINUE']")).click();
	}

	@Then("validate the success message of order placed")
	public void validate_the_success_message_of_order_placed() {
		WebDriver driver=baseClass.driver;
		driver.findElement(By.xpath("//a[normalize-space()='FINISH']")).click();
		boolean status=driver.findElement(By.xpath("//h2[normalize-space()='THANK YOU FOR YOUR ORDER']")).isDisplayed();
		Assert.assertTrue(status);
	}

}
