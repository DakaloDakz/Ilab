package com.ilab.base;

import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Listeners;
import org.testng.annotations.Parameters;

import com.ilab.base.WebDriverControl;

@Listeners(WebDriverControl.class)
public class LaunchBrowser {

	@Parameters({"appURL"})
	protected void launchPage(String appURL) {
        @SuppressWarnings("unused")
		RemoteWebDriver driver = WebDriverControl.getDriver();
       
      
    }
}