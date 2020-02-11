package com.ilab.testcase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import com.ilab.testcase.PageObject;

public class Application extends PageObject {

	
	private final String clickapplyOnlinebtn = "//*[@id='wpjb-scroll']/div[1]/a"; 
	@FindBy(xpath = clickapplyOnlinebtn)
	private WebElement clickapplyOnline;
	
	private final String nametxt = "applicant_name"; 
	@FindBy(id = nametxt)
	private WebElement name;

	
	
	private final String emailtxt = "email"; 
	@FindBy(id = emailtxt)
	private WebElement email;
	
	private final String phonetxt = "phone"; 
	@FindBy(id = phonetxt)
	private WebElement phone;
	
	private final String Sendbtn = "//*[@id='wpjb_submit']"; 
	@FindBy(xpath = Sendbtn)
	private WebElement Send;
	
	
	public Application(WebDriver driver) {
		super(driver);
		
	}
	
	  public void ClickApplyOnLine(){
			
	 		this.clickapplyOnline.click();


	 	    }
	
	public void EnterName(String name ){
		   
		   
		   this.name.clear();
			
			this.name.sendKeys(name);


		    }
	   
	public void EnterEmail(String email ){
		   
		   
		   this.email.clear();
			
			this.email.sendKeys(email);


		    }
	
	public void EnterPhone(String phone ){
		   
		   
		   this.phone.clear();
			
			this.phone.sendKeys(phone);


		    }
	     
	   public void ClickSendApplication(){
			
			this.Send.click();


		    }
	   
}
