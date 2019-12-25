package TestScripts;

import org.testng.annotations.Test;
import Generic.Generic_Test;
import POM.Password_Gmail;
import POM.Sent_Gmail;
import POM.Username_gmail;

public class Gmail_sentitemsTest extends Generic_Test{ 
	@Test
	public void sentItems() throws InterruptedException
	{
	Username_gmail lg=new Username_gmail(driver);
	lg.setEmail("vijprabhakar94@gmail.com");
	lg.nextClick();

	Password_Gmail hp=new Password_Gmail(driver);
	hp.pwdText("topology");
	lg.nextClick();	
	
	Sent_Gmail s=new Sent_Gmail(driver);
	s.sentItems();
	s.openMail();
	
	
	
	}
}
