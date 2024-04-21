package utilities;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.google.common.io.Files;

public class CommonOps {
	

	public static void CaptureSreen(WebDriver driver, String fileName) throws IOException
	{
		TakesScreenshot screen = (TakesScreenshot)driver; 
		File source = screen.getScreenshotAs(OutputType.FILE);
		File destination = new File("D:\\Trainings\\TESTOMETER\\Selenium_JAVA_16Dec23_WEEKEND\\Screenshots\\"+fileName+".jpeg");
		Files.copy(source, destination);
	}
	
	public static void ScrollTo(WebDriver driver, WebElement element )
	{
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView();", element);
	
	}
	
	
	
	
	
	
	
	

}
