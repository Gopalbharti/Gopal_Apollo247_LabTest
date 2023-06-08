Feature: Lab-Tests
 
    Scenario Outline: Verify Search functionality with valid Test
		   Given  Chrome is opened and  Apollo247 app is opened
		   When   User click on the LAB_TESTS link
		   Then   User navigate on the LAB-TESTS page 
		   When   User fills the test data from given sheetname "<SheetName>" and rownumber <RowNumber>
		   Then   It display the list of test available
		   
		   Examples:
		     |SheetName  | RowNumber  |
		     | Sheet1		 |			0	    |	
		     
		     
		 Scenario Outline: Verify Search functionality with invavalid Test
		   Given  Chrome is opened and  Apollo247 app is opened
		   When   User click on the LAB_TESTS link
		   Then   User navigate on the LAB-TESTS page 
		   When   User fills the invalid test data from given sheetname "<SheetName>" and rownumber <RowNumber>
		   Then   It display the empty list or display message no test avaliable
		   
		   Examples:
		     |SheetName  | RowNumber  |
		     | Sheet2		 |			0     |