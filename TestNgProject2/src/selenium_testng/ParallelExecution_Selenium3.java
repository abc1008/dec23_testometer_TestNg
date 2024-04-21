package selenium_testng;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParallelExecution_Selenium3 
{
//	static WebDriver driver;
	
	@Test
	@Parameters("browser")
	public void TestCase3(String browserName)
	{
		
		WebDriver driver = null;       // local variable
		
		if(browserName.equals("chrome"))
		{
			driver = new ChromeDriver();
		}
		else
		{
			driver = new EdgeDriver ();
		}
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://facebook.com");
		
	}
	
	@Test
	@Parameters("browser")
	public void TestCase4(String browserName)
	{
		
		WebDriver driver = null;       // local variable
		
		if(browserName.equals("chrome"))
		{
			driver = new ChromeDriver();
		}
		else
		{
			driver = new EdgeDriver ();
		}
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://youtube.com");
		
	}
}

