package com.GenericLib.Amazon;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;


public class  WebDriverCommonLib extends Webconstants {
	
	
	public static void   selectByVisibleText(String text,WebElement we){
		
		Select se=new Select(we);
		se.selectByVisibleText(text);
	}

	public static void Windowhandle(int TabNo)
	{
		
		ArrayList<String> newtab=new ArrayList<String>(dr.getWindowHandles());
		dr.switchTo().window(newtab.get(TabNo));
		System.out.println("Change focus to new tab " + TabNo);
	}

	public static void   WaitForXpathPresent( String WbXpath)
	{
		WebDriverWait wait=new WebDriverWait(dr, 10000);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(WbXpath)));
	}
	public static void   WaitForNamePresent( String WbName)
	{
		WebDriverWait wait=new WebDriverWait(dr, 20);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(WbName)));

	}
	public static void   WaitForcssSelectorPresent( String WbcssSelector)
	{
		WebDriverWait wait=new WebDriverWait(dr, 20);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector(WbcssSelector)));
	}
	public static void   WaitForid( String Wbid)
	{
		WebDriverWait wait=new WebDriverWait(dr, 50);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.id(Wbid)));

	}
	public static void   WaitForlinkText( String WblinkText)
	{
		WebDriverWait wait=new WebDriverWait(dr, 20);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(WblinkText)));
	}

	public static void   WaitForpartiallinkText( String WbpartiallinkText)
	{
		WebDriverWait wait=new WebDriverWait(dr, 40);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(WbpartiallinkText)));

	}
	public static void   WaitFortag( String Wbtag)
	{
		WebDriverWait wait=new WebDriverWait(dr, 20);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(Wbtag)));

	}
	public static void   WaitForalertpresent( )
	{
		WebDriverWait wait=new WebDriverWait(dr, 20);

		wait.until(ExpectedConditions.alertIsPresent());
	}
	public static void print(String s)
	{
		Reporter.log(s);
		System.out.println(s);
		Log.info(s);
	}
}

