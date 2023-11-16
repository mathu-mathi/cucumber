package stepdefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Opportunities extends BaseTest{
	@When("I click on the {string} link on the home page")
	public void i_click_on_the_link_on_the_home_page(String string)
    {
		Thread.sleep(3000);
		WebDriverWait wait=new WebDriverWait(driver,20);
		WebElement usermenu=wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id='userNavButton']")));
		usermenu.click();
	}

	@Then("the Accounts page is displayed with correct <username>")
	public void the_accounts_page_is_displayed_with_correct_username() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}
	@Then("User Cicks on on opportunities link$")
	public void user_Cicks_on_on_opportunities_link() throws Throwable {
		WebElement Opportunities = driver.findElement(By.xpath("//li[@id='Opportunity_Tab']"));
		clickObj(Opportunities, "Opportunities");
	}

	@Then("User clicks on the New button to create new Opty$")
	public void user_clicks_on_the_New_button_to_create_new_Opty() throws Throwable 
	{
		driver.findElement(By.xpath("//a[contains(@title,'Opportunities Tab')]")).click();
		driver.findElement(By.xpath("//input[@title='New']")).click();
	}

	@Then("User Enters the Necessery fields$")
	public void user_Enters_the_Necessery_fields() throws Throwable 
	{
		WebElement oppName= driver.findElement(By.xpath("//input[@id='opp3']"));
		oppName.sendKeys("abcd");
		WebElement oppAccountName =driver.findElement(By.xpath("//input[@id='opp4']"));
		oppAccountName.sendKeys("tsc");
		driver.findElement(By.xpath("//input[@id='opp9']")).click();
		driver.findElement((By.xpath("//a[@class='calToday']"))).click();
		driver.findElement(By.xpath("//select[@id='opp11']"));
		Select dropdown1 = new Select(driver.findElement(By.xpath("//select[@id='opp11']")));
		dropdown1.selectByIndex(2);
		driver.findElement(By.xpath("//select[@id='opp6']"));
		Select dropdown2 = new Select(driver.findElement(By.xpath("//select[@id='opp6']")));
		dropdown2.selectByIndex(5);
		
	}
     @Then("User clicks on new Opty save Button$")
	public void user_clicks_on_new_Opty_save_Button() throws Throwable 
     {
   
    driver.findElement(By.xpath("//td[@id='bottomButtonRow']//input[@title='Save']")).click();
     }
     @Then("User Click on Opportunity Pipeline link$")
     public void user_Click_on_Opportunity_Pipeline_link() throws Throwable 
     {
    	 driver.findElement(By.xpath("//a[contains(text(),'Opportunity Pipeline')]")).click();
     }
     
     @Then("^User Click on Stuck Opportunities link$")
     public void user_Click_on_Stuck_Opportunities_link() throws Throwable
     {
    	 driver.findElement(By.xpath("//a[contains(text(),'Stuck Opportunities')]")).click();
     }
     
     @Then("User Click on Quarterly Summary link$")
     public void user_Click_on_Quarterly_Summary_link() throws Throwable {
    	driver.findElement(By.xpath("//select[@id='quarter_q']"));
 		Select dropdown2 = new Select(driver.findElement(By.xpath("//select[@id='quarter_q']")));
 		dropdown2.selectByIndex(3);
 	    driver.findElement(By.xpath("//select[@id='open']"));
 		Select dropdown3 = new Select(driver.findElement(By.xpath("//select[@id='open']")));
 		dropdown3.selectByIndex(1);
 		driver.findElement(By.xpath("//input[contains(@title,'Run Report')]")).click();
}
}

    