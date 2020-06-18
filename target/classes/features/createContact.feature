Feature: Free CRM create new Contact feature

Scenario Outline: Free CRM login Test Scenario

Given user is already on Login Page
When title of login page is Free CRM
Then user enters the "<email>" and the "<password>"
Then user clicks on login button
Then user is on home page
Then user should moves to new Contact Page
Then user enters Contact Details "<firstname>" and "<lastname>"
Then user should Click on the Save button
And user should able to see the newly added Contact
And Close the Browser


Examples:

|email | password | firstname | lastname | 
| epsitajha2510@gmail.com | Btps_260 | Bandana | Das | 