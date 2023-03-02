package pomTests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EbayProdSearchTest {
  @Test
  public void prodSearch() 
  {
	  WebDriverManager.chromedriver().browserVersion("110").setup();
	  WebDriver driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("http://www.ebay.com");
	  driver.findElement(By.id("gh-ac")).sendKeys("Sony");
	  driver.findElement(By.id("gh-btn")).click();
	  Reporter.log("Ebay product search test is successful...",true);
  }
}