package schedule;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class appoinments_chedule {
	
	@FindBy(xpath ="//a[@type='button'][5]")
	public static WebElement Appointment;

	@FindBy(xpath="//a[@type='button'][1]")
	public static WebElement Manageservicetype;

	@FindBy(xpath="//i[@id='appointmentschedulingui-delete-Dermatology']")
	public static WebElement Delete;

	@FindBy(xpath="//*[@id=\"delete-appointment-type-dialog\"]/div[2]/button[2]")
	public static WebElement NO ;



}
