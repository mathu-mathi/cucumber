package stepdefinitions;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.en.*;

public class loginSteps {
	WebDriver driver;
	@Given("User lands on login page")
	public void user_lands_on_login_page() {
		driver=new ChromeDriver();
		driver.get("https://login.salesforce.com");
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
	}

	@When("User enters valid username and valid password")
	public void user_enters_valid_username_and_valid_password() {
		driver.findElement(By.id("username")).sendKeys("avgsv");
		driver.findElement(By.id("password")).sendKeys("fgftr");
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		
	}

	@When("User clicks on login button")
	public void user_clicks_on_login_button() {
		driver.findElement(By.id("login")).click();
	    // Write code here that turns the phrase above into concrete actions
	   // throw new io.cucumber.java.PendingException();
	}

	@Then("User should see home page")
	public void user_should_see_home_page() {
		Assert.assertEquals(driver.getTitle().contains("Home"),"home page is visible");
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
	}

	@When("User enters valid username and in-valid password")
	public void user_enters_valid_username_and_in_valid_password() {
		driver.findElement(By.id("username")).sendKeys("avgsv");
		driver.findElement(By.id("password")).sendKeys("23445");
	    // Write code here that turns the phrase above into concrete actions
	   // throw new io.cucumber.java.PendingException();
	}

	@Then("User should see error message")
	public void user_should_see_error_message() {
		 WebElement login = driver.findElement(By.xpath("//*[@id='Login']"));
		    //(login, "login");
		    String actualtext = driver.findElement(By.xpath("//div[@id='error']")).getText();
		    String expectedtext="Please check your username and password. If you still can't log in, contact your Salesforce administrator..";
		    Assert.assertEquals(actualtext,expectedtext);
		   
		//Assert.assertEquals(driver.getTitle().contains("Home"),"home page is visible");
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("User enter the username and enter the password and check the remember me checkbox")
	public void user_enter_the_username_and_enter_the_password_and_check_the_remember_me_checkbox() {
		WebElement pwd=driver.findElement(By.xpath("//input[@id='password']"));
		pwd.clear();
		driver.findElement(By.linkText("w0 pr ln3 p16 remember")).click();
		// Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("User click on loginbutton")
	public void user_click_on_loginbutton() {
		 WebElement login = driver.findElement(By.xpath("//*[@id='Login']"));
		 login.click();
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("User should be see HomePage and click on user menu")
	public void user_should_be_see_home_page_and_click_on_user_menu() {
		WebElement UserMenu = driver.findElement(By.xpath("//*[@id='userNavButton']"));
		UserMenu.click();
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("User select on logout")
	public void user_select_on_logout() throws InterruptedException {
		 WebElement userMenu = driver.findElement(By.id("userNav-arrow"));
         if (userMenu.isDisplayed())
         {
             System.out.println("User menu dropdown is available.");
         }
         else 
         {
             System.out.println("User menu dropdown is not available.");
         }
         userMenu.click();
         Thread.sleep(2000);
         WebElement logout=driver.findElement(By.xpath("//a[@title='Logout']"));
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("User should see reloginpage")
	public void user_should_see_reloginpage() {
		driver.findElement(By.id("username")).sendKeys("avgsv");
		driver.findElement(By.id("password")).sendKeys("fgftr");
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("check the username is displayed")
	public void check_the_username_is_displayed() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Given("user is on login page")
	public void user_is_on_login_page() {
		 WebElement login = driver.findElement(By.xpath("//*[@id='Login']"));
		    login.click();
		// Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("click on forgot password link")
	public void click_on_forgot_password_link() {
		WebElement Fpwd= driver.findElement(By.xpath("//*[@id='forgot_password_link']"));
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("user is on ForgotPasswordPage and enter username to get the mail")
	public void user_is_on_forgot_password_page_and_enter_username_to_get_the_mail() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("click on continue button")
	public void click_on_continue_button() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("user is on {string}")
	public void user_is_on(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("check for ReturnToLogin Button")
	public void check_for_return_to_login_button() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("User enters invalid username and in-valid password")
	public void user_enters_invalid_username_and_in_valid_password() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}
	@When("User enters valid username \"mathu@ram.com\"and valid {string}")
	public void user_enters_valid_username_mathu_ram_com_and_valid(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}





}
