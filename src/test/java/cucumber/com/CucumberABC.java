package cucumber.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CucumberABC
{
	WebDriver driver;
	@Given("^I have facebook link$")
	public void i_have_facebook_link() throws Throwable
	{
		System.setProperty("webdriver.chrome.driver", "Resource/chromedriver.exe");
	   	driver = new ChromeDriver();
	   	driver.navigate().to("https://www.facebook.com/");
	   	driver.manage().window().maximize();
	}

	@When("^I provide credential$")
	public void i_provide_credential() throws Throwable 
	{
	   System.out.println("Cucumber new install");
	}

	@Then("^I have loggin facebook$")
	public void i_have_loggin_facebook() throws Throwable
	{
		driver.quit();
	}

}
