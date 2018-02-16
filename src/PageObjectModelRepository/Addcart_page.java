package PageObjectModelRepository;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.GenericLib.Amazon.WebDriverCommonLib;

public class Addcart_page  extends WebDriverCommonLib {
	
	
	
	
	
	@FindBy(xpath="//*[@id='productTitle']")
	private static WebElement ProductTitle;
	
	@FindBy(xpath="//*[@id='priceblock_ourprice']")
	private static WebElement Itemoprice;
	
	@FindBy(xpath="//*[@id='add-to-cart-button']")
	private static WebElement AddCart_btn;

	public static void AddCart_btn() throws InterruptedException
	{
		WebDriverCommonLib.Windowhandle(1);
		Thread.sleep(4000);
		TitleofProduct=ProductTitle.getText().trim();
		print("Product title is :"+TitleofProduct);
		
		ProductPrice=Itemoprice.getText().trim();
		print("Product price is :"+ProductPrice);
		
		
		AddCart_btn.click();
		
		
		print("User clicked on AddCart button ");
	}
	
	
}
