Feature: Verifing OSA Consulting Tech Corp Forum Loging

  Scenario Outline: As a OSA registered user, I should be able to login in Forum by using my valid username and Password
    Given I am on OSA forum page
    And I enter username <username>
    And I enter password <password>
    When I click on login button
    Then I verify that I am on student page

    Examples: 
      | username          | password |
      | "user1@gmail.com" | "pass1"  |
      | "user2@gmail.com" | "pass2"  |
      | "user3@gmail.com" | "pass3"  |
      | "user4@gmail.com" | "pass4"  |
      | "user5@gmail.com" | "pass5"  |
      | "user6@gmail.com" | "pass6"  |
