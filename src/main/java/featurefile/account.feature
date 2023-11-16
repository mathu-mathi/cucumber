Feature: Salesforce Account Management

  Scenario:TC10: Creating a New Technology Partner Account
  
    Given I am on the Salesforce login page
    When I provide valid <username> and <password> data
    And I click the login button
    Then the Salesforce application home page is displayed with correct <username>
    When I click on the "Accounts" link on the home page
    Then the Accounts page is displayed with correct <username>
    When I navigate to create a new account
    And I enter "<Account name>" and select type as "Technology partner" from the dropdown
    And I set customer priority as "High"
    And I click the save button
    Then the new account page is displayed with the entered account details
    
 Scenario:TC11:Creating a New View in Accounts
 
    Given I am on the Salesforce application home page with correct <username>
    When I click on the "Accounts" link on the home page
    Then the Accounts page is displayed with correct <username>
    When I click on the "Create New View" link on the accounts page
    And I provide "<View name>" and "<View unique name>"
    And I click the save button
    Then the newly added view should be displayed in the account view list
    
  Scenario: TC12:Editing a View in Accounts
  
    Given I am on the Salesforce application home page with correct <username>
    When I click on the "Accounts" link on the home page
    Then the Accounts page is displayed with correct <username>
    When I select the "<view name>" from the view drop-down list on the Accounts page
    And I click on the "Edit" link on the Accounts page
    Then the "<view name>" edit page is displayed
    When I change the "<view name>" to "<new view name>"
    And I select the filter field "<Account name>", operator "<contains>", Value "<ram>"
    And I select "Last activity" in Select fields to display
    And I click on the save button
    Then the view page with "<new view name>" in the drop-down is displayed
    And the view will have the "Last activity" column added
    And the data in the list will have all account names that have "<a>" in the text
     
     Scenario: TC13:Merging Accounts
     
    Given I have launched the Salesforce application and logged in with positive <username> and <password>
    When I click on the "Accounts" link on the home page
    Then the Accounts page is displayed with correct <username>
    When I select accounts to merge
    And I click on the "Merge Accounts" link in the Tools area
    And I enter the "<Account name>" in the text box of the Merge Accounts page
    And I click the "Find Accounts" button
    Then at least 2 or more account links related to the entered <Account name> should be displayed
    When I select the first two account links displayed in the list
    And I click on the "Next" button
    Then the "Merge by Accounts Step 2" page is displayed with the selected accounts' details to merge
    When I click on the "Merge" button on the "Merge by Accounts Step 2" page
    And I click on the "OK" button on the pop-up
    Then a new pop-up for account merge confirmation is displayed
    And once the accounts are merged, the account page is displayed
    And the newly merged account is listed in the recently viewed view
    
 Scenario: TC14:Create account report
Given User login page is launched
 When Valid Username enters username field
 And  Valid Password enters Password field
 When User clicks on Login button
 Then User clicks on account tab
 And user clicks on accounts with last activity
 Then user selects the dates in unsaved report field
 And user clicks on save report
 And close the browser