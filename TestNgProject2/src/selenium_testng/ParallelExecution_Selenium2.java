package selenium_testng;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParallelExecution_Selenium2 
{
//	static WebDriver driver;
	
	@Test
	@Parameters("browser")
	public void TestCase1(String browserName)
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
		
		driver.get("https://tutorialsninja.com/demo/index.php?route=account/login");
		
	}
	
	@Test
	@Parameters("browser")
	public void TestCase2(String browserName)
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
		
		driver.get("https://google.com");
		
	}
	
}

