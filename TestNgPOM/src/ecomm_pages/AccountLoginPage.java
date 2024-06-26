package ecomm_pages;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import utilities.ExplicitWait;

public class AccountLoginPage {
	
	WebDriver driver;
	
	private static final String textBoxUserNameByXpath = "//input[@id='input-email']";
	private static final String textBoxPasswordByXpath = "//input[@id='input-password']";
	private static final String buttonLoginByXpath = "//input[@value='Login']";
	private static final String buttonForgotPasswordByXpath = "//div[@class='list-group']//a[text()='Forgotten Password']";
	private static final String buttonMyAccountByXpath = "//a[@title='My Account']";
	private static final String buttonLogoutByXpath = "(//a[text()='Logout'])[1]";
	private static final String buttonLoginFromMenuByXpath = "//a[text()='Login']";
	private static final String buttonEditAccByXpath = "//a[text()='Edit Account']";

	@FindBy(xpath = textBoxUserNameByXpath) 
	private WebElement textBoxUserName;
	
	@FindBy(xpath = textBoxPasswordByXpath)
	private WebElement textBoxPassword;
	
	@FindBy(xpath = buttonLoginByXpath)
	private WebElement buttonLogin;
	
	@FindBy(xpath = buttonForgotPasswordByXpath)
	private WebElement buttonForgotPassword;
	
	@FindBy(xpath = buttonMyAccountByXpath)
	private WebElement buttonMyAccount;
	
	@FindBy(xpath = buttonLogoutByXpath)
	private WebElement buttonLogout;
	
	@FindBy(xpath = buttonLoginFromMenuByXpath)
	private WebElement buttonLoginFromMenu;
	
	@FindBy(xpath = buttonEditAccByXpath) 
	private WebElement buttonEditAccount;

	
	public AccountLoginPage(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this );   // refers to non-static variables of current class
	}
	
	
	public boolean performLogin(String userID, String password) throws InterruptedException
	{
		boolean testReusltFlag = false;
		
		buttonMyAccount.click();
		buttonLoginFromMenu.click();
		
		textBoxUserName.sendKeys(userID);
		textBoxPassword.sendKeys(password);
		buttonLogin.click();
		
		if(ExplicitWait.waitUntilElementElementIsVisible(buttonEditAccount))
		{
			System.out.println("Login Successful");
			testReusltFlag = true;
		}
		else
		{
			System.out.println("Login Failed.");
		}
		
		return testReusltFlag;
	}
	
	
	public void performLogout() throws InterruptedException
	{
		buttonMyAccount.click();
		buttonLogout.click();
		Thread.sleep(2000);
	}
	
	
	public void forgotPassword()
	{
		buttonForgotPassword.click();
	}
	

}
