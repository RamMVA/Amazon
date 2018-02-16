package PageObjectModelRepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.GenericLib.Amazon.BrowserObjects;
import com.GenericLib.Amazon.WebDriverCommonLib;

public class Home_Page extends WebDriverCommonLib {
/*	public Home_Page() {

		PageFactory.initElements(dr,this);
	}*/

	@FindBy(id="twotabsearchtextbox")
	private static WebElement SearchBox;

	public static void SearchBox() throws InterruptedException
	{

		Thread.sleep(4000);
		SearchBox.sendKeys("Iphone");
		print("User entered Iphone product ");
	}

	@FindBy(xpath="//input[@value='Go']")
	private static WebElement Search_btn;

	public static void Search_btn() throws InterruptedException
	{

		Thread.sleep(4000);
		Search_btn.click();
		print("User clicked on Search button ");
	}
	
	
	@FindBy(xpath="//*[@id='sort']")
	private static WebElement ItemsSorting;

	public static void ItemsSorting() throws InterruptedException
	{

		Thread.sleep(4000);
		Select se=new Select(ItemsSorting);
		se.selectByVisibleText("Price: Low to High");
		
		print("Sorted the results by Price-ascending order");
	}
	
	@FindBy(xpath="//*[@id='result_0']/div/div[3]/div[1]/a/h2")
	private static WebElement Itemstitle;

	public static void Itemstitle() throws InterruptedException
	{
		Thread.sleep(4000);
		Itemstitle.click();
		print("User clicked on Iphone title ");
	}
	
	

}
