package pom;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

public class BaseTest {
	
	static WebDriver driver;
	static AccountLoginPage lp;   
	
	@BeforeSuite
	public void initBrowser()
	{
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://tutorialsninja.com/demo/index.php?route=account/login");
	}
	
	
	@BeforeClass
	public void initObjects()
	{
		 lp = new AccountLoginPage(driver);
	}
	
	@AfterSuite
	public void tearDown()
	{
		driver.quit();
	}
	
	

}
