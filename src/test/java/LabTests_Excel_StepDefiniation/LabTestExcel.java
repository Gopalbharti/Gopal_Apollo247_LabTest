package LabTests_Excel_StepDefiniation;
import static org.testng.Assert.assertEquals;

import java.io.IOException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import java.util.List;
import java.util.Map;

import com.aventstack.extentreports.Status;
import com.pages.LabTestPage;
import com.pages.LandingPage;
import com.utility.Config;
import com.utility.ExcelReader;
import com.utility.Utility;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LabTestExcel extends Utility{
	
	public LandingPage ldp;
	public LabTestPage ltp;
	 ExcelReader reader;
	
	public void objectMethod() throws IOException {

		ldp = new LandingPage();
		ltp = new LabTestPage();
		

	}

	@Given("Chrome is opened and  Apollo247 app is opened")
	public void chrome_is_opened_and_apollo247_app_is_opened() throws IOException, InterruptedException {
	    
		objectMethod();
		Utility.browserMaximize();
		logger = report.createTest("test03");
		String actualtitle = ldp.validateLandinPageTitle();
		System.out.println(actualtitle);
		Thread.sleep(7000);
		ldp.notification_close();
		logger.log(Status.INFO, "Step1 is executed");
	}
	
	
	@When("User click on the LAB_TESTS link")
	public void user_click_on_the_lab_tests_link() throws IOException {
		
		
		   objectMethod();
	       ldp.LabTestsPageNavigation();
	       Utility.implicitWait();
	       logger.log(Status.INFO, "Step2 is executed");
	    
	}
	
	
	@Then("User navigate on the LAB-TESTS page")
	public void user_navigate_on_the_lab_tests_page() throws IOException, InterruptedException {
		
		objectMethod();
		logger.log(Status.INFO, "Validating Lab Tests  page text");
		String actualText1 = ltp.textCapture();
		String expectedText1 = "TOP BOOKED TESTS (42)";
		try {

			logger.log(Status.INFO, "Step3 is executed");

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

		Thread.sleep(4000);
	    
	}
	
	
	@When("User fills the test data from given sheetname {string} and rownumber {int}")
	public void user_fills_the_test_data_from_given_sheetname_and_rownumber(String sheetName, Integer rowNumber) throws IOException, InvalidFormatException, InterruptedException {
	   
		objectMethod();
        reader = new ExcelReader();
        List<Map<String,String>> testData = reader.getData(Config.excelPath, sheetName);
        String tests = testData.get(rowNumber).get("Tests");
        ltp.searchText(tests);
        Thread.sleep(5000);
        logger.log(Status.INFO, "Step4 is executed");
		
	}
	
	
	@Then("It display the list of test available")
	public void it_display_the_list_of_test_available() throws Exception {
		
		Thread.sleep(4000);
		ltp.captureScreenshot();
		logger.log(Status.INFO, "Step5 is executed");
		
	    
	}
	


	@When("User fills the invalid test data from given sheetname {string} and rownumber {int}")
	public void user_fills_the_invalid_test_data_from_given_sheetname_and_rownumber(String sheetName, Integer rowNumber) throws IOException, InvalidFormatException, InterruptedException {
	    
		objectMethod();
        reader = new ExcelReader();
        List<Map<String,String>> testData = reader.getData(Config.excelPath, sheetName);
        String tests = testData.get(rowNumber).get("Tests");
        ltp.searchText(tests);
        Thread.sleep(5000);
        logger.log(Status.INFO, "Step4 is executed");
		
		
	}
	
	
	@Then("It display the empty list or display message no test avaliable")
	public void it_display_the_empty_list_or_display_message_no_test_avaliable() throws Exception {
		
		Thread.sleep(4000);
		ltp.captureScreenshot();
		logger.log(Status.INFO, "Step5 is executed");
	   
	}



	







}
