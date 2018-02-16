package com.amazon.TestScripts;


import org.testng.annotations.Test;

import com.GenericLib.Amazon.WebDriverCommonLib;

import PageObjectModelRepository.*;

public class TC_002   extends WebDriverCommonLib {

	@Test(alwaysRun=true)
	public void CreateUser() throws Exception {
		
		Login_Page.CreateAccountLink();
		CreateAccount_Page.Yourname();
		CreateAccount_Page.Mobilenumber();
		CreateAccount_Page.NewPassword();
		CreateAccount_Page.Continue_btn();
	}
	

}
