package PageObjectModelRepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.GenericLib.Amazon.TestData;
import com.GenericLib.Amazon.WebDriverCommonLib;

public class CreateAccount_Page extends WebDriverCommonLib {
	
	
	@FindBy(xpath="//*[@id='ap_customer_name']")
	private static WebElement Yourname;

	public static void  Yourname () throws InterruptedException
	{
		Thread.sleep(4000);
		Yourname.sendKeys(TestData.Creator_username_ram);
		print("User given name");
	}
	
	@FindBy(xpath="//*[@id='ap_phone_number']")
	private static WebElement  Mobilenumber ;

	public static void  Mobilenumber () throws InterruptedException
	{
		Thread.sleep(4000);
		Mobilenumber.sendKeys(TestData.mobileNo);
		print("User given mobile No");
	}
	
	@FindBy(xpath="//*[@id='ap_password']")
	private static WebElement  NewPassword ;

	public static void  NewPassword () throws InterruptedException
	{
		Thread.sleep(4000);
		NewPassword.sendKeys(TestData.NewPassword);
		print("User given New Password");
	}
	
	@FindBy(xpath="//*[@id='continue']")
	private static WebElement  Continue_btn ;

	public static void  Continue_btn () throws InterruptedException
	{
		Thread.sleep(4000);
		Continue_btn.click();
		print("User clicked on Continue button");
	}

}
