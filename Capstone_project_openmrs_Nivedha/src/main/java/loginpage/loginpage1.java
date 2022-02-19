package loginpage;


	import java.io.IOException;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.PageFactory;

import openmrs.Base;

	public class loginpage1 extends Base{
                               
	@FindBy(xpath="//input[@id='password']")
     WebElement password;
	
	@FindBy(xpath="//input[@id='loginButton']")
	WebElement submitbtn;
	
	@FindBy(xpath="//li[@id='Inpatient Ward']")
	WebElement Session_Location;
	
	@FindBy(xpath="//*[@id=\"error-message\"]")
	WebElement Text_Displayed;


	public loginpage1() throws IOException {
	super();
	PageFactory.initElements(driver,this);
	}
	
	public void signin(String st, String str) throws Exception {
	driver.switchTo().activeElement().sendKeys(st);
	password.sendKeys(str);
	Session_Location.click(); 
	submitbtn.click();


	}
	
	public void Invalid_login(String st1, String str1)
	{
	driver.switchTo().activeElement().sendKeys(st1);
	password.sendKeys(str1);
	Session_Location.click();
	submitbtn.click();
	String actual_text=Text_Displayed.getText();
	String Expected_text="Invalid username/password. Please try again.";
	System.out.println(actual_text);
	Assert.assertEquals(Expected_text, actual_text);
	}


	}
