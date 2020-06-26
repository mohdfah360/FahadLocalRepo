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
Feature: Create Deals
  I want to create some deal with Map object

  Scenario: creating deals for authenticated user
    Given user is  on homepage again and again
    When user navigates to Login Page again and again
    When user try to enters userName and password again
      | USERNAMES | erfahad54@gmail.com |
      | PASSWORD  | 360logica |
    #Then user click on Deals Page again
    #Then user click on newDeals button again
    #Then user enters all details as click on save button again
    #  | Title | Probability | Descrition |
    #  | Mr    |          33 | 360Logica  |
   # Then Deals Created again
