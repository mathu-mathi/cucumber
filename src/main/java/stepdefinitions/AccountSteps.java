package stepdefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
@Listeners(Listener.class)
public class accountsteps extends BaseTest{
	@Test	
	@When("^User clicks on user menu dropdown$")
	public void user_clicks_on_user_menu_dropdown() throws Throwable 
	{
		Thread.sleep(3000);
		WebDriverWait wait=new WebDriverWait(driver,20);
		WebElement usermenu=wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id='userNavButton']")));
		usermenu.click();
	}
	@Then("User clicks on account tab")
	public void user_clicks_on_account_tab() throws Throwable {
		Thread.sleep(3000);
		WebElement Account = driver.findElement(By.xpath("//a[contains(@title,'Accounts Tab')]"));
		clickObj(Account, "Account");
       
	}

	@Then("User clicks on new account to fill account details")
	public void user_clicks_on_new_account_fill_account_details() throws Throwable {
		WebElement new_Element = driver.findElement(By.xpath("//input[contains(@title,'New')]"));
		clickObj(new_Element, "new_Element");
	    WebElement account_name = driver.findElement(By.xpath("//input[@id='acc2']"));
	    account_name.clear();
		enterText(account_name, "Accountss", "AccountName");
	   
	}

	@Then("User clicks on save Button")
	public void user_clicks_on_save_Button() {
		WebElement save = driver.findElement(By.xpath(" //td[@id='bottomButtonRow']//input[@title='Save']"));
		clickObj(save, "SaveButton");
	    
	}
	@Then("Click on create new view link on accounts page")
	public void click_on_create_new_view_link_on_accounts_page() throws Throwable {
		WebElement createnew_view = driver.findElement(By.xpath("//a[contains(text(),'Create New View')]"));
		clickObj(createnew_view, "createnew_view");
        WebElement view_name = findElement(By.xpath("//input[@id='fname']"),"ViewName");
		enterText(view_name, "ERA","ViewName");
        WebElement view_Unique_name = driver.findElement(By.id("devname"));
		enterText(view_Unique_name, "RAM123", "ViewUniqueName");
        WebElement save = driver.findElement(By.xpath(" //div[@class='pbBottomButtons']//input[@title='Save']"));
		clickObj(save, "SaveButton");
	}
	@Then("User Select the view name from the view drop down list")
	public void user_Select_the_view_name_from_the_view_drop_down_list() {
		WebElement View = driver.findElement(By.xpath("//select[@id='fcf']"));
		clickObj(View, "View");
		Select dropdown = new Select(driver.findElement(By.id("fcf")));
	    dropdown.selectByIndex(2);
	}

	@Then("User Edit the view")
	public void user_Edit_the_view() throws Throwable {
		WebElement EditLink = driver.findElement(By.linkText("Edit"));
		clickObj(EditLink, "EditLink");
		Thread.sleep(3000);
		WebElement s3 =findElement(By.id("fname"),"ViewName");
		s3.clear();
		enterText(s3, "viewname", "ViewName");
		System.out.println("Viewname entered in the field");
	    WebElement firstcolumn = driver.findElement(By.xpath("//select[@id='fcol1']"));
		clickObj(firstcolumn, "firstcolumn");
	    WebElement fields = driver.findElement(By.xpath("//select[@id='fcol1']"));
		Select accfield = new Select(driver.findElement(By.xpath("//select[@id='fcol1']")));
		accfield.selectByIndex(1);
		WebElement AddfieldsOperator = driver.findElement(By.xpath("//select[@id='fcol1']"));
		Select operator = new Select(driver.findElement(By.xpath("//select[@id='fop1']")));
		operator.selectByIndex(4);
	    WebElement value = driver.findElement(By.id("fval1"));
		value.clear();
		value.sendKeys("ram");
			}

	@Then("User clicks save Button")
	public void user_clicks_save_Button() {
		WebElement save =findElement(By.xpath("//div[@class='pbBottomButtons']//input[@title='Save']"),"save");
		clickObj(save, "save");
	    
	}
	@Then("User select accounts to merge")
	public void user_select_accounts_to_merge() throws Throwable {
		WebElement Mergeacc = findElement(By.xpath("//a[contains(text(),'Merge Accounts')]"),"FindAccounts");
		clickObj(Mergeacc, "Mergeacc");
		WebElement fb = driver.findElement(By.id("srch"));
		fb.clear();
		enterText(fb, "Accountss", "FindAccounts");
		WebElement FindAcc = driver.findElement(By.name("srchbutton"));
		clickObj(FindAcc, "FindAcc");
		
	    WebElement Button1 = driver.findElement(By.xpath("//input[@id='cid0']"));
	    Radiobutton(Button1, "RadioButton");
	    WebElement Button2 = driver.findElement(By.xpath("//input[@id='cid1']"));
	    Radiobutton(Button2, "RadioButton");
        WebElement Button3 = driver.findElement(By.xpath("//input[@id='cid2']"));
        Radiobutton(Button3, "RadioButton");
        Radiobutton(Button3, "RadioButton");
	       
	}

	@Then("User clicks merge button")
	public void user_clicks_merge_button() {
		WebElement Next = driver.findElement(By.xpath("//div[contains(@class,'pbTopButtons')]//input[contains(@title,'Next')]"));
	    Next.click();    
	    WebElement Merge = driver.findElement(By.xpath("//div[@class='pbTopButtons']//input[@title='Merge']"));
	    Merge.click();	    
	    switchtoAlert(driver);	
	   
	}
	@Then("user clicks on accounts with last activity")
	public void user_clicks_on_accounts_with_last_activity() {
		WebElement LastActivity = findElement(By.xpath("//a[contains(text(),'Accounts with last activity > 30 days')]"),"LastActivity");
		clickObj(LastActivity, "LastActivity");
		WebElement  dropdown = driver.findElement(By.xpath("//img[@id='ext-gen148']"));
		clickObj(dropdown, "dropdown");
		WebElement createddate = driver.findElement(By.xpath("//div[contains(text(),'Created Date')]"));
		clickObj(createddate, "createddate");
	}

	@Then("user selects the dates in unsaved report field")
	public void user_selects_the_dates_in_unsaved_report_field() throws Throwable {
		WebElement startdate = findElement(By.name("startDate"),"calenderdata");
		startdate.clear();
		enterText(startdate, "01/04/2019","calenderdata");	
		WebElement enddate = driver.findElement(By.name("endDate"));
		enddate.clear();
		enterText(enddate, "03/04/2019", "calenderdata");
		WebElement save = driver.findElement(By.xpath("//button[@id='ext-gen49']"));
		save.click();
		WebElement Reportnames = findElement(By.name("reportName"),"ChangeReportName");
		Reportnames.clear();
		enterText(Reportnames, "Accountreports", "ChangeReportName");
		WebElement ReportUniName = findElement(By.id("saveReportDlg_DeveloperName"),"ChangeReportUniqueName");
		ReportUniName.clear();
		enterText(ReportUniName, "Accountreports", "ChangeReportUniqueName");
		Thread.sleep(4000);
			
	    
	}

	@Then("user clicks on save report")
	public void user_clicks_on_save_report() {

		WebElement Save = driver.findElement(By.xpath("//table[@id='dlgSaveAndRun']"));
		clickObj(Save, "Save");
	}

	
}
