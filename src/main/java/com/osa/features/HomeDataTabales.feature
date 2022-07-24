Feature: We will learn how data table is work in cucumber
	@regression
	Scenario: I should be able to pass data from feature file data table
		Given I am on OSA forum page
		And I enter user login credentials
				|"user1@gmail.com"|"pass1"|
		When I click on login button
    Then I verify that I am on student page
    And I want to close the browser