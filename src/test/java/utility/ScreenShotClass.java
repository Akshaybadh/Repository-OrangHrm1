package utility;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenShotClass 
{
	static WebDriver driver;
	
	public static void captureScreenshot() throws IOException
	{
	DateTimeFormatter Time = DateTimeFormatter.ofPattern("DD,MM,YY,HH,MM,SS");
		
	LocalDateTime now = LocalDateTime.now();
	
	String dt = Time.format(now);
	
	File sorse = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	
	File dest = new File("C:\\Users\\dell\\Desktop\\ScrenShot111\\Image"+dt+".jpeg");
	
	FileHandler.copy(sorse, dest);
	
	}
}
