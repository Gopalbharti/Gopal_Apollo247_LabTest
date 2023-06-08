package com.pages;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


import java.io.IOException;


import org.openqa.selenium.support.PageFactory;

import com.utility.Utility;
import org.openqa.selenium.JavascriptExecutor;
public class TopBookedTestPage extends Utility {
	
	public TopBookedTestPage() throws IOException
	{
		PageFactory.initElements(driver, this);
	
	} 
	
	
	//X-path for category button
		@FindBy(xpath="//span[normalize-space()='Category']")
		private WebElement category;
		
		//X-path of health check
		@FindBy(xpath="//span[text()='BLOOD STUDIES (ANEMIA)']")
		private WebElement bloodStudies;
		
		//X-path of Done button
		
		@FindBy(xpath="(//span[text()='DONE'])[2]")
		private WebElement Done;
		
		
		//X-path for Add to cart button
		@FindBy(xpath="(//span[text()='Add To Cart'])[1]")
		private WebElement AddToCart;
		
		//X-path fro Add To cart button2
		@FindBy(xpath="(//span[text()='Add To Cart'])[2]")
		private WebElement AddToCart2;
		
		//X-path for view button
		@FindBy(xpath="//span[text()='View Details']")
		private WebElement View;
		
		//Method for validating  Tile of page
		public String validateTopBookTitle()
		{
			return driver.getTitle(); 
		}
		
		//Click on category
		public void clickonCategory()
		{
			category.click();
		}
		
		//Method for click on checkbox
		public void clickonbloodStudiesCheck()
		{
			bloodStudies.click();
		}
		
		//Method for Click on done button
		public void clickOnDone()
		{
			Done.click();
		}
		
		//Method for clicl on Add to Cart
		public void clickOnAddToCart()
		{
			AddToCart.click();
		}
		
		public void clickOnAddToCart2()
		{
			AddToCart2.click();
		}
		
		public void scrollForCategory() {

	        JavascriptExecutor js = (JavascriptExecutor) driver;

	        js.executeScript("window.scrollTo(0,180)");

	    }
		
		
		
		public void ClickOnView()
		{
			View.click();
		}

}
