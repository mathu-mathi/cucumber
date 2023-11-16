package stepdefinitions;

import java.util.logging.LogManager;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Listeners;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import io.cucumber.core.logging.Logger;
import io.cucumber.java.en.*;

@Listeners(Listener.class)
public class loginSteps extends BaseTest{
	WebDriver driver;
	@Given("User lands on login page")
	public void user_lands_on_login_page() {
		driver=new ChromeDriver();
		driver.get("https://login.salesforce.com");
	   
	}

	@When("User enters valid username and valid password")
	public void user_enters_valid_username_and_valid_password() {
		driver.findElement(By.id("username")).sendKeys("avgsv");
		driver.findElement(By.id("password")).sendKeys("fgftr");
	  
		
	}

	@When("User clicks on login button")
	public void user_clicks_on_login_button() {
		driver.findElement(By.id("login")).click();
	    
	}

	@Then("User should see home page")
	public void user_should_see_home_page() {
		Assert.assertEquals(driver.getTitle().contains("Home"),"home page is visible");
	    
	}

	@When("User enters valid username and in-valid password")
	public void user_enters_valid_username_and_in_valid_password() {
		driver.findElement(By.id("username")).sendKeys("avgsv");
		driver.findElement(By.id("password")).sendKeys("23445");
	   
	}

	@Then("User should see error message")
	public void user_should_see_error_message() {
		 WebElement login = driver.findElement(By.xpath("//*[@id='Login']"));
		    //(login, "login");
		    String actualtext = driver.findElement(By.xpath("//div[@id='error']")).getText();
		    String expectedtext="Please check your username and password. If you still can't log in, contact your Salesforce administrator..";
		    Assert.assertEquals(actualtext,expectedtext);
		   
		//Assert.assertEquals(driver.getTitle().contains("Home"),"home page is visible");
	   
	}

	@When("User enter the username and enter the password and check the remember me checkbox")
	public void user_enter_the_username_and_enter_the_password_and_check_the_remember_me_checkbox() {
		WebElement pwd=driver.findElement(By.xpath("//input[@id='password']"));
		pwd.clear();
		driver.findElement(By.linkText("w0 pr ln3 p16 remember")).click();
		
	}

	@When("User click on loginbutton")
	public void user_click_on_loginbutton() {
		 WebElement login = driver.findElement(By.xpath("//*[@id='Login']"));
		 login.click();
	  
	}

	@Then("User should be see HomePage and click on user menu")
	public void user_should_be_see_home_page_and_click_on_user_menu() {
		WebElement UserMenu = driver.findElement(By.xpath("//*[@id='userNavButton']"));
		UserMenu.click();
	   
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
	    
	}

	@Then("User should see reloginpage")
	public void user_should_see_reloginpage() {
		driver.findElement(By.id("username")).sendKeys("avgsv");
		driver.findElement(By.id("password")).sendKeys("fgftr");
	   
	}

		@Given("user is on login page")
	public void user_is_on_login_page() {
		 WebElement login = driver.findElement(By.xpath("//*[@id='Login']"));
		    login.click();
		
	}






}
