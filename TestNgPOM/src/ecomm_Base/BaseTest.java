package ecomm_Base;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import ecomm_TestScripts.LoginTestAccountScripts;
import ecomm_pages.AccountLoginPage;
import ecomm_pages.MyAccountPage;
import utilities.ConfigReader;

public class BaseTest {
	
	public static WebDriver driver;
	
	@BeforeSuite
	public void initBrowser() throws IOException
	{
		if(ConfigReader.readData("browser").equals("CHROME"))
		{
			driver = new ChromeDriver();
		}
		else if(ConfigReader.readData("browser").equals("EDGE"))
		{
				driver = new EdgeDriver();
		}
		else
		{
			System.out.println("Browser value is incorrect.");
		}
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get(ConfigReader.readData("testsiteurl"));
	}
	
	
	@BeforeClass
	public void initObjects()
	{
		
	}
	
	@AfterSuite
	public void tearDown()
	{
		driver.quit();
	}
	
	@BeforeMethod
	public void login() throws InterruptedException, IOException
	{
		new LoginTestAccountScripts().loginTestScript();
	}
	
	@AfterMethod
	public void logout() throws InterruptedException
	{
		LoginTestAccountScripts lps = new LoginTestAccountScripts();
		lps.logoutTestScript();
	}

}
