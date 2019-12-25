package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Compose_gmail {
	

	@FindBy(xpath="(//div[.='Compose'])[3]")
	private WebElement compose;
	
	@FindBy(xpath="//textarea[@name='to']")
	private WebElement toText;
	
	@FindBy(xpath="//input[@name='subjectbox']")
	private WebElement subject;

	@FindBy(xpath="//div[@class='Am Al editable LW-avf tS-tW']")
	private WebElement textarea;
	

	@FindBy(xpath="(//div[.='Send'])[3]")
	private WebElement sendbtn;
	
	@FindBy(xpath="//span[@class='gb_Ia gbii']")
	private WebElement name;
	
	@FindBy(xpath="//a[.='Sign out']")
	private WebElement signoutbtn;
	
	
	
	 public Compose_gmail(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	 
		
	public void composeBtn() 
	{
		//Thread.sleep(3000);
		compose.click();
	}
	public void toText(String mailid) throws InterruptedException 
	{
		Thread.sleep(3000);
		toText.sendKeys(mailid);
	}
	

	public void subTbox(String sub) 
	{
		subject.sendKeys(sub);
	}
	
	public void textArea(String text) 
	{
		textarea.sendKeys(text);
	}
	
	public void sendButton() 
	{
		sendbtn.click();
	}
	
	public void nameClick() 
	{
		name.click();
	}
	public void signoutClick() throws InterruptedException 
	{
		Thread.sleep(3000);
		signoutbtn.click();
	}
	
	
	
	
	
	
}
