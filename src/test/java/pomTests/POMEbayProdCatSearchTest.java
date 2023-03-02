package pomTests;

import org.openqa.selenium.WebDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

import pompages.BrowserFactory;

public class POMEbayProdCatSearchTest {
  @Test
  public void catSearch()
  {
	  WebDriver driver=BrowserFactory.startBrowser("Chrome","http://ebay.com");
	  ClsEbay obj=new ClsEbay(driver);
	  obj.fncatSearch("Camers & Photos","Sony");
	  Reporter.log("Ebay product search in a category test is successful...",true);
  }
}
