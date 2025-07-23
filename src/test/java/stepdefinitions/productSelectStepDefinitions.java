package stepdefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import PageFactory.cartPageFactorty;
import PageFactory.homePageFactory;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;
import testBase.baseClass;

public class productSelectStepDefinitions {
	WebDriver driver;
	homePageFactory hpf;
	cartPageFactorty cpf;
	
	@When("select the filter of price high to low")
	public void select_the_filter_of_price_high_to_low() throws InterruptedException {
		driver=baseClass.getDriver();
		hpf = new homePageFactory(driver);
		boolean status=hpf.verify_logo();
	    Assert.assertEquals(status,true);
	    Thread.sleep(3000);
		hpf.product_filter();
	}

	@When("select the product having highest price")
	public void select_the_product_having_highest_price() {
		hpf.addToCart();
	}

	@Then("product is added in the cart")
	public void product_is_added_in_the_cart() {
		hpf.gotoCart();
	}

	@Then("details of the product should be proper")
	public void details_of_the_product_should_be_proper() {
		driver=baseClass.getDriver();
		cpf = new cartPageFactorty(driver);
		boolean status = cpf.itemName();
		Assert.assertEquals(status, true);
	}

	@Then("proceed the order to complete")
	public void proceed_the_order_to_complete() {
		cpf.clickCheckout();
	}

	@When("provide the user details and address details")
	public void provide_the_user_details_and_address_details() {
		cpf.cartDetails();
		cpf.btnContinue();
	}

	@Then("click on finish")
	public void click_on_finish() {
		cpf.clickFinish();
	}

	@Then("verify the success message after order placed")
	public void verify_the_success_message_after_order_placed() throws InterruptedException {
		Thread.sleep(3000);
		String value = cpf.validateSuccessMsg();
		Assert.assertEquals("THANK YOU FOR YOUR ORDER", value);
	}

}
