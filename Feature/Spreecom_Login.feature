#Author: Natalia Besleneeva
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
Feature: To Test Spree login functionality

  @smoke
  Scenario: Successful Spree Login with Valid Input
    Given User navigating to Spree website page
    When User select Login Button from drop down
    When User Enter "Natalia@spree.com" in the email field
    And User Enter the "spree123" in the password field
    And User click on Login Button
    Then User should see "My Account" is displayed
    Then User should see "Logged in successfully" is displayed

  Scenario: Successful LogOut
    When User click on  LogOut link from the home page
    Then User should be taken back to Login page
