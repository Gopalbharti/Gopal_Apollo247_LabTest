package testrunner;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;




@CucumberOptions(
features = "src/test/resources/Features/LabTest_Excel.feature",
			glue={"LabTests_Excel_StepDefiniation","apphooks"},
			plugin= {"pretty" ,
					 "html:cucumber-report/cucumber",
					 "json:cucumber-report/cucumber.json",
			 		 "junit:cucumber-report/cucumber.xml"}
	
	)

public class TestRunner_LabTest_Excel extends AbstractTestNGCucumberTests {

}
