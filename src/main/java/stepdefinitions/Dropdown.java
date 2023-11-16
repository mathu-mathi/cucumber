package stepdefinitions;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Dropdown extends BaseTest {
	@Given("I am on the Salesforce login page")
	public void i_am_on_the_salesforce_login_page() {
		driver=new ChromeDriver();
		driver.get("https://login.salesforce.com");
	  	}

	@When("I provide valid <username> and <password> data")
	public void i_provide_valid_username_and_password_data()
	{
		driver.findElement(By.id("username")).sendKeys("avgsv");
		driver.findElement(By.id("password")).sendKeys("fgftr");
	}

	@When("I click the login button")
	public void i_click_the_login_button() 
	{
		driver.findElement(By.id("login")).click();
	}

	@Then("^User dropdown menu should be displayed$")
	public void User_dropdown_menu_should_be_displayed() {
		WebElement my_prfl = findElement(By.xpath("//a[@title='My Profile']"),"My Profile");
		compareStrings(my_prfl.getText(),"My Profile");
		WebElement my_stngs = findElement(By.xpath("//a[@title='My Settings']"),"My Settings");
		compareStrings(my_stngs.getText(),"My Settings");
		WebElement dev_con = findElement(By.xpath("//a[@title='Developer Console (New Window)']"),"Developer Console");
		compareStrings(dev_con.getText(),"Developer Console");
	     WebElement stle = findElement(By.xpath("//a[@title='Switch to Lightning Experience']"),"Switch to Lightning Experience");compareStrings(stle.getText(),"Switch to Lightning Experience");
		 WebElement logout = findElement(By.xpath("//a[@title='Logout']"),"Logout");
		compareStrings(logout.getText(),"Logout");
		
	}
	
	@Then("User clicks on user profile")
	public void User_clicks_on_user_profile() {
		WebElement UserMenu = findElement(By.xpath("//div[@id='userNav']"),"UserMenu");
		clickObj(UserMenu, "UserMenu");
		WebElement MyProfile = findElement(By.xpath("//a[@title='My Profile']"),"MyProfile");
		clickObj(MyProfile, "MyProfile");
	    	}

	@Then("User clicks one edit profile button")
	public void user_clicks_one_edit_profile_button() {
		WebElement Editprofile =findElement(By.xpath("//a[@class='contactInfoLaunch editLink']//img[@title='Edit Profile']"),"Editlink");
		clickObj(Editprofile, "Editlink");
	
	}

	@Then("User clicks on about Tab")
	public void user_clicks_on_about_Tab() {
		@SuppressWarnings("unused")
		WebElement profileIframe=driver.findElement(By.id("contactInfoContentId"));
		switchFrameid(driver,"contactInfoContentId");
		driver.findElement(By.id("aboutTab")).click();
	}

	@Then("User enters last name")
	public void user_enters_last_name() throws Throwable {
		WebElement lastname=findElement(By.id("lastName"),"lastname");
		lastname.clear();
		enterText(lastname, "seew", "lastname");
		System.out.println("LastName is Entered");
		
	}

	@Then("User clicks on save all Button")
	public void user_clicks_on_save_all_Button() {
		WebElement bodyElement= findElement(By.xpath("//input[@value='Save All']"),"bodyElement");
		clickObj(bodyElement, "bodyElement");
	}
	
	@Then("User clicks on post link")
	public void user_clicks_on_post_link() throws Throwable {
		Thread.sleep(4000);
		WebElement postlink = driver.findElement(By.id("publisherAttachTextPost"));
		clickObj(postlink, "postlink");
	  
	}

	@Then("User enters a text in post area")
	public void user_enters_a_text_in_post_area() throws Throwable {
		WebElement postIframe=driver.findElement(By.xpath("//iframe[contains(@title,'Rich Text Editor, publisherRichTextEditor')]"));
		switchFrame(driver,postIframe);
		driver.switchTo().frame(postIframe);
		WebElement postBody=findElement(By.xpath("//html[1]/body[1]"),"PostText");
		clickObj(postBody, "postBody");
		enterText(postBody,"I am ram","PostText");
		switchdefaultFrame(driver);
	    
	}

	@Then("clicks on share button")
	public void clicks_on_share_button() {
		 WebElement ShareButton = driver.findElement(By.xpath("//input[@id='publishersharebutton']")); 
	     clickObj(ShareButton, "ShareButton");
	}
	
	@Then("User clicks on upload file")
	public void user_clicks_on_upload_file() throws Throwable {
		WebElement file=findElement(By.xpath("//*[@id='publisherAttachContentPost']/span[1]"),"file");
		clickObj(file, "file");
	}

	@Then("User upload a file from system")
	public void user_upload_a_file_from_system() throws Throwable {
		Thread.sleep(5000);
		WebElement upload=findElement(By.xpath("//a[@title='Upload a file from your computer']"),"upload");
		clickObj(upload, "upload");
		Thread.sleep(8000);
		WebElement browse=findElement(By.xpath("//input[@id='chatterFile']"),"browse");
		
	}

	@Then("User clicks on upload button")
	public void user_clicks_on_upload_button() {
		WebElement Share = findElement(By.id("publishersharebutton"),"ShareButton");
        clickObj(Share, "ShareButton");
	   
	}
	@Then("User clicks on upload photo")
	public void user_clicks_on_upload_photo() throws Throwable {
		Actions mousehoover=new Actions(driver);
		mousehoover.moveToElement(driver.findElement(By.xpath("//*[text()='Moderator']"))).perform();
		Thread.sleep(5000);
		WebElement addPhoto=driver.findElement(By.xpath(".//*[@id='uploadLink']"));
		addPhoto.click();
		Thread.sleep(5000);
		WebElement photoframe=driver.findElement(By.id("uploadPhotoContentId"));
		driver.switchTo().frame(photoframe);
		WebElement Photo=driver.findElement(By.xpath(".//*[@id='j_id0:uploadFileForm:uploadInputFile']"));
		Photo.sendKeys("C:\\Users\\rames\\Downloads\\IMG-7085(3).PNG");
		WebElement savePhoto=driver.findElement(By.xpath(".//*[@id='j_id0:uploadFileForm:uploadBtn']"));
		savePhoto.click();
		System.out.println("Image uploded sucessfully");
		Thread.sleep(6000);
		Actions action=new Actions(driver); 
		action.dragAndDropBy(driver.findElement(By.xpath("//div[@class='imgCrop_handle imgCrop_handleNW']")), 100, 20);
		driver.findElement(By.xpath("//input[@id='j_id0:j_id7:save']")).click(); 
		driver.switchTo().defaultContent();
	}
	@And("User clicks on developer console")
	public void User_clicks_on_developer_console() throws Throwable
	{
		WebElement console=driver.findElement(By.xpath("//a[@title='Developer Console (New Window)']"));
		clickObj(console, "dev_console");
}
	@Then("User closes the developer console")
	public void User_closes_the_developer_console() throws Throwable 
	{
		 @SuppressWarnings("unused")
		String oldWindow = driver.getWindowHandle();
		 Set<String> getAllWindows = driver.getWindowHandles();
		 String[] getWindow = getAllWindows.toArray(new String[getAllWindows.size()]);
			Thread.sleep(3000);
			driver.switchTo().window(getWindow[1]).close();;
	}
	
	

}
