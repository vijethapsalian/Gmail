package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Username_gmail {
@FindBy(id="identifierId")
private WebElement emailtbox;

@FindBy(xpath="(//span[.='Next'])[2]")
private WebElement nextbtn;

public Username_gmail(WebDriver driver)
{
	PageFactory.initElements(driver, this);
}

public void setEmail(String eml)
{
	emailtbox.sendKeys(eml);
}
public void nextClick()
{
	nextbtn.click();
}
	
}
