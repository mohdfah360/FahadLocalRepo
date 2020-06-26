#Author: your.email@your.domain.com
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
Feature: Create Deals
  I want to create some deals
 
 Scenario: creating deals for authenticated user
    Given user is  on homepage again
    When user navigates to Login Page again
    When user try to enters userName and password
    | erfahad54@gmail.com | 360logica |
    Then user click on Deals Page
    Then user click on newDeals button
    Then user enters all details as click on save button
    | Mr | 33 | 360Logica |
    Then Deals Created
    
