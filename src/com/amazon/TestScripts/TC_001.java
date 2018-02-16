package com.amazon.TestScripts;


import org.testng.annotations.Test;

import com.GenericLib.Amazon.WebDriverCommonLib;

import PageObjectModelRepository.*;

public class TC_001   extends WebDriverCommonLib {

	@Test(alwaysRun=true)
	public void ProductOrdering() throws Exception {
		
		Login_Page.Username_Textbox();
		Login_Page.Continue_btn();
		Login_Page.Password();
		Login_Page.Login_btn();
		Home_Page.SearchBox();
		Home_Page.Search_btn();
		Home_Page.ItemsSorting();
		Home_Page.Itemstitle();
		Addcart_page.AddCart_btn();
		MyCart_page.Carticon();
		MyCart_page.Verify();
		MyCart_page.Logout();
	}
	

}
