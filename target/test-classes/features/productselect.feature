
Feature: Add the product to the cart
 @product
  Background:  user login to application
	  	Given user on the login page
	    When provided username and password
	    And clicked on login
	    Then user navigated to homepage
    
    Scenario:  adding product to the cart
		    Given select the price high to low from drop down
		    When add the highest priced item to the cart
		    And the same item should be available in cart
		    Then user should proceed with order by proving details
		    And click on finish
		    And validate the success message of order placed
		    And close the browser
 
 #//div[@class='pricebar']//button[text()='ADD TO CART']
 #//div[@class='inventory_container']//div[1][@class='inventory_item']//button

