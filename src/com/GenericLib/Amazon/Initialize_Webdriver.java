package com.GenericLib.Amazon;

import org.testng.annotations.BeforeClass;
//import org.testng.annotations.BeforeMethod;

import PageObjectModelRepository.*;

public class Initialize_Webdriver extends BrowserObjects{
	
	
@BeforeClass
public void Initialize()
{
	System.out.println("Loding... Driver initializing");
	new WebDriverCommonLib();
	new Login_Page();
	new Home_Page();
	new Addcart_page();
	new MyCart_page();
	new CreateAccount_Page();
	
	System.out.println("Driver initializing completed");
	
}
}
