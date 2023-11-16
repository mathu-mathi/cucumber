Scenario: TC05:Verify user dropdown menu 
 Given User login page is launched
 When Valid Username enters username field
 And  Valid Password enters Password field
 When User clicks on Login button
 When User clicks on user menu dropdown
 Then User dropdown menu should be displayed
 And close the browser
 
Scenario: TC06:Select My Profile option from user menu
  Given User login page is launched
 When Valid Username enters username field
 And  Valid Password enters Password field
 When User clicks on Login button
 When User clicks on user menu dropdown
 Then User dropdown menu should be displayed
 Then User clicks on user profile
 And User clicks one edit profile button
 Then User clicks on about Tab
 Then User enters last name
 Then User clicks on save all Button
 And User clicks on post link
 Then User enters a text in post area 
 And clicks on share button
 Then User clicks on upload file
 And User upload a file from system
 Then User clicks on upload button
 Then User clicks on upload photo
 And close the browser
 
Scenario: TC08:Select Developers Console option from user menu for <username> drop down
 Given User login page is launched
 When Valid Username enters username field
 And  Valid Password enters Password field
 When User clicks on Login button
 When User clicks on user menu dropdown
 Then User dropdown menu should be displayed
 And User clicks on developer console
 Then User closes the developer console
 And close the browser

Scenario: TC09:Select Logout option from user menu for <username> drop down
 Given User login page is launched
 When Valid Username enters username field
 And  Valid Password enters Password field
 When User clicks on Login button
 When User clicks on user menu dropdown
 And logout menu is clicked
 And close the browser
