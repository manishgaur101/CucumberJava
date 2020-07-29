#Author: your.email@your.domain.com


Feature: Login functionality feature
  I want to test Login functionality with positive and nagetive data

 Background: User shold be at Home Page
 Given User is navigate to automationpractice Login Page
 
 @Sanity
  Scenario: Login with valid credentials
  #Given User is navigate to automationpractice Login Page
  * User login with below credentials
  | UserName |OTP  | Password   |
  | Manish1  | 9087|Password123 |
  | Manish2  | 4561|Password567 |
  * Click on Submit button
  * Login should be successful
 
  
  @Regression
  Scenario Outline: Login with invalid credentials
  Given User is navigate to automationpractice Login Page
  * User is at "Home" page
  * User enter text in "userName" field as "Manish1"
  * User enter credentials as <UserName> and <Password>
  And Click on Submit button
  * User is at "Dashboard" page
  
  Then Login should not be successful
Examples:
  | UserName |OTP  | Password   |
  | Manish1  | 9087|Password123 |
  | Manish2  | 4561|Password567 |


