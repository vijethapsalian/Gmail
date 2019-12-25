package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Sent_Gmail {
	@FindBy(xpath="//a[.='Sent']")
	private WebElement sentbtn;
	
	@FindBy(xpath="//span[@class='yP']")
	private WebElement sentmail;
	
	public Sent_Gmail(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void sentItems() throws InterruptedException 
	{
		Thread.sleep(3000);
		sentbtn.click();
	}
	public void openMail() throws InterruptedException 
	{
		Thread.sleep(3000);
		sentmail.click();
	}
	
	
}
