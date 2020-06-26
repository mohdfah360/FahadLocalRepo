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

Feature: Create Contacts
  
  I want to create some contacts

   Scenario Outline: user is able to create Contacts
    Given user is  on homepage1
    When user navigates to Login Page1
    When user enters the "<userName>" and "<passWord>"
    When user click on Contacts option
    When user click o New button
    Then user enters "<FirstName>" and The "<LastName>"
    Then user click on save button
    Then move to home Page 
    
    Examples: 
      | userName             | passWord  | FirstName  | LastName |
      | erfahad54@gmail.com  | 360logica | Test1      | Test2    |
      | mofahad1992@gmail.com| 460Logica | Test3      | Test4    |
