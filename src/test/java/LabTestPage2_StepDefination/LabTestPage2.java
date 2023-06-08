package LabTestPage2_StepDefination;
import static org.testng.Assert.assertEquals;

import java.io.IOException;
import com.pages.LabTestPage;
import com.pages.LandingPage;
import com.utility.Utility;
import com.aventstack.extentreports.Status;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LabTestPage2 extends Utility{
	
	public LandingPage ldp;
	public LabTestPage ltp;
	
	public void objectMethod() throws IOException {

		ldp = new LandingPage();
		ltp = new LabTestPage();
		

	}
	

	@Given("Chrome is opened and  Apollo247 app is opened")
	public void chrome_is_opened_and_apollo247_app_is_opened() throws IOException, InterruptedException 
	{	
		objectMethod();
		Utility.browserMaximize();
	    Utility.implicitWait();
		ldp.notification_close();
		logger = report.createTest("test02");
		String actualtitle = ldp.validateLandinPageTitle();
		System.out.println(actualtitle);
		//Thread.sleep(7000);
		logger.log(Status.INFO, "Step1 is executed");
	}
	
	@When("User click on the LAB_TESTS link")
	public void user_click_on_the_lab_tests_link() throws IOException 
	{	
		   Utility.pageLoad();
		   objectMethod();
	       ldp.LabTestsPageNavigation();
	       Utility.implicitWait();
	       logger.log(Status.INFO, "Step2 is executed");
	}
	
	
	@Then("User navigate on the LAB-TESTS page")
	public void user_navigate_on_the_lab_tests_page() throws IOException, InterruptedException 
	{   
		objectMethod();
		Thread.sleep(4000);
		String actualtitle = ltp.validateLabTestPageTitle();
		String expectedtitle = "Book Lab Tests at Home from Apollo Diagnostics, Pathology Labs near me";

		try {
			assertEquals(actualtitle, expectedtitle);
			logger.log(Status.PASS, "Step3 is passed");
			System.out.println(actualtitle);
			assert true;
		} catch (AssertionError e) {
			e.printStackTrace();
			logger.log(Status.FAIL, "Step3 is failed");
			captureScreenshotOnFailure();
			assert false;
		}
		
	}
	
	
	@When("User enters valid Search Test {string}")
	public void user_enters_valid_search_test(String string) throws IOException, InterruptedException {
	    
		objectMethod();
	    ltp.searchText("RBC");
	    Thread.sleep(8000);
	    logger.log(Status.INFO, "Step4 is executed");
		
	}
	
	
	@Then("It display the list of test available")
	public void it_display_the_list_of_test_available() throws Exception {
	   
		objectMethod();
		ltp.captureScreenshot();
		logger.log(Status.INFO, "Step5 is executed");
		
	}


	@When("User enters invalid Search Test {string}")
	public void user_enters_invalid_search_test(String string) throws IOException, InterruptedException {
		objectMethod();
		Utility.implicitWait();
		Thread.sleep(4000);
	    ltp.searchText("@@@");
	    Thread.sleep(6000);
	    logger.log(Status.INFO, "Step6 is executed");
	    
	}
	@Then("It display the empty list or display message no test avaliable")
	public void it_display_the_empty_list_or_display_message_no_test_avaliable() throws Exception {
		objectMethod();
		ltp.captureScreenshot();	
		logger.log(Status.INFO, "Step7 is executed");
	    
	}

}
