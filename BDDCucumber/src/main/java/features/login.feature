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


Feature: Login Feature
  Verify if user is able to Login in to the site
  
  #Parametrization testing Without Using Example keyword
Scenario: Login as a authenticated user
    Given user is  on homepage
    When user navigates to Login Page
    When user enters "erfahad54@gmail.com" and "360logica"
    Then success message is displayed
    Then LogOut from the Application
  
  #Parametrization testing With Using Example keyword
  
   Scenario Outline: user is able to create Contacts
    Given user is  on homepage1
    When user navigates to Login Page1
    When user enters the "<userName>" and "<passWord>"
    When user click on Contacts option
    When user click o New button
    Then user enters FirstName and LastName
    Then user click on save button
    Then verify newely created contacts

    Examples:
    | userName            | passWord  |
    | erfahad54@gmail.com | 360logica |
    
   
     
    