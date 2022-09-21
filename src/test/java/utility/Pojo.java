package utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Pojo 
{
	public static WebDriver openChromeBrowser()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Software testing Application\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.facebook.com/");
		
		return driver;
		
	}
	
	public static WebDriver openFireFoxBrowser()
	{
		System.setProperty("webdriver.gicko.driver", "C:\\Software testing Application\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.navigate().to("https://www.facebook.com/");
		
		return driver;
		
	}
	
	
	
	
	
	
	
	
	
	
	
}



