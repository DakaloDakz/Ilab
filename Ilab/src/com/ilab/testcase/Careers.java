package com.ilab.testcase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import com.ilab.testcase.PageObject;

public class Careers extends PageObject {

	
	private final String clickcareerslnk = "//*[@id='menu-item-1373']/a"; 
	@FindBy(xpath = clickcareerslnk)
	private WebElement clickcareers;
	
	private final String clicksouthafricalnk = "/html/body/section/div[2]/div/div/div/div[3]/div[2]/div/div/div[3]/div[2]/div/div/div[3]/a"; 
	@FindBy(xpath = clicksouthafricalnk)
	private WebElement clicksouthafrica;

	private final String clickseniortestautomationlnk = "/html/body/section/div[2]/div/div/div/div[3]/div[2]/div/div/div/div/div/div[1]/div[1]/div[2]/span[1]/a"; 
	@FindBy(xpath = clickseniortestautomationlnk)
	private WebElement clickseniortestautomation;
	
	public Careers(WebDriver driver) {
		super(driver);
		
	}

	

	
	public boolean isInitialized() {
		
		return  clickcareers.isDisplayed();
		
	}
	
	public void ClickCareers(){
		
	
		this.clickcareers.click();


	    }

	public void ClickSouthAfrica(){
		
		
		this.clicksouthafrica.click();


	    }
	
   public void ClickSenoirAutomation(){
		
		
		this.clickseniortestautomation.click();


	    }
    
}
