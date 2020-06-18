@2ndfeaturefile
Feature: Facebook application testing

@SmokeTest @RegressionTest
Scenario: Login with correct username and correct password
Given User should be on the Facebook Login Screen

@RegressionTest
Scenario: Login with incorrect username and correct password
Given This is a invalid login test

@SmokeTest
Scenario: Create a contact
Given This is a contact test case