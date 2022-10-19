#Author: Natalia Besleneeva
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
@sanity
Feature: To Test Web Order Order Functionality

  Background: Successful Login with Valid Credentials in Web Order App
    Given User navigating to Web Order website page
    When User Enter the keyword "Tester" in the username field
    And User Enter the keyword "test" in the password field
    And User click on Login Button
    Then User should see "Welcome, Tester!" is displayed
    And User should see "List of All Orders" is displayed

  Scenario: Successful Order in Web Orders App
    And User Clicks on Order Button
    And User enters Product, Quantity, Price per unit, Discount,Total, Customer name, Street, City, State, Zip, Card, Card number, Expire date in Web Order
    And User Click on Process Button
    Then User should see "New order has been successfully added" is displayed
