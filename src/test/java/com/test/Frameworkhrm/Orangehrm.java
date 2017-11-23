package com.test.Frameworkhrm;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;

public class Orangehrm 
{
  WebDriver driver;
  @BeforeClass
  public void beforeClass()
  {
	   ChromeOptions opt = new ChromeOptions();
//	   opt.addArguments("--incognito");
	   opt.addArguments("--start-maximized");
	   System.setProperty("webdriver.chrome.driver", "Resource/chromedriver.exe");
	   driver = new ChromeDriver(opt);
	   driver.navigate().to("http://opensource.demo.orangehrmlive.com/index.php/auth/login");
	   driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
       driver.manage().window().maximize();
       
       driver.findElement(By.id("txtUsername")).sendKeys("Admin");
	   driver.findElement(By.id("txtPassword")).sendKeys("admin");
	   driver.findElement(By.id("btnLogin")).click();
 } 
  @Test
  public void f()
  {
	 
	System.out.println("orangehrm");  
	   
  }
  
          //""

  @AfterClass
  public void afterClass() 
  {
	  driver.quit();
  }

}
