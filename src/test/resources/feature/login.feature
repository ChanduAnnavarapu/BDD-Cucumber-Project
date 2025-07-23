
Feature: verifying the login scenario

	@smoke
  Scenario Outline: verify the login with valid credentials
    Given user on the login page
    When provided "<username>" and "<password>"
    And clicked on login
    Then user navigated to homepage
    And close the browser
    
 	Examples:
 	| username | password |
 	| standard_user | secret_sauce |
	| locked_out_user | secret_sauce |
	| problem_user | secret_sauce |
	| performance_glitch_user | secret_sauce |