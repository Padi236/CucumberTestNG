package stepDefinition;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefLogin {
	
	WebDriver driver;
	
	@Before
	public void setup()
	{
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}
	
	
	@Given("Enter Url Enter the url {string}")
	public void enter_url_enter_the_url(String string) {
	    driver.get(string);
	}

	@When("Input username as {string} and password as {string}")
	public void input_username_as_and_password_as(String string, String string2) {
	    
		driver.findElement(By.name("myusername")).sendKeys(string);
		driver.findElement(By.name("mypassword")).sendKeys(string2);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
	}
	
	@Then("Verify the {string} in step")
	public void verify_the_in_step(String string) throws InterruptedException  {
		
		Thread.sleep(5000);
		
		if(string.equals("success"))
		{
			assertEquals(driver.getTitle(), "Enquiries", "Homepage Title does not match");
		}
		else if(string.equals("fail"))
		{
			assertEquals(driver.getTitle(), "Login - Riddhi Co-op Housing Society Admin", "LoginPage Title does not match");
		}
	}
	
	
	@After
	public void tearDown()
	{
		driver.close();
	}
}
