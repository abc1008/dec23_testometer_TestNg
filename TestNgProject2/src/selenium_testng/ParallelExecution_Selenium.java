package selenium_testng;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParallelExecution_Selenium 
{
	static WebDriver driver;
	
	@Test
	public void editAcc()
	{
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://tutorialsninja.com/demo/index.php?route=account/login");
		
		WebElement emailBox = driver.findElement(By.cssSelector("input#input-email"));
		
		emailBox.sendKeys("ag89111@gmail.com");  // enter email id on UI
		

		WebElement passwordBox = driver.findElement(By.cssSelector("input.form-control[name='password']"));
		passwordBox.sendKeys("Login@123");   // enter password id on UI
		
		
		driver.findElement(By.cssSelector("input[value='Login']")).click();   // click login method
		
		
		// *****
	
		
		driver.findElement(By.xpath("//a[text()='Edit Account']")).click();
		
		driver.findElement(By.xpath("//input[@id='input-firstname']")).sendKeys("ABC");
		
		driver.findElement(By.xpath("//input[@id='input-lastname']")).sendKeys("XYZ");
		
		
		driver.findElement(By.xpath("//input[@value = 'Continue']")).click();
		
	}
	
	
	
	@Test
	public void editAcc2()
	{
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://tutorialsninja.com/demo/index.php?route=account/login");
		
		WebElement emailBox = driver.findElement(By.cssSelector("input#input-email"));
		
		emailBox.sendKeys("ag89111@gmail.com");  // enter email id on UI
		

		WebElement passwordBox = driver.findElement(By.cssSelector("input.form-control[name='password']"));
		passwordBox.sendKeys("Login@123");   // enter password id on UI
		
		
		driver.findElement(By.cssSelector("input[value='Login']")).click();   // click login method
		
		
		// *****
		
		driver.findElement(By.xpath("//a[text()='Edit Account']")).click();
		
		driver.findElement(By.xpath("//input[@id='input-firstname']")).sendKeys("ABC");
		
		driver.findElement(By.xpath("//input[@id='input-lastname']")).sendKeys("XYZ");
		
		
		driver.findElement(By.xpath("//input[@value = 'Continue']")).click();
		
	}
}

