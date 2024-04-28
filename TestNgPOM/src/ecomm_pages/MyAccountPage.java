package ecomm_pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import utilities.CommonOps;

public class MyAccountPage {
	
	WebDriver driver;
	
	private static final String buttonEditAccByXpath = "//a[text()='Edit Account']";
	private static final String textBoxFNameByXpath = "//inpu[@id='input-firstname']";
	private static final String textBoxLNameByXpath = "//input[@id='input-lastname']";
	private static final String buttonContinueByXpath = "//input[@value = 'Continue']";
	private static final String msgAlertByXpath = "//div[contains(text(),'Success: Your account has been successfully updated.')]";
	private static final String buttonAddrBookByXpath = "//aside[@id='column-right']//a[text()='Address Book']";
	private static final String buttonEditByXpath = "//td[@class='text-right']//a[text()='Edit']";
	private static final String textBoxAddr1ByXpath = "//input[@id='input-address-1']";
	private static final String textBoxAddr2ByXpath = "//input[@id='input-address-2']";
	private static final String msgAlertSuccessAddrByXpath = "//div[contains(@class,'alert-success')]";
	private static final String dropdownCoutryByXpath = "//select[@id='input-country']";
	private static final String dropdownStateByXpath = "//select[@id='input-zone']";
	
	
	
	@FindBy(xpath = buttonEditAccByXpath) 
	private WebElement buttonEditAccount;
	
	@FindBy(xpath = textBoxFNameByXpath) 
	private WebElement textBoxFName;
	
	@FindBy(xpath = textBoxLNameByXpath) 
	private WebElement textBoxLName;
	
	@FindBy(xpath = buttonContinueByXpath) 
	private WebElement buttonContinue;
	
	@FindBy(xpath = msgAlertByXpath) 
	private WebElement msgAlert;
	
	@FindBy(xpath = buttonAddrBookByXpath) 
	private WebElement buttonAddrBook;
	
	@FindBy(xpath = buttonEditByXpath) 
	private WebElement buttonEdit;
	
	@FindBy(xpath = textBoxAddr1ByXpath) 
	private WebElement textBoxAddr1;
	
	@FindBy(xpath = textBoxAddr2ByXpath) 
	private WebElement textBoxAddr2;
	
	@FindBy(xpath = msgAlertSuccessAddrByXpath) 
	private WebElement msgAlertSuccessAddr;
	
	@FindBy(xpath = dropdownCoutryByXpath) 
	private WebElement dropdownCoutry;
	
	@FindBy(xpath = dropdownStateByXpath) 
	private WebElement dropdownState;
	

	public MyAccountPage(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this );   // refers to non-static variables of current class
	}
	
	public boolean performEditAccount()
	{
		boolean testResult = false;
		
		try
		{
			buttonEditAccount.click();
			textBoxFName.sendKeys("ABC");
			textBoxLName.sendKeys("XYZ");		
			
			buttonContinue.click();
			
			if(msgAlert.isDisplayed())
			{
				System.out.println("Account successfully updated.");
				testResult = true;
			}
			else
			{
				System.out.println("Account not successfully updated.");
			}
		}
		catch(Exception ex)
		{
			System.out.println("Exception while edit account : " + ex.getMessage() );
		}
		return testResult;
	}
	
	public boolean performEditAddress()
	{
		boolean testResult = false;
		
		try
		{
			buttonAddrBook.click();
			buttonEdit.click();
			
			textBoxAddr1.sendKeys("Addr1");
			textBoxAddr2.sendKeys("Addr2");
			
			CommonOps.ScrollTo(driver, dropdownCoutry);
			
			Select s =  new Select(dropdownCoutry);
			s.selectByValue("2");
			
			Select s2 =  new Select(dropdownState);
			s2.selectByValue("36");
			
			buttonContinue.click();
			
			if(msgAlertSuccessAddr.isDisplayed())
			{
				System.out.println("Address successfully updated.");
				testResult = true;
			}
			else 
			{
				System.out.println("Address not successfully updated.");
				testResult = false;
			}
		}
		catch(Exception ex)
		{
			System.out.println("Exception while edit address : " + ex.getMessage() );
		}
		return testResult;
	}
}
