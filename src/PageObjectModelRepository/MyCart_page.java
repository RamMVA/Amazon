package PageObjectModelRepository;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import com.GenericLib.Amazon.WebDriverCommonLib;

public class MyCart_page extends WebDriverCommonLib {

	@FindBy(xpath="//*[@id='nav-cart']")
	private static WebElement Carticon;

	public static void Carticon() throws InterruptedException
	{
		Thread.sleep(4000);
		Carticon.click();
		print("User clicked on Cart icon ");
	}
	
	
	@FindBy(xpath="//span[@class='a-size-medium sc-product-title a-text-bold']")
	private static List <WebElement> Verify_ProductTitle;
	
	
	@FindBy(xpath="//span[@style='text-decoration: inherit; white-space: nowrap;']")
	private static List <WebElement> Verify_ProductPrice;

	public static void Verify() throws InterruptedException
	{
		Thread.sleep(4000);
		
		for(WebElement ss:Verify_ProductTitle)
		{
		//	print(ss.getText().trim());
			if(ss.getText().trim().contains(TitleofProduct)) {
				
				print("Sucessfully verified your product title  ");
			}
		}
		for(WebElement ss:Verify_ProductPrice)
		{
			//print("Price list is "+ss.getText().trim());
			if(ss.getText().trim().contains(ProductPrice)) {
				
				print("Sucessfully verified your product price ");
			}
		}
	
	}
	
    
    @FindBy(xpath="//*[@id='nav-link-yourAccount']/span[2]")
	private static WebElement Logout;
    
  
    
    @FindBy(xpath="//*[@id='nav-item-signout-sa']/span")
  	private static WebElement Signout_link;

	public static void Logout() throws InterruptedException
	{
		Thread.sleep(4000);
		Actions action = new Actions(dr);
	    action.moveToElement(Logout).build().perform();
	    Thread.sleep(2000);
	    Signout_link.click();
		print("User clicked on Signout link ");
		Thread.sleep(4000);
	}
	
}
