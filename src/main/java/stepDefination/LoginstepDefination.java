/*package stepDefination;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class LoginstepDefination 
{

	WebDriver driver;
	@Given("^user is already on Login Page$")
	public void user_is_already_on_Login_Page()  
	{
		
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		driver= new  ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.get("https://ui.freecrm.com/");
		System.out.println("Url Open Sucessfully");
		
	}
	

	@When("^title of login page is Free CRM$")
	public void title_of_login_page_is_Free_CRM()  
	{
		System.out.println("Hello");
	    
		String ExpectedTitle= "Cogmento CRM";
		System.out.println(ExpectedTitle);
		String ActualTitle = driver.getTitle();
		System.out.println(ActualTitle);
		Assert.assertEquals(ExpectedTitle, ActualTitle);
		System.out.println("Then Title Of the Login Screen : "+ ActualTitle);
	    
	}

	@Then("^user enters the \"(.*)\" and the \"(.*)\"$")
	public void user_enters_the_username_and_the_Password(String username, String password)  {
	    // Write code here that turns the phrase above into concrete actions
		 WebDriverWait Wait = new WebDriverWait(driver, 30);
		Wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//input[@name='email']"))))
		.sendKeys(username);
		//driver.findElement(By.xpath("//input[@name='email']")).sendKeys("epsitajha2510@gmail.com");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys(password);
		
	    
	}

	@Then("^user clicks on login button$")
	public void user_clicks_on_login_button() 
	{
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.xpath("//div[text()='Login']")).click();
		
	    
	}

	@Then("^user is on home page$")
	public void user_is_on_home_page()  {
	    // Write code here that turns the phrase above into concrete actions
		//WebElement homeEle = driver.findElement(By.xpath("//span[text()='Home']"));
		 WebDriverWait wait = new WebDriverWait(driver, 30);
		 wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//span[text()='Home']"))));
		 System.out.println("User Sucessfully navigated to the Home Screen");
	    
	}
	
	
	@Then("^user should moves to new Contact Page$")
	public void user_should_moves_to_new_Contact_Page() throws InterruptedException  {
	    // Write code here that turns the phrase above into concrete actions
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//a[@href='/contacts']")))).click();
		System.out.println("The Title of the Contact SCreen is : "+ driver.getCurrentUrl());
		Thread.sleep(2000);
		wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//button[text()='New']")))).click();
		 String actulUrl =driver.getCurrentUrl();
		 String expectedUrl ="https://ui.freecrm.com/contacts/new";
		 Assert.assertEquals(expectedUrl, actulUrl);
		 System.out.println("User Sucessfully Navigated to the Create Contact Screen");
	    
	}

	@Then("^user enters Contact Details \"([^\"]*)\" and \"([^\"]*)\"$")
	public void user_enters_Contact_Details_and_and(String firstanme, String lastname)  {
	    // Write code here that turns the phrase above into concrete actions
		
		driver.findElement(By.name("first_name")).sendKeys(firstanme);
		driver.findElement(By.name("last_name")).sendKeys(lastname);
		    
	}
	
	@Then("^user should Click on the Save button$")
	public void user_should_Click_on_the_Save_button() throws InterruptedException
	{
		driver.findElement(By.xpath("//button[text()='Save']")).click();
		Thread.sleep(3000);
	}
	
	@And("^user should able to see the newly added Contact$")
	public void user_should_able_to_see_the_newly_added_Contact() throws InterruptedException
	{
		driver.findElement(By.xpath("//a[@href='/contacts']")).click();
		Thread.sleep(3000);
		java.util.List<WebElement> contactName =driver.findElements(By.xpath("//table[@class='ui celled sortable striped table custom-grid table-scroll']/tbody/tr/td[2]"));
		for(int i=0; i<contactName.size();i++)
		{
			
			String nameofConatct =contactName.get(i).getText();
			System.out.println("The Name of the Contacts :" +nameofConatct);
		}
		
	}
	
	@And("^Close the Browser$")
	public void Close_the_Browser()
	{
		driver.quit();
	}
	 
	
	
}
*/