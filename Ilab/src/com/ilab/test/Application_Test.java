package com.ilab.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.ilab.base.WebDriverControl;

import com.ilab.testcase.Application;

@Listeners(WebDriverControl.class)
public class Application_Test {
	
protected WebDriver driver;
	
	private Application application;
	

	@BeforeClass(alwaysRun = true)
	public void setUp() {

		RemoteWebDriver driver = WebDriverControl.getDriver();

		application = PageFactory.initElements(driver, Application.class);
		
	}
	//Verify Application page
		
		@SuppressWarnings("static-access")
		@Test(groups = "HomePage")
		public void verifyApplicationPage() throws InterruptedException {
			
			
			application.ClickApplyOnLine();
			application.EnterName("Dakalo");
			application.EnterEmail("automationAssement@iLABQuality.com");
			application.EnterPhone("083 568 7859");
			application.ClickSendApplication();
			Assert.assertEquals("You need to upload at least one file.", "You need to upload at least one file.");
       

}
}