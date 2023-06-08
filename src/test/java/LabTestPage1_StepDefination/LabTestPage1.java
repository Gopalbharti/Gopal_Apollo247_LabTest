package LabTestPage1_StepDefination;
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;
import java.io.IOException;
import com.pages.LabTestPage;
import com.pages.LandingPage;
import com.pages.TopBookedTestPage;
import com.utility.Utility;
import com.aventstack.extentreports.Status;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class LabTestPage1 extends Utility {
	
	
	public LandingPage ldp;
	public LabTestPage ltp;
	public TopBookedTestPage tbtp;
	

	public void objectMethod() throws IOException {

		ldp = new LandingPage();
		ltp = new LabTestPage();
		tbtp = new TopBookedTestPage();

	}
	
	//Scenario 1
	
	@Given("Chrome is opened and  Apollo247 app is opened")
	public void chrome_is_opened_and_apollo247_app_is_opened11() throws IOException, InterruptedException {
		
		objectMethod();
		Utility.browserMaximize();
		Utility.implicitWait();
		logger = report.createTest("test01");
		String actualtitle = ldp.validateLandinPageTitle();
		System.out.println(actualtitle);
		Thread.sleep(5000);
		ldp.notification_close();
		logger.log(Status.INFO, "Step1 is executed");
		
		
	}


   @Then("User navigate on the Landing page")
   public void user_navigate_on_the_landing_page() throws IOException, InterruptedException {
       
	    objectMethod();
	    Utility.implicitWait();	 
	
		String actualtitle = ldp.validateLandinPageTitle();
		String expectedtitle = "Apollo 247 - Online Doctor Consultation & Book Lab Tests at Home";

		try {
			assertEquals(actualtitle, expectedtitle);
			logger.log(Status.PASS, "Step2 is passed");
			System.out.println(actualtitle);
			assert true;
		} catch (AssertionError e) {
			e.printStackTrace();
			logger.log(Status.FAIL, "Step2 is failed");
			captureScreenshotOnFailure();
			assert false;
		}
		//Thread.sleep(3000);

		logger.log(Status.INFO, "Validating landing page title");
   }

   @When("User click on LAB-TESTS link")
   public void user_click_on_lab_tests_link() throws IOException, InterruptedException {
	  
	   objectMethod();
	   Thread.sleep(3000);
       ldp.LabTestsPageNavigation();
      // Utility.implicitWait();
       logger.log(Status.INFO, "Step3 is executed");
       
    
   }
 	@Then("User navigate on the LAB-TESTS page")
   		public void user_navigate_on_the_lab_tests_page() throws IOException, InterruptedException {
 		
 		objectMethod();
		Thread.sleep(4000);
		assertTrue(ltp.logoDisplayed());
		String actualtitle = ltp.validateLabTestPageTitle();
		String expectedtitle = "Book Lab Tests at Home from Apollo Diagnostics, Pathology Labs near me";

		try {
			assertEquals(actualtitle, expectedtitle);
			logger.log(Status.PASS, "Step4 is passed");
			System.out.println(actualtitle);
			assert true;
		} catch (AssertionError e) {
			e.printStackTrace();
			logger.log(Status.FAIL, "Step4 is failed");
			captureScreenshotOnFailure();
			assert false;
		}
		

 	}	
 	
 	//Scenario 2

	@Then("LAB-TESTS page fields are visible to user")
	public void lab_tests_page_fields_are_visible_to_user() throws Exception {
		
		objectMethod();
		Thread.sleep(3000);
		//Utility.implicitWait();
		assertTrue(ltp.checkIsDisplay());	
	
		
		// Text Assertion
				logger.log(Status.INFO, "Validating Lab Tests  page text");
				String actualText1 = ltp.textCapture();
				String expectedText1 = "TOP BOOKED TESTS (42)";
				try {

					logger.log(Status.INFO, "Step5 is executed");

					assertEquals(actualText1, expectedText1);
					logger.log(Status.PASS, "Test is passed");
					System.out.println("Actual text : " + actualText1);
					assert true;
				} catch (AssertionError e) {
					e.printStackTrace();
					logger.log(Status.FAIL, "Test is failed");
					captureScreenshotOnFailure();
					assert false;
				}
		ldp.captureScreenshot();


	}
	
	//Scenario 3
	
	@When("User click on view All link")
	public void user_click_on_view_all_link() throws IOException, InterruptedException {
		
		objectMethod();
		Utility.implicitWait();
		ltp.TopBookedTestPageNavigation();
		//Thread.sleep(4000);
		logger.log(Status.INFO, "Step6 is executed");
		    
	}
	
	@Then("User navigate on Book Test Page")
	public void user_navigate_on_book_test_page() throws InterruptedException, IOException {
		
		objectMethod();
		Thread.sleep(5000);
		String actualtitle = tbtp.validateTopBookTitle();
		String expectedtitle = "Top Tests to Manage Your Health at the Best Prices from Apollo 24|7"; 
		try {

			logger.log(Status.INFO, "Step7 is executed");

			assertEquals(actualtitle, expectedtitle);
			logger.log(Status.PASS, "Test is passed");
			System.out.println("Actual text : " + actualtitle);
			assert true;
		} catch (AssertionError e) {
			e.printStackTrace();
			logger.log(Status.FAIL, "Test is failed");
			captureScreenshotOnFailure();
			assert false;
		};
		
		
	    
	}
	@When("User click on the category section")
	public void user_click_on_the_category_section() throws IOException, InterruptedException {
		
		objectMethod();
		Utility.scrollForCategory();
		tbtp.clickonCategory();
		Utility.implicitWait();
		logger.log(Status.INFO, "Step8 is executed");
	
	    
	}
	@When("User click on specfic checkbox")
	public void user_click_on_specfic_checkbox() throws IOException {
		
		objectMethod();
		Utility.implicitWait();
		tbtp.clickonbloodStudiesCheck();
		logger.log(Status.INFO, "Step9 is executed");
   
	}
	@When("User click on done button")
	public void user_click_on_done_button() throws IOException, InterruptedException {
		
		Utility.implicitWait();
		objectMethod();
		Thread.sleep(4000);
		tbtp.clickOnDone();
		Utility.implicitWait();
		logger.log(Status.INFO, "Step10 is executed");
    
	}
	@Then("it show the list of avilbale Tests")
	public void it_show_the_list_of_avilbale_tests() throws Exception {
		
		Thread.sleep(4000);
		tbtp.captureScreenshot();
		logger.log(Status.INFO, "Step11 is executed");
		
	    
	}
	@When("User click on the Add to cart")
	public void user_click_on_the_add_to_cart() throws IOException, InterruptedException {
		
 		Utility.implicitWait();
		objectMethod();
		Thread.sleep(4000);
		tbtp.clickOnAddToCart();
		tbtp.clickOnAddToCart2();
		logger.log(Status.INFO, "Step12 is executed");
		
		
	    
	}
	@When("User click on view details")
	public void user_click_on_view_details() throws IOException, InterruptedException {
		
		Utility.implicitWait();
		objectMethod();
		tbtp.ClickOnView();
		Thread.sleep(4000);    
		logger.log(Status.INFO, "Step13 is executed");
	}
	@Then("it shows the list of selected tests")
	public void it_shows_the_list_of_selected_tests() throws Exception {
		
		
		String actualtitle = tbtp.validateTopBookTitle();
		String expectedtitle = "Top Tests to Manage Your Health at the Best Prices from Apollo 24|7"; 
		try {

			logger.log(Status.INFO, "Step14 is executed");

			assertEquals(actualtitle, expectedtitle);
			logger.log(Status.PASS, "Test is passed");
			System.out.println("Actual text : " + actualtitle);
			assert true;
		} catch (AssertionError e) {
			e.printStackTrace();
			logger.log(Status.FAIL, "Test is failed");
			captureScreenshotOnFailure();
			assert false;
		};
		
		tbtp.captureScreenshot();
		
	    
	}







}
