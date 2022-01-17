package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class CallBackPage {
	
	WebDriver driver;
	
	@FindBy(xpath = "//input[@id='FirstName']")
	public  WebElement firstname;
	
	@FindBy(xpath = "//input[@id='LastName']")
	public  WebElement lastname;
	
	@FindBy(xpath = "//input[@id='EmailAddress']")
	public  WebElement emailAddress;
	
	@FindBy(xpath = "//input[@id='PhoneNumber']")
	public  WebElement phoneNumber;
	
	@FindBy(xpath = "//input[@id='BestTimeToCallYou']")
	public  WebElement timeToCall;
	
	@FindBy(xpath = "//select[@id='ReasonForEnquiry']")
	public  WebElement reason;
	
	@FindBy(xpath = "//input[@id='OptInEmail']")
	public  WebElement optional;
	
	@FindBy(xpath = "//span[contains(text(),'Contact')]")
	public  WebElement contact;
	
	
	public CallBackPage() {
		driver=Selenium.LocalDriver.driver;		
		PageFactory.initElements(driver, this);
	}
	
	
	
	public   void contactUs()  {
		Selenium.LocalDriver.driver.get(" https://www.mortgageadvicebureau.com/contact-us");
		
	}
	
	public   void enterFirstname() {
		firstname.sendKeys("Test");		
	}
	
	public  void enterLastname()   {
		lastname.sendKeys("Test");		
	}
	
	public  void enterEmailAddress() {
		emailAddress.sendKeys("Test@Test.com");		
	}
	
	public  void enterPhoneNumber() {
		phoneNumber.sendKeys("Test");		
	}
	
	public  void enterTimeToCall() {
		timeToCall.sendKeys("Test");		
	}
	
	public  void SelectReason() throws InterruptedException {
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", emailAddress);
		Thread.sleep(500); 
		reason.click();
		driver.findElement(By.xpath("//option[contains(text(),'First Time Buyer')]")).click();	
	}
	
	public  void SelectOPtional() {
		optional.click();
	}
	
	


}
