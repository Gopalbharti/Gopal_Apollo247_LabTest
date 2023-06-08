Feature: Lab-Tests
 
  Scenario: Validate user navigate on Lab-Tests page
    Given Chrome is opened and  Apollo247 app is opened
    Then  User navigate on the Landing page
		 When  User click on LAB-TESTS link 
		 Then  User navigate on the LAB-TESTS page
		

		
		Scenario: Validte Lab-TESTS page UI
		   Given Chrome is opened and  Apollo247 app is opened
       Then  User navigate on the Landing page
		   When   User click on LAB-TESTS link 
			 Then  LAB-TESTS page fields are visible to user
		
		   
	   Scenario: Validate User select LAB-TESTS and view its details(Main Functionality)
  		Given Chrome is opened and  Apollo247 app is opened
      Then  User navigate on the Landing page
		  When   User click on LAB-TESTS link 
  		Then  User navigate on the LAB-TESTS page
  		When  User click on view All link
  		Then  User navigate on Book Test Page
  		Then   User click on the category section  
  		And   User click on specfic checkbox 
  		And 	User click on done button
  		Then  it show the list of avilbale Tests
  		Then   User click on the Add to cart
  		And   User click on view details 
  		Then  it shows the list of selected tests
  		
		     

		   
	