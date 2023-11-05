package stepdefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.en.*;
public class AccountSteps {
//hooks in cucumber
	@Before
	public void setup()
	{
		WebDriver driver;
		@Given("I am on the Salesforce login page")
		public void i_am_on_the_salesforce_login_page() {
		    // Write code here that turns the phrase above into concrete actions
			driver=new ChromeDriver();
			driver.get("https://login.salesforce.com");
		    throw new io.cucumber.java.PendingException();
		}

		@When("I provide valid <username> and <password> data")
		public void i_provide_valid_username_and_password_data() {
			driver.findElement(By.id("username")).sendKeys("avgsv");
			driver.findElement(By.id("password")).sendKeys("fgftr");
		    // Write code here that turns the phrase above into concrete actions
		    throw new io.cucumber.java.PendingException();
		}

		@When("I click the login button")
		public void i_click_the_login_button() {
			driver.findElement(By.id("login")).click();
		    // Write code here that turns the phrase above into concrete actions
		    throw new io.cucumber.java.PendingException();
		}

		@Then("the Salesforce application home page is displayed with correct <username>")
		public void the_salesforce_application_home_page_is_displayed_with_correct_username() {
		    // Write code here that turns the phrase above into concrete actions
		    throw new io.cucumber.java.PendingException();
		}

		@When("I click on the {string} link on the home page")
		public void i_click_on_the_link_on_the_home_page(String string) {
			WebElement Accounts_Tab = driver.findElement(By.xpath("//*[@id=\"Account_Tab\"]/a"));
			Accounts_Tab.click();
		    // Write code here that turns the phrase above into concrete actions
		    throw new io.cucumber.java.PendingException();
		}

		@Then("the Accounts page is displayed with correct <username>")
		public void the_accounts_page_is_displayed_with_correct_username() {
			
		    // Write code here that turns the phrase above into concrete actions
		    throw new io.cucumber.java.PendingException();
		}

		@When("I navigate to create a new account")
		public void i_navigate_to_create_a_new_account() {
			WebElement New = driver.findElement(By.xpath("//*[@id=\"hotlist\"]/table/tbody/tr/td[2]/input"));
			New.click();
			System.out.println("Clicked on New tab..");
			WebElement AccountName = driver.findElement(By.id("acc2"));
			AccountName.clear();
			AccountName.sendKeys("Accountss");
			WebElement selecttype = driver.findElement(By.xpath("//select[@id='acc6']"));
			Select select = new Select(selecttype);
			select.selectByVisibleText("Technology Partner");
		    // Write code here that turns the phrase above into concrete actions
		    throw new io.cucumber.java.PendingException();
		}

		@When("I enter {string} and select type as {string} from the dropdown")
		public void i_enter_and_select_type_as_from_the_dropdown(String string, String string2) 
		{
			WebElement selecttype = driver.findElement(By.xpath("//select[@id='acc6']"));
			Select select = new Select(selecttype);
			select.selectByVisibleText("Technology Partner");
		    // Write code here that turns the phrase above into concrete actions
		    throw new io.cucumber.java.PendingException();
		}

		@When("I set customer priority as {string}")
		public void i_set_customer_priority_as(String string) {
			WebElement  coustomerpriority = driver.findElement(By.xpath("//select[@id='00N0o00000Fy3l4']"));
			Select select1 = new Select(coustomerpriority);
			select1.selectByVisibleText("High");
		    // Write code here that turns the phrase above into concrete actions
		    throw new io.cucumber.java.PendingException();
		}

		@When("I click the save button")
		public void i_click_the_save_button() {
			WebElement Save = driver.findElement(By.name("save"));
			Save.click();
			System.out.println("Clicked on Save button..");
		    // Write code here that turns the phrase above into concrete actions
		    throw new io.cucumber.java.PendingException();
		}

		@Then("the new account page is displayed with the entered account details")
		public void the_new_account_page_is_displayed_with_the_entered_account_details() {
		    // Write code here that turns the phrase above into concrete actions
		    throw new io.cucumber.java.PendingException();
		}

		@Given("I am on the Salesforce application home page with correct <username>")
		public void i_am_on_the_salesforce_application_home_page_with_correct_username() {
			WebElement Uname=driver.findElement(By.xpath("//input[@id='username']"));
			enterText(Uname, "mithun.r@tekarch.com", "UserName");
			WebElement pwd=driver.findElement(By.xpath("//input[@id='password']"));
			pwd.clear();
			enterText(pwd, "Test4321", "Password");
		    WebElement login = driver.findElement(By.xpath("//*[@id='Login']"));
		    clickObj(login, "login");
		    String actualTitle = driver.getTitle();
		    // Write code here that turns the phrase above into concrete actions
		    throw new io.cucumber.java.PendingException();
		}

		@When("I click on the {string} link on the accounts page")
		public void i_click_on_the_link_on_the_accounts_page(String string) {
			WebElement Accounts_Tab = driver.findElement(By.xpath("//*[@id=\"Account_Tab\"]/a"));
			Accounts_Tab.click();
			System.out.println("Clicked on Accounts Ta..");
		    // Write code here that turns the phrase above into concrete actions
		    throw new io.cucumber.java.PendingException();
		}

		@When("I provide {string} and {string}")
		public void i_provide_and(String string, String string2) {
			WebElement CreateNewView = driver.findElement(By.xpath("//*[@id=\"filter_element\"]/div/span/span[2]/a[2]"));
			CreateNewView.click();
			System.out.println("Clicked on Create New View..");
			
			WebElement ViewName = driver.findElement(By.xpath("//*[@id=\"fname\"]"));
			ViewName.clear();
			ViewName.sendKeys("hhhhh");
			String value = driver.findElement(By.xpath("//*[@id=\"fname\"]")).getAttribute("value");
			System.out.println(value);
			
			WebElement ViewUniqueName = driver.findElement(By.xpath("//*[@id=\"devname\"]"));
			ViewUniqueName.clear();
			ViewUniqueName.sendKeys("h");
			
			WebElement Save = driver.findElement(By.xpath("//*[@id=\"editPage\"]/div[3]/table/tbody/tr/td[2]/input[1]"));
			Save.click();
			System.out.println("Clicked on save button"); 
			
		    // Write code here that turns the phrase above into concrete actions
		    throw new io.cucumber.java.PendingException();
		}

		@Then("the newly added view should be displayed in the account view list")
		public void the_newly_added_view_should_be_displayed_in_the_account_view_list() {
		    // Write code here that turns the phrase above into concrete actions
		    throw new io.cucumber.java.PendingException();
		}

		@When("I select the {string} from the view drop-down list on the Accounts page")
		public void i_select_the_from_the_view_drop_down_list_on_the_accounts_page(String string) {
			WebElement dropdown = driver.findElement(By.className("title"));
			dropdown.click();
			Select dropdown_options = new Select(dropdown);
			List<WebElement> options = dropdown_options.getOptions();
			
			for(int i=0; i<options.size(); i++) {
				if(options.get(i).getText().equals(value)) {
					System.out.println("Account name is displayed in the dropdown");
				}
			}
			// Write code here that turns the phrase above into concrete actions
		    throw new io.cucumber.java.PendingException();
		}

		@When("I click on the {string} link on the Accounts page")
		public void i_click_on_the_link_on_the_accounts_page(String string) {
			WebElement Accounts_Tab = driver.findElement(By.xpath("//*[@id=\"Account_Tab\"]/a"));
			Accounts_Tab.click();
			System.out.println("Clicked on Accounts Ta..");
		    // Write code here that turns the phrase above into concrete actions
		    throw new io.cucumber.java.PendingException();
		}

		@Then("the {string} edit page is displayed")
		public void the_edit_page_is_displayed(String string) {
			
		    // Write code here that turns the phrase above into concrete actions
		    throw new io.cucumber.java.PendingException();
		}

		@When("I change the {string} to {string}")
		public void i_change_the_to(String string, String string2) {
			
		    Select dropdown = new Select(driver.findElement(By.id("fcf")));
		    dropdown.selectByIndex(1);
				
			WebElement EditLink = driver.findElement(By.linkText("Edit"));
			clickObj(EditLink, "EditLink");
		    // Write code here that turns the phrase above into concrete actions
		    throw new io.cucumber.java.PendingException();
		}

		@When("I select the filter field {string}, operator {string}, Value {string}")
		public void i_select_the_filter_field_operator_value(String string, String string2, String string3) {
			WebElement firstcolumn = driver.findElement(By.xpath("//select[@id='fcol1']"));
			clickObj(firstcolumn, "firstcolumn");	
			WebElement fields = driver.findElement(By.xpath("//select[@id='fcol1']"));
			Select accfield = new Select(driver.findElement(By.xpath("//select[@id='fcol1']")));
			accfield.selectByIndex(1);	
			WebElement AddfieldsOperator = driver.findElement(By.xpath("//select[@id='fcol1']"));
			Select operator = new Select(driver.findElement(By.xpath("//select[@id='fop1']")));
			operator.selectByIndex(3);
			WebElement value = driver.findElement(By.id("fval1"));
			value.clear();
			value.sendKeys("<a>");
			
		    // Write code here that turns the phrase above into concrete actions
		    throw new io.cucumber.java.PendingException();
		}

		@When("I select {string} in Select fields to display")
		public void i_select_in_select_fields_to_display(String string) {
			WebElement Available_Fields_dropdown = driver.findElement(By.xpath("//*[@id='colselector_select_0']"));
			Select Available_Fields_dropdown_list = new Select(Available_Fields_dropdown);
			List<WebElement> Available_Fields_dropdown_options = Available_Fields_dropdown_list.getOptions();

			boolean Element_available = false; //using as a reference to validate if the last activity is in available fields dropdown or not
			
			for(int i=0; i<Available_Fields_dropdown_options.size(); i++) {
				if(Available_Fields_dropdown_options.get(i).getText().equals("Last Activity")) {
					Element_available = true;
					WebElement Add_arrow = driver.findElement(By.xpath("//img[@class='rightArrowIcon']"));
					Add_arrow.click();
					break;
				}
			}
			if(Element_available = false) {
				WebElement Selected_Fields_dropdown = driver.findElement(By.xpath("//select[@id='colselector_select_1']"));
				Select Selected_Fields_dropdown_list = new Select(Available_Fields_dropdown);
				List<WebElement> Selected_Fields_dropdown_options = Available_Fields_dropdown_list.getOptions();

				for(int i=0; i<Available_Fields_dropdown_options.size(); i++) {
					if(Selected_Fields_dropdown_options.get(i).getText().equals("Last Activity")) {
						break;
					}
				}	
			}
		    // Write code here that turns the phrase above into concrete actions
		    throw new io.cucumber.java.PendingException();
		}

		@When("I click on the save button")
		public void i_click_on_the_save_button() {
			WebElement Save_button = driver.findElement(By.name("save"));
			Save_button.click();
			driver.close();
		    // Write code here that turns the phrase above into concrete actions
		    throw new io.cucumber.java.PendingException();
		}

		@Then("the view page with {string} in the drop-down is displayed")
		public void the_view_page_with_in_the_drop_down_is_displayed(String string) {
			
		    // Write code here that turns the phrase above into concrete actions
		    throw new io.cucumber.java.PendingException();
		}

		@Then("the view will have the {string} column added")
		public void the_view_will_have_the_column_added(String string) {
		    // Write code here that turns the phrase above into concrete actions
		    throw new io.cucumber.java.PendingException();
		}

		@Then("the data in the list will have all account names that have {string} in the text")
		public void the_data_in_the_list_will_have_all_account_names_that_have_in_the_text(String string) {
			driver.get("https://login.salesforce.com");
			  driver.manage().window().maximize();
			  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			WebElement Uname=driver.findElement(By.xpath("//input[@id='username']"));
			enterText(Uname, "mithun.r@tekarch.com", "UserName");
			WebElement pwd=driver.findElement(By.xpath("//input[@id='password']"));
			pwd.clear();
			enterText(pwd, "Test4321", "Password");
		    WebElement login = driver.findElement(By.xpath("//*[@id='Login']"));
		    clickObj(login, "login");
		    String actualTitle = driver.getTitle();
			driver.manage().window().maximize();
			String expectedTitle = "Home Page ~ Salesforce - Developer Edition";
			if(actualTitle.equalsIgnoreCase(expectedTitle)) {
			System.out.println("User is on home page");
			}
			else {
				System.out.println("home page is not Lunched");
			}
			// Write code here that turns the phrase above into concrete actions
		    throw new io.cucumber.java.PendingException();
		}

		@Given("I have launched the Salesforce application and logged in with positive <username> and <password>")
		public void i_have_launched_the_salesforce_application_and_logged_in_with_positive_username_and_password() {
		    // Write code here that turns the phrase above into concrete actions
		    throw new io.cucumber.java.PendingException();
		}

		@When("I select accounts to merge")
		public void i_select_accounts_to_merge() {
			WebElement Mergeacc = driver.findElement(By.xpath("//a[contains(text(),'Merge Accounts')]"));
			clickObj(Mergeacc, "Mergeacc");
		    // Write code here that turns the phrase above into concrete actions
		    throw new io.cucumber.java.PendingException();
		}

		@When("I click on the {string} link in the Tools area")
		public void i_click_on_the_link_in_the_tools_area(String string) {
		    // Write code here that turns the phrase above into concrete actions
		    throw new io.cucumber.java.PendingException();
		}

		@When("I enter the {string} in the text box of the Merge Accounts page")
		public void i_enter_the_in_the_text_box_of_the_merge_accounts_page(String string) {
			WebElement Accounts_Tab = driver.findElement(By.xpath("//*[@id=\"Account_Tab\"]/a"));
			Accounts_Tab.click();
			WebElement fb = driver.findElement(By.id("srch"));
			fb.clear();
			enterText(fb, "Accountss", "FindAccounts");
			WebElement FindAcc = driver.findElement(By.name("srchbutton"));
			clickObj(FindAcc, "FindAcc");
		    // Write code here that turns the phrase above into concrete actions
		    throw new io.cucumber.java.PendingException();
		}

		@When("I click the {string} button")
		public void i_click_the_button(String string) {
		    // Write code here that turns the phrase above into concrete actions
		    throw new io.cucumber.java.PendingException();
		}

		@Then("at least {int} or more account links related to the entered <Account name> should be displayed")
		public void at_least_or_more_account_links_related_to_the_entered_account_name_should_be_displayed(Integer int1) {
		    // Write code here that turns the phrase above into concrete actions
		    throw new io.cucumber.java.PendingException();
		}

		@When("I select the first two account links displayed in the list")
		public void i_select_the_first_two_account_links_displayed_in_the_list() {
			 WebElement Button1 = driver.findElement(By.xpath("//input[@id='cid0']"));
			    Radiobutton(Button1, "RadioButton");
			    WebElement Button2 = driver.findElement(By.xpath("//input[@id='cid1']"));
			    Radiobutton(Button2, "RadioButton");
		    // Write code here that turns the phrase above into concrete actions
		    throw new io.cucumber.java.PendingException();
		}

		@When("I click on the {string} button")
		public void i_click_on_the_button(String string) {
		    // Write code here that turns the phrase above into concrete actions
		    throw new io.cucumber.java.PendingException();
		}

		@Then("the {string} page is displayed with the selected accounts' details to merge")
		public void the_page_is_displayed_with_the_selected_accounts_details_to_merge(String string) {
		    // Write code here that turns the phrase above into concrete actions
		    throw new io.cucumber.java.PendingException();
		}

		@When("I click on the {string} button on the {string} page")
		public void i_click_on_the_button_on_the_page(String string, String string2) {
			 WebElement Button1 = driver.findElement(By.xpath("//input[@id='cid0']"));
			    Radiobutton(Button1, "RadioButton");
			    WebElement Button2 = driver.findElement(By.xpath("//input[@id='cid1']"));
			    Radiobutton(Button2, "RadioButton");
			    WebElement Button3 = driver.findElement(By.xpath("//input[@id='cid2']"));
			    Radiobutton(Button3, "RadioButton");
			    
		    // Write code here that turns the phrase above into concrete actions
		    throw new io.cucumber.java.PendingException();
		}

		@When("I click on the {string} button on the pop-up")
		public void i_click_on_the_button_on_the_pop_up(String string) {
		    // Write code here that turns the phrase above into concrete actions
		    throw new io.cucumber.java.PendingException();
		}

		@Then("a new pop-up for account merge confirmation is displayed")
		public void a_new_pop_up_for_account_merge_confirmation_is_displayed() {
			WebElement Next = driver.findElement(By.xpath("//div[contains(@class,'pbTopButtons')]//input[contains(@title,'Next')]"));
		    Next.click(); 
		    // Write code here that turns the phrase above into concrete actions
		    throw new io.cucumber.java.PendingException();
		}

		@Then("once the accounts are merged, the account page is displayed")
		public void once_the_accounts_are_merged_the_account_page_is_displayed() {
			 WebElement Merge = driver.findElement(By.xpath("//div[@class='pbTopButtons']//input[@title='Merge']"));
			    Merge.click();	    
			    switchtoAlert(driver);	
			    driver.close();
		    // Write code here that turns the phrase above into concrete actions
		    throw new io.cucumber.java.PendingException();
		}

		@Then("the newly merged account is listed in the recently viewed view")
		public void the_newly_merged_account_is_listed_in_the_recently_viewed_view() {
		    // Write code here that turns the phrase above into concrete actions
		    throw new io.cucumber.java.PendingException();
		}



	}
}
