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

Feature: Title of your feature
  I want to use this template for my feature file

  Scenario: Login feature
    Given user is  on homepag
    When user navigates to Log
    Then Tite of The page is

  #Scenario: steps feature
    #Given user is  on homepag1
    #When user navigates to Log1
    #Then Tite of The page is1
#
  #Scenario: Logout featurea
    #Given user is  on homepag2
    #When user navigates to Log2
    #Then Tite of The page is2
