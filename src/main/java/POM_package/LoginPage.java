package POM_package;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



public class LoginPage 
{
	
	WebDriver driver;
	
	@FindBy (xpath="//input[@id='email']")
	private WebElement userName;
	
	@FindBy (xpath="//input[@id='pass']")
	private WebElement passWord;
	
	@FindBy (xpath="//button[text()='Log in']")
	private WebElement loginbutton;


	public LoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	
	public void senduserName()
	{
		
		userName.sendKeys("Akshay Badhe");
	}
	
	public void sendpassWord()
	{
		passWord.sendKeys("akshay@123");
	}
	
	public void clickloginbutton() 
	{	
		
		loginbutton.click();
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
}
