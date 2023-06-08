package testrunner;


import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
features = "src/test/resources/features/LabTestPag2.feature",
			glue={"LabTestPage2_StepDefination","apphooks"},
			plugin= {"pretty" ,
					 "html:cucumber-report/cucumber",
					 "json:cucumber-report/cucumber.json",
			 		 "junit:cucumber-report/cucumber.xml"}
	
	)

public class TestRunner_LabTestPage2 extends AbstractTestNGCucumberTests{
 
}
