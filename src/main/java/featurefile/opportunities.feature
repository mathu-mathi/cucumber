Scenario: TC16:Create opportunities
Given User login page is launched
 When Valid Username enters username field
 And  Valid Password enters Password field
 When User clicks on Login button
 Then User Cicks on on opportunities link
 Then User clicks on the New button to create new Opty
 And User Enters the Necessery fields
 Then User clicks on new Opty save Button
  And close the browser
 
Scenario: TC17:Test Opportunity Pipeline Report
 Given User login page is launched
 When Valid Username enters username field
 And  Valid Password enters Password field
 When User clicks on Login button
 Then User Cicks on on opportunities link
 And User Click on Opportunity Pipeline link
 And close the browser  
 
Scenario: TC18:Test Stuck Opportunities Report
 Given User login page is launched
 When Valid Username enters username field
 And  Valid Password enters Password field
 When User clicks on Login button
 Then User Cicks on on opportunities link
 And User Click on Stuck Opportunities link
 And close the browser
 
Scenario: TC19:Test Quarterly Summary Report
 Given User login page is launched
 When Valid Username enters username field
 And  Valid Password enters Password field
 When User clicks on Login button
 Then User Cicks on on opportunities link
 And User Click on Quarterly Summary link 
 And close the browser