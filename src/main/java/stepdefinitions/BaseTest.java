package stepdefinitions;

import java.io.IOException;
import java.util.logging.LogManager;

import org.testng.annotations.BeforeMethod;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import io.cucumber.core.logging.Logger;

public class BaseTest {
	static ExtentReports extent=new ExtentReports();
	static ExtentSparkReporter spark=null;
	public static ExtentTest test=null;
	public static Logger logger= LogManager.getLogger("BASETEST");
	private static String getBrowserType;
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
	public static Object getDriver() {
		// TODO Auto-generated method stub
		return null;
	}
}
