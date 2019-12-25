package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Password_Gmail {
	@FindBy(xpath="//input[@name='password']")
	private WebElement pwdtbox;
	
	
	public Password_Gmail(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void pwdText(String pwd) throws InterruptedException
	{
		Thread.sleep(3000);
		pwdtbox.sendKeys(pwd);
	}

	
	
}
