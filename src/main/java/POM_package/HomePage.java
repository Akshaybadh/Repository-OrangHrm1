package POM_package;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;




public class HomePage 
{
	
	
	static WebDriver driver;
	
		
	@FindBy (xpath="//a[text()='Create New Account']")
	private WebElement createNewAccount;
	
	@FindBy (xpath="//input[@name='firstname']")
	private WebElement firstname;
	
	@FindBy (xpath="//input[@id='u_1c_d_c/']")
	private WebElement SurName;
	
	@FindBy (xpath="//div[contains(text(),\"Mobile number\")]")
	private WebElement emailAddress;
	
	@FindBy (xpath="//input[@id='password_step_input']")
	private WebElement NewPassword;
	
	@FindBy (xpath="//Select[@id='day']")
	private WebElement dayDOB;
	
	@FindBy (xpath="//Select[@id='month']")
	private WebElement monthDOB;
	
	@FindBy (xpath="//Select[@id='year']")
	private WebElement yearDOB;
	
	
	
	
	
	public HomePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	public void clickcreateNewAccount()
	{
		createNewAccount.click();
	}
	
	public void sendKeysfirstname() 
	{
		firstname.sendKeys("Akshay");
	}
	
	public void sendKeysSurName()
	{
		SurName.sendKeys("Badhe");
	}
	
	public void sendemailAddress()
	{
		emailAddress.sendKeys("badhe.akshay1234@gmail.com");
	}
	
	public void sendNewPassword()
	{
		NewPassword.sendKeys("akshay");
	}
	
	public void selectdayDOB()
	{
		Select s1 = new Select(dayDOB);
		s1.selectByIndex(14);
	}
	
	
	public void selectmonthDOB()
	{
		Select s2 = new Select(monthDOB);
		s2.deselectByValue("9");
	}
	
	public void selectyearDOB()
	{
		Select s3 = new Select(yearDOB);
		s3.deselectByValue("1993");
	}
	
}
