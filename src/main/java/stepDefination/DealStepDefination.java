package stepDefination;

import java.util.List;
import java.util.concurrent.TimeUnit;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class DealStepDefination 
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
		System.out.println("Url Open Sucessfully on the net");
		
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
	
	@Then("^user enters the email and the password$")
	public void user_enters_the_email_and_the_password(DataTable credentials)
	{
		List<List<String>> credentialValue =credentials.raw();
		WebDriverWait Wait = new WebDriverWait(driver, 30);
		Wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//input[@name='email']"))))
		.sendKeys(credentialValue.get(0).get(0));
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys(credentialValue.get(0).get(1));
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
	
	@Then("^user should moves to create new Deals Page$")
	public void user_should_moves_to_create_new_Deals_Page() throws InterruptedException  
	{
	    // Write code here that turns the phrase above into concrete actions
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//span[text()='Deals']")))).click();
		System.out.println("The Title of the Deals Screen is : "+ driver.getCurrentUrl());
		Thread.sleep(2000);
		wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//button[text()='New']")))).click();
		String actulUrl =driver.getCurrentUrl();
		String expectedUrl ="https://ui.freecrm.com/deals/new";
		Assert.assertEquals(expectedUrl, actulUrl);
		System.out.println("User Sucessfully Navigated to the Create new Deals Screen");
	}
	
	@Then("^user enters the new Deal Details$")
	public void user_enters_the_new_Deal_Details(DataTable dealData)
	{
		List<List<String>> dealValue =dealData.raw();
		
		driver.findElement(By.name("title")).sendKeys(dealValue.get(0).get(0));
		driver.findElement(By.name("amount")).sendKeys(dealValue.get(0).get(1));
		driver.findElement(By.name("probability")).sendKeys(dealValue.get(0).get(2));
		driver.findElement(By.name("commission")).sendKeys(dealValue.get(0).get(3));
		
	}
	
	@And("^Clicks on the Save Button$")
	public void Clicks_on_the_Save_Button() throws InterruptedException
	{
		driver.findElement(By.xpath("//button[text()='Save']")).click();
		Thread.sleep(3000);
	}
	
	@And("^Validate the deals got Sucessfully Created$")
	public void Validate_the_deals_got_to_Sucessfully_Created() throws InterruptedException
	{
		driver.findElement(By.xpath("//span[text()='Deals']")).click();
		Thread.sleep(3000);
		List<WebElement> title =driver.findElements(By.xpath("//table[@class='ui celled sortable striped table custom-grid table-scroll']/tbody/tr/td[2]"));
		for(int i=0; i<title.size();i++)
		{
			
			String titleOfTheDeal =title.get(i).getText();
			System.out.println("The Name of the dealTitle :" +titleOfTheDeal);
		}
		
	}
	
	@And("^Close the Browser$")
	public void Close_the_Browser()
	{
		driver.quit();
	}
	
}
