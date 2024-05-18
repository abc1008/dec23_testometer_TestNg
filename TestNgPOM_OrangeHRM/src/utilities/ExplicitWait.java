package utilities;

import java.time.Duration;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import ecomm_Base.BaseTest;

public class ExplicitWait extends BaseTest
{
	public static boolean waitUntilElementElementIsVisible(WebElement ele)
	{
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOf(ele));
		
		if(ele.isDisplayed())
			return true;
		else
			return false;
	}
	
	
	public static boolean waitUntilElementElementIsInvisible(WebElement ele)
	{
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(300));
		wait.until(ExpectedConditions.invisibilityOf(ele));
		
		if(!(ele.isDisplayed()))
			return true;
		else
			return false;
	}
	
	
	
	
	

}
