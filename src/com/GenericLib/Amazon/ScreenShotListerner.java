package com.GenericLib.Amazon;

import java.io.File;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;



public class ScreenShotListerner extends Initialize_Webdriver   implements ITestListener  {
	WebDriver driver ;

	public void onFinish(ITestContext arg0) {
		// TODO Auto-generated method stub

	}

	public void onStart(ITestContext arg0) {
		// TODO Auto-generated method stub

	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult arg0) {
		// TODO Auto-generated method stub

	}

	public void onTestFailure(ITestResult t) {



		DateFormat dateFormat = new SimpleDateFormat("-yyyy-MM-dd_HH-mm-ss");
		Date date = new Date();


		String fileName= t.getTestClass().getName();//String fileName= t.getMethod().getMethodName();

		File filepath1 = new File ("Screenshots");

		System.out.println("File1 path is :"+filepath1);

		//	File filepath1 = new File ("G:\\Workspace etender\\eTenderWithoutPkINewFramework\\Screenshots");
		String imgpath=filepath1.getAbsolutePath();
		File dstFile= new File(imgpath+"/"+fileName+ dateFormat.format(date)+".png");

		System.out.println("File path is :"+dstFile);

		/*WebDriver augmentedDriver = new Augmenter().augment(dr);
		Screenshot screenshot = new AShot().shootingStrategy(new ViewportPastingStrategy(1000)).takeScreenshot(augmentedDriver);
		try {
			ImageIO.write(screenshot.getImage(), "PNG", dstFile);
			Log.info("Test case is :"+fileName+" Screenshot is :"+dstFile);
			System.out.println("***Placed screen shot at "+dstFile+" ***");
			Reporter.log("Placed screen shot at :" + dstFile);
			System.setProperty("org.uncommons.reportng.escape-output", "false");
			Reporter.log(
					"<a title= \"title\" href=\"/"+dstFile+"\">" +
							"<img width=\"418\" height=\"240\" alt=\"alternativeName\" title=\"title\" src=\"/"+dstFile+"\"></a>");
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			System.out.println("Screenshot file not found :" +e1);
			e1.printStackTrace();
		}

*/

		/*try {
			FileUtils.copyFile(srcFile, dstFile);
			System.out.println("***Placed screen shot at "+dstFile+" ***");
			Reporter.log("Placed screen shot at :" + dstFile);
			System.setProperty("org.uncommons.reportng.escape-output", "false");

			Reporter.log(
			"<a title= \"title\" href=\"/"+dstFile+"\">" +
			    "<img width=\"418\" height=\"240\" alt=\"alternativeName\" title=\"title\" src=\"/"+dstFile+"\"></a>");

		} catch (IOException e) {
			System.out.println("Screenshot file not found :" +e);
			e.printStackTrace();

		}*/
	}



	public void onTestSkipped(ITestResult arg0) {
		// TODO Auto-generated method stub

	}

	public void onTestStart(ITestResult arg0) {
		// TODO Auto-generated method stub

	}

	public void onTestSuccess(ITestResult r) {}



}


