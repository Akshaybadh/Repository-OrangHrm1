package test_Package;

import java.time.Duration;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

import POM_package.HomePage;
import POM_package.LoginPage;


public class TestClass 
{
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Software testing Application\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		LoginPage login = new LoginPage (driver);
		
		login.senduserName();
		login.sendpassWord();
//		login.clickloginbutton();

		
		HomePage home = new HomePage(driver);
		
		home.clickcreateNewAccount();
		home.sendKeysfirstname();
		
//		home.sendKeysSurName();
//		home.sendemailAddress();
//		home.sendNewPassword();
//		home.selectdayDOB();
//		home.selectmonthDOB();
//		home.selectyearDOB();
		
		
		
		
		
		
	}
}
