package selenium_testng;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class Login {
	
	static WebDriver driver;

	@BeforeSuite
	public void launchBrowser()
	{
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	
	@BeforeTest
	public void hitUrl()
	{
		driver.get("https://tutorialsninja.com/demo/index.php?route=account/login");
	}
	
	
	@Test
	public void performLogin() throws InterruptedException
	{
		
		WebElement emailBox = driver.findElement(By.cssSelector("input#input-email"));
	
		emailBox.sendKeys("ag89111@gmail.com");  // enter email id on UI
		

		WebElement passwordBox = driver.findElement(By.cssSelector("input.form-control[name='password']"));
		passwordBox.sendKeys("Login@123");   // enter password id on UI
		
		
		driver.findElement(By.cssSelector("input[value='Login']")).click();   // click login method
		
		
		Thread.sleep(3000);   // stop for 3 secs after login
		
		WebElement myAcc = driver.findElement(By.xpath("//a[@title='My Account']"));  // locate Webelement
		myAcc.click();  // click operation
		

		driver.findElement(By.xpath("(//a[text()='Logout'])[1]")).click();
	}
	
	
	@Test
	public void editAcc()
	{
		driver.findElement(By.xpath("//a[text()='Edit Account']")).click();
		
		driver.findElement(By.xpath("//input[@id='input-firstname']")).sendKeys("ABC");
		
		driver.findElement(By.xpath("//input[@id='input-lastname']")).sendKeys("XYZ");
		
		
		driver.findElement(By.xpath("//input[@value = 'Continue']")).click();
	}
	
	@AfterSuite
	public void TearDown()
	{
		driver.close();  // close the browser
	}
	
	
	
	
//	public static void main(String[] args) throws InterruptedException {
//		
////		WebDriver driver = new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.get("https://tutorialsninja.com/demo/index.php?route=account/login");
//		
//		Thread.sleep(1000);
//		
//		WebElement emailBox = driver.findElement(By.cssSelector("input#input-email"));
//	
//		emailBox.sendKeys("ag89111@gmail.com");  // enter email id on UI
//		
//		Thread.sleep(2000);
//		WebElement passwordBox = driver.findElement(By.cssSelector("input.form-control[name='password']"));
//		Thread.sleep(2000); 
//		passwordBox.sendKeys("Login@123");   // enter password id on UI
//		
//		Thread.sleep(2000);
//		driver.findElement(By.cssSelector("input[value='Login']")).click();   // click login method
//		
//		
//		Thread.sleep(3000);   // stop for 3 secs after login
//		
//	
//		WebElement myAcc = driver.findElement(By.xpath("//a[@title='My Account']"));  // locate Webelement
//		myAcc.click();  // click operation
//		
//		Thread.sleep(3000); 
//		driver.findElement(By.xpath("(//a[text()='Logout'])[1]")).click();
//	}
	
	
	
	
	
	
	
	
	
	
	
	
	

}
