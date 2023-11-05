Feature: Login feature
         I want to use this template for my feature file
  Scenario: Validate login with correct credentials
          Given User lands on login page
          When User enters valid username and valid password
          And  User clicks on login button
          Then User should see home page
          But User should not see home page

 Scenario: Validate login with in valid  credentials
          Given User lands on login page
          When User enters valid username and in-valid password
          When User clicks on login button
          Then User should see error message

  @tag2
  Scenario:  login remember me
         Given User lands on login page             
	       When User enter the username and enter the password and check the remember me checkbox 
	       When User click on loginbutton
	       Then User should be see HomePage and click on user menu 
	       When User select on logout
	       Then User should see reloginpage
	       Then check the username is displayed
	       
Scenario: Forgot password

       Given user is on login page
	     When click on forgot password link
	     When user is on ForgotPasswordPage and enter username to get the mail
	     Then click on continue button
	     When user is on "CheckMailPage"
	     Then check for ReturnToLogin Button
	       
Scenario: Validate login ErrorMessage
           
          Given user is on login page
          When User enters invalid username and in-valid password
          When User clicks on login button
          Then User should see error message
   
    
