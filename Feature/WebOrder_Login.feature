#Author: Natalia Besleneeva
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
Feature: To Test WebOrder login functionality

  @smoke
  Scenario: Successful Web Order Login with Valid Input
    Given User navigating to Web Order website page
    When User Enter the keyword "Tester" in the username field
    And User Enter the keyword "test" in the password field
    And User click on Login Button
    Then User should see "Welcome, Tester!" is displayed
    Then User should see "List of All Orders" is displayed

  Scenario: Successful LogOut
    When User click on  LogOut link from the home page
    Then User should be taken back to Login page
