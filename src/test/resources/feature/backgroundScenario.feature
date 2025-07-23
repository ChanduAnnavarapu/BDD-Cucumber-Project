
Feature: Title of your feature
  I want to use this template for my feature file

Background: user login to the page
	Given user on the login page
    When provided "standard_user" and "secret_sauce"
    And clicked on login
    Then user navigated to homepage
    
  @cart
  Scenario: add products to the cart
    When select the filter of price high to low
    And select the product having highest price
    Then product is added in the cart
    And details of the product should be proper
    Then proceed the order to complete
    When provide the user details and address details
    Then click on finish
    And verify the success message after order placed
    And close the browser


