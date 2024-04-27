package pom;

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
	
	
	@FindBy(xpath = textBoxUserNameByXpath) 
	private WebElement textBoxUserName;
	
	@FindBy(xpath = textBoxPasswordByXpath)
	private WebElement textBoxPassword;
	
	@FindBy(xpath = buttonLoginByXpath)
	private WebElement buttonLogin;
	
	@FindBy(xpath = buttonLoginByXpath)
	private WebElement buttonForgotPassword;
	
	
	
	AccountLoginPage(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this );   // refers to non-static variables of current class
	}
	
	
	public void performLogin(String userID, String password)
	{
		textBoxUserName.sendKeys(userID);
		textBoxPassword.sendKeys(password);
		buttonLogin.click();
	}
	
	
	public void forgotPassword()
	{
		buttonForgotPassword.click();
	}
	

}
