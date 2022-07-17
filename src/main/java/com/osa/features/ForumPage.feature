
Feature: We are going to verify forum page 

	Scenario: I should be able to verify that I am on currect OSA forum apge
		Given I am on OSA forum page
		When I retrive the page title
		Then I verify the page title