package TestScripts;

import org.testng.annotations.Test;
import Generic.Generic_Test;
import POM.Compose_gmail;
import POM.Password_Gmail;
import POM.Username_gmail;

public class Gmail_composetest extends Generic_Test{
	@Test
	public void compose() throws InterruptedException
	{

	Username_gmail lg=new Username_gmail(driver);
	lg.setEmail("vijprabhakar94@gmail.com");
	lg.nextClick();

	Password_Gmail hp=new Password_Gmail(driver);
	hp.pwdText("topology");
	lg.nextClick();	

Compose_gmail c=new Compose_gmail(driver);
    c.composeBtn();
    Thread.sleep(8000);   
    c.toText("vijprabhakar94@gmail.com");
    Thread.sleep(3000);   
	c.subTbox("Hi beautiful");
	 Thread.sleep(3000);  
	c.textArea("It is working...");
	 Thread.sleep(3000);  
	c.sendButton();
	 Thread.sleep(3000);
	 c.nameClick();
	 Thread.sleep(3000);
	 c.signoutClick();
	}
}
