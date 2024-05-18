package ecomm_pages;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import utilities.CommonOps;
import utilities.ExplicitWait;
import utilities.ExtentReportHelper;

public class ProfileIconPage {
	
	WebDriver driver;
	
	private static final String dropdownUsernameByXpath = "//span[@class='oxd-userdropdown-tab']";
	private static final String optionLogoutFromProfileByXpath = "//a[text()='Logout']";
	private static final String optionChangePassFromProfileByXpath = "//a[text()='Change Password']";
	private static final String textBoxOldPassByXpath = "(//input[@type='password'])[1]";
	private static final String textBoxNewPassByXpath = "(//input[@type='password'])[2]";
	private static final String textBoxConfirmPassByXpath = "(//input[@type='password'])[3]";
	private static final String buttonSaveByXpath = "//button[@type='submit']";
	private static final String successAlertMsgByXpath = "//div[@id='oxd-toaster_1']";
	private static final String supportOptionByXpath = "//a[text()='Support']";
	private static final String custSupportByXpath = "//p[text()='Customer Support']";
	
	@FindBy(xpath = dropdownUsernameByXpath)
	private WebElement dropdownUsername;
	
	@FindBy(xpath = optionLogoutFromProfileByXpath)
	private WebElement buttonLogout;
	
	@FindBy(xpath = optionChangePassFromProfileByXpath)
	private WebElement optionChangePassword;
	
	@FindBy(xpath = buttonSaveByXpath)
	private WebElement buttonSave;
	
	@FindBy(xpath = textBoxOldPassByXpath)
	private WebElement textBoxOldPassword;
	
	@FindBy(xpath = textBoxNewPassByXpath)
	private WebElement textBoxNewPassword;
	
	@FindBy(xpath = textBoxConfirmPassByXpath)
	private WebElement textBoxConfirmPassword;
	
	@FindBy(xpath = successAlertMsgByXpath)
	private WebElement successAlertMsg;
	
	@FindBy(xpath = supportOptionByXpath)
	private WebElement supportOption;
	
	@FindBy(xpath = custSupportByXpath)
	private WebElement custSupportText;


	public ProfileIconPage(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this );   // refers to non-static variables of current class
	}
	
	public boolean performChangePassword() throws IOException
	{
		boolean testResult = false;
		
		try
		{
			dropdownUsername.click();
			optionChangePassword.click();
			ExtentReportHelper.LogInfo("Selected 'Change Password' option from profile icon.");
			
			textBoxOldPassword.sendKeys("admin123");
			ExtentReportHelper.LogInfo("Entered Password in 'Old Password' field.");
			
			textBoxNewPassword.sendKeys("admin123");		
			ExtentReportHelper.LogInfo("Entered Password in 'New Password' field.");
			
			textBoxConfirmPassword.sendKeys("admin123");	
			ExtentReportHelper.LogInfo("Entered Password in 'Confirm Password' field.");
			
			buttonSave.click();
			
			if(ExplicitWait.waitUntilElementElementIsVisible(successAlertMsg))
			{
				ExtentReportHelper.LogPass("Password successfully updated.");
				testResult = true;
			}
			else
			{
				ExtentReportHelper.LogFail("Failed to update password.");
			}
		}
		catch(Exception ex)
		{
			ExtentReportHelper.LogFail("Exception while edit password :" + ex.getMessage());
		}
		return testResult;
	}
	
	
	public boolean performClickOnSupport() throws IOException
	{
		boolean testResult = false;
		
		try
		{
			dropdownUsername.click();
			supportOption.click();
			ExtentReportHelper.LogInfo("Selected 'Support' option from profile icon.");
			
			
			if(ExplicitWait.waitUntilElementElementIsVisible(custSupportText))
			{
				ExtentReportHelper.LogPass("Clicked On Support.");
				testResult = true;
			}
			else
			{
				ExtentReportHelper.LogFail("Failed to clicked On Support.");
			}
		}
		catch(Exception ex)
		{
			ExtentReportHelper.LogFail("Exception while  click On Support:" + ex.getMessage());
		}
		return testResult;
	}
	
	
	
	
	
	
	
	
	
	
	
}
