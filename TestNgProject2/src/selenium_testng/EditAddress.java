package selenium_testng;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.idealized.Javascript;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class EditAddress {
	
	
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://tutorialsninja.com/demo/index.php?route=account/login");
	
		
		WebElement emailBox = driver.findElement(By.cssSelector("input#input-email"));
		
		emailBox.sendKeys("ag89111@gmail.com");  // enter email id on UI
		

		WebElement passwordBox = driver.findElement(By.cssSelector("input.form-control[name='password']"));
		passwordBox.sendKeys("Login@123");   // enter password id on UI
		
		driver.findElement(By.cssSelector("input[value='Login']")).click();   // click login method
		
		
		
		driver.findElement(By.xpath("//aside[@id='column-right']//a[text()='Address Book']")).click();
		
		driver.findElement(By.xpath("//td[@class='text-right']//a[text()='Edit']")).click();
		
		
		driver.findElement(By.xpath("//input[@id='input-address-1']")).sendKeys("Addr1");
		
		driver.findElement(By.xpath("//input[@id='input-address-2']")).sendKeys("Addr2");
		
		WebElement countryDropdown = driver.findElement(By.xpath("//select[@id='input-country']"));
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView();", countryDropdown);
		
		Thread.sleep(2000);
		
		countryDropdown = driver.findElement(By.xpath("//select[@id='input-country']"));
		Select s =  new Select(countryDropdown);
		s.selectByValue("2");
		
		Thread.sleep(2000);
		
		WebElement stateDropdown = driver.findElement(By.xpath("//select[@id='input-zone']"));
		js.executeScript("arguments[0].scrollIntoView();", stateDropdown);
		
		stateDropdown = driver.findElement(By.xpath("//select[@id='input-zone']"));
		Select s2 =  new Select(stateDropdown);
		s2.selectByValue("36");
		
		driver.findElement(By.xpath("//input[@value = 'Continue']")).click();
		
		
		
		WebElement alertMsg =  driver.findElement(By.xpath("//div[contains(@class,'alert-success')]"));
		boolean isSuccessMsgDisplayed = alertMsg.isDisplayed();
		
		Assert.assertTrue(isSuccessMsgDisplayed);
		
		
		
		
		
		Thread.sleep(3000);   // stop for 3 secs after login
		
		WebElement myAcc = driver.findElement(By.xpath("//a[@title='My Account']"));  // locate Webelement
		myAcc.click();  // click operation
		

		driver.findElement(By.xpath("(//a[text()='Logout'])[1]")).click();
		

	}
	
	
	
	
	
	

}
