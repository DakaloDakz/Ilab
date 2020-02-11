package com.ilab.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.ilab.testcase.Careers;
import com.ilab.base.WebDriverControl;


@Listeners(WebDriverControl.class)
public class Careers_Test {
	
protected WebDriver driver;
	
	private Careers careers;
	

	@BeforeClass(alwaysRun = true)
	public void setUp() {

		RemoteWebDriver driver = WebDriverControl.getDriver();

		careers = PageFactory.initElements(driver, Careers.class);
		
	}
	//Verify Careers Page 
		
		@SuppressWarnings("static-access")
		@Test(groups = "CareersPage")
		public void verifyCareersPage() throws InterruptedException {
        
			careers.ClickCareers();
			careers.ClickSouthAfrica();
			careers.ClickSenoirAutomation();
		

}
}