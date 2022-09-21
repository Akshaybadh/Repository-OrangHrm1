package utility;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Screenshot2Class 
{
static WebDriver driver;
	
	public static void getScreenshot() throws IOException
	{
		File sorse = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	
		String path = "C:\\Users\\dell\\Desktop\\ScrenShot111\\Folder1\\image"+System.currentTimeMillis()+".jpg";
		
		File dest = new File(path);
		
		FileUtils.copyFile(sorse, dest);
		
	}
}
