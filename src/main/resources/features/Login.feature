Feature: Login test cases for orange HRM application
  Scenario: Login with valid username and valid password
    Given User enters valid username
    And user enters valid password
    And user click on Login button
    Then  Home page should be displayed.
