package ecomm_Base;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import ecomm_TestScripts.LoginTestAccountScripts;
import ecomm_pages.AccountLoginPage;
import ecomm_pages.MyAccountPage;

public class BaseTest {
	
	public static WebDriver driver;
	public static AccountLoginPage accountLoginPage;   
	public static MyAccountPage myAccountPage;
	
	@BeforeSuite
	public void initBrowser()
	{
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://tutorialsninja.com/demo/");
	}
	
	
	@BeforeClass
	public void initObjects()
	{
			accountLoginPage = new AccountLoginPage(driver);
		 myAccountPage = new MyAccountPage(driver);
	}
	
	@AfterSuite
	public void tearDown()
	{
		driver.quit();
	}
	
	@BeforeMethod
	public void login() throws InterruptedException
	{
		LoginTestAccountScripts lps = new LoginTestAccountScripts();
		lps.loginTestScript();
	}
	
	@AfterMethod
	public void logout() throws InterruptedException
	{
		LoginTestAccountScripts lps = new LoginTestAccountScripts();
		lps.logoutTestScript();
	}

}
