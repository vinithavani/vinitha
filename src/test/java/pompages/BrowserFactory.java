package pompages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserFactory 
{
	public static WebDriver wd;
	public static WebDriver startBrowser(String bName,String url)
	{
		if(bName.equalsIgnoreCase("Chrome"))
		{
			WebDriverManager.chromedriver().browserVersion("110").setup();
		wd=new ChromeDriver();
		}
		else if(bName.equalsIgnoreCase("ChromeDriver"))
	{
		WebDriverManager.chromedriver().browserVersion("110").setup();
		wd=new ChromeDriver();
	}
	wd.manage().window().maximize();
	wd.get(url);
	return wd;
	
		
				
	}


}