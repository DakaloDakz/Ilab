package com.ilab.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.ilab.base.WebDriverControl;
import com.ilab.testcase.HomePage;

@Listeners(WebDriverControl.class)
public class HomePage_Test {
	
	protected WebDriver driver;
	
	private HomePage homepage;
	

	@BeforeClass(alwaysRun = true)
	public void setUp() {

		RemoteWebDriver driver = WebDriverControl.getDriver();

		homepage = PageFactory.initElements(driver, HomePage.class);
		
	}
	//Verify home page 
		
		@SuppressWarnings("static-access")
		@Test(groups = "HomePage")
		public void verifyHomePage() throws InterruptedException {

		//Assert.assertTrue(homepage.VerifyHomePageTitle, "Personal Loans | Online Loans | Money Account | Old Mutual");	
		homepage.VerifyHomePageTitle("Home Page - iLAB");
		
}

}