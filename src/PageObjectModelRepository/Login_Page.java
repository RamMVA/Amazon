package PageObjectModelRepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.GenericLib.Amazon.BrowserObjects;
import com.GenericLib.Amazon.WebDriverCommonLib;

public  class Login_Page extends WebDriverCommonLib {
/*	
	public Login_Page() {
		System.out.println("POM");
		PageFactory.initElements(dr,this);
	}*/
	
	@FindBy(id="createAccountSubmit")
	private static WebElement CreateAccountLink;
	
	public static void CreateAccountLink() throws InterruptedException
	{
		
		Thread.sleep(4000);
		CreateAccountLink.click();
		System.out.println("User clicked on Create Account Link ");
	}
	
	
	@FindBy(id="ap_email")
	private static WebElement Username_Textbox;
	
	public static void Username_Textbox() throws InterruptedException
	{
		
		Thread.sleep(4000);
		Username_Textbox.sendKeys("8884156759");
		System.out.println("User entered username ");
	}
	
	@FindBy(css="input[id=continue]")
	private static WebElement Continue_btn;
	
	public static void Continue_btn() throws InterruptedException
	{
		
		Thread.sleep(4000);
		Continue_btn.click();
		System.out.println("User clicked on Continue button ");
	}
	@FindBy(xpath="//*[@id='ap_password']")
	private static WebElement Password;
	
	public static void Password() throws InterruptedException
	{
		
		Thread.sleep(4000);
		Password.sendKeys("Janakiram@11");
		System.out.println("User entered password");
	}
	@FindBy(xpath="//*[@id='signInSubmit']")
	private static WebElement Login_btn;
	
	public static void Login_btn() throws InterruptedException
	{
		
		Thread.sleep(4000);
		Login_btn.click();
		System.out.println("User clicked on Login button ");
	}
}
