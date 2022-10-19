#Author: Natalia
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
@tag
Feature: Default Country for Spreecom should be USA

  Scenario: Verify that Default Country for Spreecom should display USA and Satus Code 200
    Given I user send GET request to Server
    When I enter all the details
    Then I should get Response with status code 200
    And iso_name should be 'USA'

 