package homepage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class capture_vital {
	
		
	@FindBy(xpath="//a[@type='button'][4]")
	public static WebElement CaptureTab;


	@FindBy(xpath="//input[@id='patient-search']")
	public static WebElement SearchTab;

	@FindBy(xpath="//div[@class='float-sm-right']")
	public static WebElement patienttab;
	}




