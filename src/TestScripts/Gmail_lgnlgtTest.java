package TestScripts;

import java.util.concurrent.TimeUnit;

import org.testng.annotations.Test;

import Generic.Generic_Test;
import POM.Compose_gmail;
import POM.Password_Gmail;
import POM.Username_gmail;

public class Gmail_lgnlgtTest extends Generic_Test {
@Test
public void testLogin(Long value) throws InterruptedException
{
	
	driver.manage().timeouts().implicitlyWait(value, TimeUnit.SECONDS);
	Username_gmail lg=new Username_gmail(driver);
	lg.setEmail("vijprabhakar94@gmail.com");
	lg.nextClick();

	Password_Gmail hp=new Password_Gmail(driver);
	hp.pwdText("topology");
	lg.nextClick();	
	
	Compose_gmail c=new Compose_gmail(driver);
	c.nameClick();
	 Thread.sleep(3000);
	 c.signoutClick();
}
	
}
