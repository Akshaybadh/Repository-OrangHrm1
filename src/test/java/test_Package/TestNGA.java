package test_Package;

import org.testng.annotations.Test;

import POM_package.HomePage;
import POM_package.LoginPage;
import utility.Pojo;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;

public class TestNGA extends Pojo
{
	WebDriver driver;
	
	 @BeforeClass
	  public void beforeClass()
	 {
		 WebDriver driver = openChromeBrowser();
		 this.driver = driver; 
	 }
	
	 @BeforeMethod
	  public void beforeMethod() 
	 {
		 System.out.println("beforeMethod");
	 }
	
  @Test(priority=0)
  public void openLoginPage() 
  {
	  LoginPage login = new LoginPage (driver);
		
		login.senduserName();
		login.sendpassWord();
  }
 
  @Test(priority=1)
  
  public void openHomePage()
  {
	  HomePage home = new HomePage(driver);
		
		home.clickcreateNewAccount();
		home.sendKeysfirstname();
  }

  @AfterMethod
  public void afterMethod() 
  {
	  System.out.println("afterMethod");
  }

 

  @AfterClass
  public void afterClass() 
  {
	  System.out.println("afterClass");
  }

}
