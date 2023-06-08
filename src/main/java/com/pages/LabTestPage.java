package com.pages;
import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.utility.Utility;

public class LabTestPage extends Utility {
	
	   // x-Path for View All 
		@FindBy(xpath = "(//*[text()='View All'])[2]")
		WebElement ViewAll;
		
		//X-path for Searchbar
		@FindBy(xpath = "//input[@placeholder='Search test and packages']")
		private WebElement search;
		
		//X-path for logo of Apollo247
		@FindBy(xpath = "(//img[@title='Online Doctor Consultation & Medicines'])[1]")
		private WebElement logo;

		//X-Path for text
		@FindBy(xpath="//*[text()='Top Booked Tests (42)']")
		 WebElement textElement; 
		
		public LabTestPage() throws IOException {

			PageFactory.initElements(driver, this);
		}
		
		// return the title 
		public String validateLabTestPageTitle() {
			return driver.getTitle();
		}
		
		//Method for checking button is displayed
		public boolean checkIsDisplay() throws IOException {
			
			return ViewAll.isDisplayed();
		}
		
		//Page chaining
		public TopBookedTestPage TopBookedTestPageNavigation() throws IOException
		{
			ViewAll.click();
			return new TopBookedTestPage(); 
		}
		
		//Passing the value
		public void searchText(String un) {
		  search.sendKeys(un);
			}
		
		
		public boolean logoDisplayed()
		{	
			return logo.isDisplayed();
		}
		
		//Method for capturing the text
		public String textCapture()
		{
			return textElement.getText();
		}
		

}
