Feature: Free CRM login feature


#With Example Keywords
#Scenario: Free CRM login Test Scenario
#Given user is already on Login Page
#When title of login page is Free CRM
#Then user enters the "epsitajha2510@gmail.com" and the "Btps_260"
#Then user clicks on login button
#Then user is on home page


# Without Example Keywords
Scenario Outline: Free CRM login Test Scenario

Given user is already on Login Page
When title of login page is Free CRM
Then user enters the "<email>" and the "<password>"
Then user clicks on login button
Then user is on home page

Examples:
| email | password|
| epsitajha2510@gmail.com | Btps_260 |
