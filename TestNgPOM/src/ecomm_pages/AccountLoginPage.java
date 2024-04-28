package ecomm_pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AccountLoginPage {
	
	WebDriver driver;
	
	private static final String textBoxUserNameByXpath = "//input[@id='input-email']";
	private static final String textBoxPasswordByXpath = "//input[@id='input-password']";
	private static final String buttonLoginByXpath = "//input[@value='Login']";
	private static final String buttonForgotPasswordByXpath = "//div[@class='list-group']//a[text()='Forgotten Password']";
	private static final String buttonMyAccountByXpath = "//a[@title='My Account']";
	private static final String buttonLogoutByXpath = "(//a[text()='Logout'])[1]";
	private static final String buttonLoginFromMenuByXpath = "//a[text()='Login']";

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

	
	public AccountLoginPage(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this );   // refers to non-static variables of current class
	}
	
	
	public void performLogin(String userID, String password) throws InterruptedException
	{
		
		buttonMyAccount.click();
		buttonLoginFromMenu.click();
		
		textBoxUserName.sendKeys(userID);
		textBoxPassword.sendKeys(password);
		buttonLogin.click();
		
		Thread.sleep(3000);
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
