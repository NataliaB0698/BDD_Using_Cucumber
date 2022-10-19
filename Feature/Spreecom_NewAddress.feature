#Author: Natalia Besleneeva
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
@sanity
Feature: To Test Web Order Order Functionality

  Background: Successful Spree Login with Valid Input
    Given User navigating to Spree website page
    When User select Login Button from drop down
    When User Enter "Natalia@spree.com" in the email field
    And User Enter the "spree123" in the password field
    And User click on Login Button
    Then User should see "My Account" is displayed
    Then User should see "Logged in successfully" is displayed

  Scenario: Successful Create new address in Spree website
    And User Clicks on Add new address Button
    And User enters home name, first name, last name, address, city, state, zipcode, country, phone number,
    And User Click on Save Button
    Then User should see "New address has been successfully created" is displayed
