package extentreports.com;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class NewTest
{
  WebDriver driver;
  ExtentHtmlReporter htmlReporter;
  ExtentReports extent;
  ExtentTest test;
  
  By locator_userName=By.id("txtUsername");
  By locator_password=By.id("txtPassword");
  By locator_login=By.id("btnLogin");
  
  @Test
  public void f() 
  {
	  try
	  {
		  WebElement username = driver.findElement(locator_userName);
		  username.sendKeys("Admin");               //  ""
		  test.log(Status.PASS, "UserName Loggin Successfully");
	}
	  catch (Exception e) 
	  {
		test.log(Status.FAIL, "UserName Loggin Not Successfully");
	}
	    try {
	    	WebElement password = driver.findElement(locator_password);
	    	password.sendKeys("admin");
	    	test.log(Status.PASS, "Password Loggin Successfully");
		} 
	    catch (Exception e) 
	    {
	    	test.log(Status.FAIL, "Password Loggin Not Successfully");
		} 
	  try 
	  {
		  WebElement login = driver.findElement(locator_login);
		  login.click();
		  test.log(Status.PASS, "Loggin ClickButton Successfully");
	} 
	  catch (Exception e) 
	  {
		  test.log(Status.FAIL, "Loggin ClickButton Not Successfully");
	}
	 
  }
  
  @BeforeTest
  public void beforeTest() 
  {
	  htmlReporter = new ExtentHtmlReporter("extent.html");
	  
	  extent = new ExtentReports();
	  extent.attachReporter(htmlReporter);
	  
	  test = extent.createTest("ExtentReportDemo");
	  
	  try {
		   System.setProperty("webdriver.chrome.driver", "Resource/chromedriver.exe");
		   driver = new ChromeDriver();
		   test.log(Status.PASS, "My Browser got initated");
		   
		   driver.navigate().to("http://opensource.demo.orangehrmlive.com/index.php/auth/login");
		   driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		   test.log(Status.PASS, "My OrangeSite got Open");
		
	} 
	  catch (Exception e)
	  {
		  test.log(Status.FAIL, "My BeforeTest is Not Working");
	}
	  
	 
  }

  @AfterTest
  public void afterTest() 
  {
	  extent.flush();
	  driver.quit(); 
  }

}
