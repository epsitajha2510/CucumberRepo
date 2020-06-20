package stepDefination;

import cucumber.api.java.en.Given;

public class SecondFeatureFileStepDefinationFile 
{
	@Given("^User should be on the Facebook Login Screen$")
	public void user_should_be_on_the_Facebook_Login_Screen() throws Throwable 
	{
	    System.out.println(" User Should Login Into the FaceBook Login Screen");
	}
}
