Feature: Lab-Tests
 
    Scenario Outline: Verify Search functionality with valid Test
		   Given  Chrome is opened and  Apollo247 app is opened
		   When   User click on the LAB_TESTS link
		   Then   User navigate on the LAB-TESTS page 
		   When   User enters valid Search Test "<SearchKeyword>"
		   Then   It display the list of test available
		   
		   Examples:
		     |Search|
		     |RBC		|
		     |CBC   |
		     
		     

   Scenario Outline: Verify Search functionality with invalid Test
		   Given  Chrome is opened and  Apollo247 app is opened
		   When   User click on the LAB_TESTS link
		   Then   User navigate on the LAB-TESTS page 
		   When   User enters invalid Search Test "<SearchKeyword>"
		   Then   It display the empty list or display message no test avaliable
		   
		   
		   Examples:
		     |Search|
		     |@@@@@ |
		     |AZECX	|
		     