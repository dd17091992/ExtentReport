package cucumber.com;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;

public class GridNew
{ 
  WebDriver driver;
  @Test
  public void f()
  {
	  System.out.println("New Grid Project");              // ""
  }
  
  @BeforeClass
  public void beforeClass() throws MalformedURLException 
  {
	  DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
	  desiredCapabilities.setBrowserName("chrome");
	  driver = new RemoteWebDriver(new URL("http://192.168.1.101:4444/wb/hub "), desiredCapabilities);
	  driver.navigate().to("https://www.facebook.com/");
	  driver.manage().window().maximize();
  }

  @AfterClass
  public void afterClass()
  {
	 driver.quit();
  }

}
