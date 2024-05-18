package ecomm_pages;

import java.io.IOException;
import java.time.Duration;

import org.checkerframework.checker.calledmethods.qual.EnsuresCalledMethods.List;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.util.*;

import com.aventstack.extentreports.ExtentReports;

import utilities.ExplicitWait;
import utilities.ExtentReportHelper;

public class AccountLoginPage {
	
	WebDriver driver;
	
	private static final String textBoxUserNameByXpath = "//input[@name='username']";
	private static final String textBoxPasswordByXpath = "//input[@name='password']";
	private static final String buttonLoginByXpath = "//button[@type='submit']";
	private static final String titleDashboardByXpath = "//h6[text()='Dashboard']";
	private static final String dropdownUsernameByXpath = "//span[@class='oxd-userdropdown-tab']";
	private static final String optionLogoutFromProfileByXpath = "//a[text()='Logout']";
	private static final String forgotPasswordLinkByXpath = "//p[text()='Forgot your password? ']";
	private static final String buttonResetPasswordByXpath = "//button[text()=' Reset Password ']";

	@FindBy(xpath = textBoxUserNameByXpath) 
	private WebElement textBoxUserName;
	
	@FindBy(xpath = textBoxPasswordByXpath)
	private WebElement textBoxPassword;
	
	@FindBy(xpath = buttonLoginByXpath)
	private WebElement buttonLogin;
	
	@FindBy(xpath = titleDashboardByXpath)
	private WebElement titleDashboard;
	
	@FindBy(xpath = dropdownUsernameByXpath)
	private WebElement dropdownUsername;
	
	@FindBy(xpath = optionLogoutFromProfileByXpath)
	private WebElement buttonLogout;
	
	@FindBy(xpath = forgotPasswordLinkByXpath)
	private WebElement forgotPasswordLink;
	
	@FindBy(xpath = forgotPasswordLinkByXpath)
	private java.util.List<WebElement> 	buttonResetPassword;

	
	public AccountLoginPage(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this );   // refers to non-static variables of current class
	}
	
	
	public boolean performLogin(String userID, String password) throws InterruptedException, IOException
	{
		boolean testReusltFlag = false;
	
		textBoxUserName.sendKeys(userID);
		ExtentReportHelper.LogInfo("Entered User ID.");
		
		textBoxPassword.sendKeys(password);
		ExtentReportHelper.LogInfo("Entered Password.");
		
		buttonLogin.click();
		ExtentReportHelper.LogInfo("Clicked on Login button.");
		
		if(ExplicitWait.waitUntilElementElementIsVisible(titleDashboard))
		{
//			System.out.println("Login Successful");
			ExtentReportHelper.LogPass("Login Successful");
			
			testReusltFlag = true;
		}
		else
		{
//			System.out.println("Login Failed.");
			ExtentReportHelper.LogFail("Login Failed.");
		}
		return testReusltFlag;
	}
	
	
	public boolean performLogout() throws InterruptedException, IOException
	{
		boolean testReusltFlag = false;
		
		dropdownUsername.click();
		ExplicitWait.waitUntilElementElementIsVisible(buttonLogout);
		buttonLogout.click();
		
		ExtentReportHelper.LogInfo("Clicked on 'Logout' button.");
		
		ExplicitWait.waitUntilElementElementIsVisible(buttonLogin);
		
		if(buttonLogin.isDisplayed())
		{
			ExtentReportHelper.LogPass("Logout Successful");
			testReusltFlag = true;
		}
		else
		{
			ExtentReportHelper.LogFail("Logout Failed.");
		}
		return testReusltFlag;
	}
	
	public void forgotPassword() throws IOException
	{
		try
		{
			forgotPasswordLink.click();
			ExtentReportHelper.LogPass("Clicked on 'Forgot Password' Link.");
			
			if(buttonResetPassword.size() > 0)
			{
				ExtentReportHelper.LogPass("'Forgot Password' Page displayed.");
			}
			else
			{
				ExtentReportHelper.LogFail("'Forgot Password' Page not displayed.");
			}
		}
		catch (Exception ex) 
		{
			ExtentReportHelper.LogFail("Exception while click on forgot Password :" + ex.getMessage());
		}
		
	
	}
	

}
