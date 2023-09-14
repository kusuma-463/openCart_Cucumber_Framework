package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MyAccountPage extends BasePage{

	public MyAccountPage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(xpath="/html[1]/body[1]/div[2]/div[1]/div[1]/h2[1]") WebElement msgHeading;
	@FindBy(xpath="//ul[@class='dropdown-menu dropdown-menu-right']//a[normalize-space()='Logout']") WebElement lnkLogOut;
	
	public boolean isMyAccountPageExists() {
		try 
		{
			return msgHeading.isDisplayed();
		}catch(Exception e) {
			return false;
		}
	}
	
	public void clickLogout() {
		lnkLogOut.click();
	}

}
