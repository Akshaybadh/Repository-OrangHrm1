package POM_package;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;



public class HomePage 
{
	static WebDriver driver;
	
	@FindBy (xpath="//input[@id='email']")
	private WebElement userName;
	
	@FindBy (xpath="//input[@id='pass']")
	private WebElement passWord;
	
	@FindBy (xpath="//button[text()='Log In']")
	private WebElement loginbutton;
	
	@FindBy (xpath="//a[@id='u_0_0_JX']")
	private WebElement createNewAccount;
	
	@FindBy (xpath="//input[@id='u_1c_b_+x']")
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
	
	
	
	
	
	public void senduserName() throws InterruptedException
	{
		Thread.sleep(2000);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		userName.sendKeys("Akshay Badhe");
	}
	
	public void sendpassWord() throws InterruptedException
	{
		Thread.sleep(2000);
		passWord.sendKeys("akshay@123");
	}
	
	public void sendloginbutton() throws InterruptedException
	{	
		Thread.sleep(2000);
//		loginbutton.click();
//		Thread.sleep(2000);
//		driver.navigate().back();
//		Thread.sleep(2000);
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
