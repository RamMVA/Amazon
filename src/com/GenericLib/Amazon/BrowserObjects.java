package com.GenericLib.Amazon;
import java.io.File;
import java.lang.reflect.Method;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.UnexpectedAlertBehaviour;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;


@Listeners(com.GenericLib.Amazon.ScreenShotListerner.class)
public class BrowserObjects 
{
	static{
		System.out.println("Please wait Browser Objects are loding.. ..  ..  .. ");
	}
	public static WebDriver dr;
	@BeforeClass(alwaysRun = true)
	public void preCondition()
	{		
		System.out.println("Pre condition executing");
		if(Constants.driver.equals("firefox")){

			dr=new FirefoxDriver();
		}
		else if(Constants.driver.equals("chrome"))
		{

			File xmlFile = new File ("Jars/chromedriver.exe");
			String chromedriver_filepath=xmlFile.getAbsolutePath();
			System.setProperty("webdriver.chrome.driver", chromedriver_filepath);
			dr=new ChromeDriver();

		}
		else if(Constants.driver.equals("ie"))
		{

			System.setProperty("WebDriver.ie.driver", "/home/desk-user/Downloads");
			dr=new InternetExplorerDriver();
		}
		System.out.println("Browser Object classes has loaded");

		dr.get(Constants.url);
		dr.manage().window().maximize();
		dr.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	}
	public BrowserObjects() {

		System.out.println("POM");
		//PageFactory.initElements(new AjaxElementLocatorFactory(dr, 30),this);
		PageFactory.initElements(dr,this);
	}
	
	@AfterClass()
	public void tearDownMethod(ITestResult result, Method m) throws Exception
	{
		int status = result.getStatus();

		switch (status) {
		case ITestResult.SUCCESS:
			System.out.println(m+" Test case Pass");
			Reporter.log(m+" Test case Pass");
			Thread.sleep(10000);
			break;
		case ITestResult.FAILURE:
			
		
			System.out.println(m+" Test case Fail");
			Reporter.log("<b> <font color='red'>"+m+" Test case Fail</font></b>", true); 
			Thread.sleep(10000);
			break;
		case ITestResult.SKIP:
			
			System.out.println(m+" Test case has Skipped");
			Reporter.log(m+" Test case Skipped");
			Thread.sleep(10000);
			break;
		default:
			throw new RuntimeException("Invalid status");
			
		}
		
		dr.close();

	}

}


