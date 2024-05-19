package ecomm_Base;

import java.io.IOException;
import java.time.Duration;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import ecomm_TestScripts.LoginTestAccountScripts;
import ecomm_pages.AccountLoginPage;
import ecomm_pages.ProfileIconPage;
import utilities.ConfigReader;
import utilities.ExtentReportHelper;

public class BaseTest {
	
	public static WebDriver driver;
	public static ExtentReportHelper extentReportHelper;
	public static LocalDateTime time =  LocalDateTime.now();
	public static DateTimeFormatter formatter = DateTimeFormatter.ofPattern("ddMMyyyy_hh_mm_ss");
	public static String dateTimeStamp;
	
	
	@BeforeSuite
	public void initBrowser() throws IOException
	{
		
		dateTimeStamp = "_"+ time.format(formatter);
		
		if(ConfigReader.readData("browser").equals("CHROME"))
		{
			driver = new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		}
		else if(ConfigReader.readData("browser").equals("EDGE"))
		{
				driver = new EdgeDriver();
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		}
		else
		{
			System.out.println("Browser value is incorrect.");
		}
		
		extentReportHelper =  new ExtentReportHelper(driver, dateTimeStamp);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get(ConfigReader.readData("testsiteurl"));
	}
	
	
//	public void initObjects()
//	{
//		
//	}
	
	@AfterSuite
	public void tearDown()
	{
		driver.quit();
	}
	
	@BeforeMethod
	public void login() throws InterruptedException, IOException
	{
//		ExtentReportHelper.startTest("Login_Test");
//		new LoginTestAccountScripts().loginTestScript();
	}
	
	@AfterMethod
	public void logout() throws InterruptedException, IOException
	{
		LoginTestAccountScripts lps = new LoginTestAccountScripts();
		lps.logoutTestScript();
		ExtentReportHelper.endTest();
	}

}
