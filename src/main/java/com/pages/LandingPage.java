package com.pages;
import java.io.IOException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.utility.Utility;

public class LandingPage extends Utility{
	
	
	   
		
		//For Popup notification
		@FindBy(xpath="//*[@id='wzrk-cancel']")
		 private WebElement notification_close;
		
		
		//for click on lab-test
		@FindBy(xpath="//*[text()='Lab Tests']")
		private WebElement LabTests; 
		
		
		public LandingPage() throws IOException
		{
			PageFactory.initElements(driver, this);
		
		} 
		
		 //For closing the popup
		public void notification_close()
		{
		    notification_close.click();
	    }
		
		//For validating of title of page
		public String validateLandinPageTitle()
		{
			return driver.getTitle(); 
		} 
		
		
		public LabTestPage LabTestsPageNavigation() throws IOException
		{
			LabTests.click();
			return new LabTestPage();
		}
		
		
		
		
	
		
			

}
