package testcases;

import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import homepage.capture_vital;
import loginpage.loginpage1;
import openmrs.Base;
import schedule.appoinments_chedule;

public class Testcase extends Base {
	
	
	public Testcase() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}
	public loginpage1 lp;

	// TODO Auto-generated constructor stub
	
    @BeforeSuite
	public void Launching_Browser()
	{
	initialisation();
	}
	@BeforeMethod
	public void BeforeTest() throws IOException {
	lp=new loginpage1();
	PageFactory.initElements(driver,capture_vital.class);
	PageFactory.initElements(driver, appoinments_chedule.class);
	
	}
	@Test 
	
	public void Invalid_Sign_in() throws Exception {
	lp.Invalid_login("Admin1", "Admin123");
	Thread.sleep(1000);}

	@Test(dependsOnMethods = "Invalid_Sign_in")
	
	public void Sign_in() throws Exception {
		driver.navigate().refresh();
	lp.signin("Admin","Admin123");
	}
	
	@Test(dependsOnMethods = "Sign_in")
	public void AppointmentScheduling() throws InterruptedException
	{
		appoinments_chedule .Appointment.click();
		appoinments_chedule.Manageservicetype.click(); 
		appoinments_chedule.Delete.click();
	JavascriptExecutor js = (JavascriptExecutor)driver;
	js.executeScript("arguments[0].click();", appoinments_chedule.NO);
	}
	@Test(dependsOnMethods = "AppointmentScheduling")
	public void CaptureVitals()
	{
	driver.navigate().to("https://demo.openmrs.org/openmrs/login.htm");
	capture_vital.CaptureTab.click();
	capture_vital.SearchTab.sendKeys("1002KL"+Keys.ENTER);
	String Name=capture_vital.patienttab.getText();
	System.out.println(Name);
	String Expected="Patient ID 1002KL";
	Assert.assertEquals(Name, Expected);
}
	}

	


