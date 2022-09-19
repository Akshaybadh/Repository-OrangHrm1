package test_Package;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

import POM_package.HomePage;


public class TestClass 
{
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Software testing Application\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.facebook.com/");
		
		HomePage home = new HomePage (driver);
		
		home.senduserName();
		home.sendpassWord();
		home.sendloginbutton();

		
		home.clickcreateNewAccount();
		home.sendKeysfirstname();
		home.sendKeysSurName();
		home.sendemailAddress();
		home.sendNewPassword();
		home.selectdayDOB();
		home.selectmonthDOB();
		home.selectyearDOB();
		
		
		
		
		
		
	}
}
