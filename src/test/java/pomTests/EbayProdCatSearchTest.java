package pomTests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Reporter;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EbayProdCatSearchTest {
  @Test
  public void catSearch() 
  {
	  WebDriverManager.chromedriver().browserVersion("110").setup();
	  WebDriver driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("http://www.ebay.com");
	  WebElement dd=driver.findElement(By.id("gh-cat"));
	  Select s=new Select(dd);
	  s.selectByVisibleText("Camers & Photo");
	  driver.findElement(By.id("gh-ac")).sendKeys("Sony");
	  driver.findElement(By.id("gh-btn")).click();
	  Reporter.log("Ebay product search in a category test is successful...",true);
  
  }
}
