package stepdefinitions;

import java.io.IOException;
import java.lang.reflect.Method;
import java.util.logging.LogManager;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import io.cucumber.core.logging.Logger;

public class BaseTest {
	static WebDriver driver;
	static ExtentReports extent=new ExtentReports();
	static ExtentSparkReporter spark=null;
	public static ExtentTest test=null;
	public static Logger logger= (Logger) LogManager.getLogger("BASETEST");
	private static String getBrowserType;
	@Test
	@BeforeMethod
	public void setup(Method name) throws IOException
	{
		BaseTest.test=extent.createTest(name.getName());
		logger.info("BaseTest:setup:"+name.getName()+"Test object is reporting");
		WebDriver driver=BaseTest.getDriver();
		
	}
    @AfterMethod
	public void teardown(Method name)
	{
	logger.info("BaseTest:teardown:"+name.getName()+"Tear down");
	}
	@Parameters({"browserName","isHeadless"})
	@BeforeTest
	public static void setDriver(String browserName,boolean isHeadless) {
		spark=new ExtentSparkReporter(new File(FileConstant.REPORT_PATH));
		extent.attachReporter(spark);
		logger.info("BaseTest:setDriver:Spark report configured");
		WebDriver driver = BaseTest.getBrowserType("browserName", isHeadless);
	}
	
		public static WebElement findElement(By location,String objName) {
			WebElement obj = null;
			try {
				obj = driver.findElement(location);
				System.out.println(" Found on the page");
				
			}
			catch(NoSuchElementException errMessage) {
				System.out.println(" not found on the page");
				
			
			}
			return obj;
		}
		
		
		public static void enterText(WebElement obj,String textval,String objName) throws InterruptedException

		{
			if(obj.isDisplayed())
			{
				Thread.sleep(4000);
				obj.sendKeys(textval);
				System.out.println("value is entered in field");
			
				
			}
			else
			{
				System.out.println("field does not exist please check application");
				
			}
		}
		
		public static void clickObj(WebElement obj,String objName)
		{
			if(obj.isDisplayed())
			{
				obj.click();
				System.out.println("button is clicked");
				
			}
			else
			{
				System.out.println("button is not displayed ,please check the application");
				
			}
		}
		 public static void compareStrings(String S1, String S2)
		 {
			  Assert.assertEquals(S1, S2); 
			}
		

		public static void selectCheckBox(WebElement obj, String objName) {
			
			if(obj.isDisplayed()) {
				
				if(obj.isSelected()) {
					System.out.println(" is already selected");
				}else{
				obj.click();
				System.out.println(" is selected");
			    }
				}
				else
{
				System.out.println(" is not present.Please chk application");	
				
			}	
		}
		
		
		public static void selectDropdown(WebElement obj, String objName) {
			
			if(obj.isDisplayed()) {
					
					if(obj.isSelected()) {
						System.out.println(" is already selected");
					}else
					{
					obj.click();
					System.out.println(" is selected");
					
				    }}
			
					else 
					{
					System.out.println(" is not present.Please chk application");	
					
						
				}	
				
			}
		
		
		
		public static void validateErrormsg(String actualmsg, String errormsg) {
			
			if(actualmsg.equals(errormsg))
			{
				System.out.println("TestCase is passed");
			}else
		    {
			System.out.println("TestCase is failed");
		    }
		}

	
	public static void switchFrame( WebDriver driver,WebElement obj) {
		 
	    if(obj.isDisplayed()) {
	     driver.switchTo().frame(obj);
	     System.out.println("we can switch to the frame");
	   
	     
	    }else {
	     System.out.println("we can't switch to the");
	    
	    }
	}

	

	public static void switchFrameid( WebDriver driver,String obj)
	{
		 
	     driver.switchTo().frame(obj);
	   
	     
	    }
       
public static void switchdefaultFrame( WebDriver driver)
	{
	driver.switchTo().defaultContent();
	
	}

	public static void mouseOver(WebDriver driver,WebElement obj)
	{
		if(obj.isDisplayed()) {
	   Actions action=new Actions(driver);
	   action.moveToElement(obj).build().perform();
		System.out.println(" is present");
		}
	 else {
			System.out.println(" is not present.Please chk application");
		}
	}

		public static void SelectbyText(WebElement we, String VisibleText){
		   if(we.isDisplayed())
		   {
			   Select selObj=new Select(we);
	           selObj.selectByVisibleText(VisibleText);
		           System.out.println(" is Selected by VisibleText" );
		           
		   } 
		   else
		   {
		    System.out.println(" is not available");
		
		    
		   }
		   
		   
	}

	
	public static void SelectByValue(WebElement obj, String val) 
	{
		if(obj.isDisplayed())
		{
		   Select selObj=new Select(obj);
		    
		   selObj.selectByValue(val);
		  System.out.println( " is selected from drop down ");
		 
		  }else 
		  {
		   System.out.println("is not selected");
		
		 }	
		
	}
	

      	public static void selectByIndex(WebElement obj, int index) {
		  if(obj.isDisplayed()) 
		  {
		   Select selObj=new Select(obj);
		  selObj.selectByIndex(index);
		  
		  System.out.println(" is selected from drop down ");
		  }else 
		  {
		   System.out.println("is not selected");
		  }
		 }

	public static void selectByVisibleText(WebElement obj, String Name) {
		if(obj.isDisplayed()) 
		{
			 Select drop = new Select(obj);
			 drop.selectByVisibleText(Name);
		 System.out.println("Pass: dropdown is selected");
		 }else 
		 {
		 System.out.println("Fail: dropdown is not available check your application");
		 }
		 
	public static void Radiobutton(WebElement obj, String objName)
	{
		
		if(obj.isDisplayed() ){
			obj.click();
			System.out.println(" is clicked");
		}
		else
		{
			System.out.println("is not displayed .Please check your application");			
		}
	}

	public static void switchtoAlert(WebDriver driver) 
	{
		 driver.switchTo().alert().accept();
		 System.out.println("Pass: alert is present and accept");
	}

		
	
}
