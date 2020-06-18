Feature: Deal data creation 

Scenario: Free CRM create adeal scenario 

	Given user is already on Login Page 
	When title of login page is Free CRM 
	Then user enters the email and the password 
		| epsitajha2510@gmail.com | Btps_260 |
	Then user clicks on login button 
	Then user is on home page 
	Then user should moves to create new Deals Page 
	Then user enters the new Deal Details 
		| Test Analyst | 2000 | 50 | 60 |
	And Clicks on the Save Button 
	And Validate the deals got Sucessfully Created 
	And Close the Browser