package Calculator.CalculatorAutomation;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;

import org.openqa.selenium.By;		
import org.openqa.selenium.WebDriver;


public class SmokeTest {
	private WebDriver driver;	
  @Test
  public void f() {
	  driver.get("http://demo.guru99.com/test/guru99home/"); 
		//driver.get("http://www.google.co.in");
		String title = driver.getTitle();				 
		Assert.assertTrue(title.contains("Demo Guru99 Page")); 
  }
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
	    driver = new ChromeDriver();  
  }

  @AfterTest
  public void afterTest() {
	  driver.quit();	
  }

}
