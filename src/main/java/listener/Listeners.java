package listener;

import org.testng.ITestResult;

import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;

import stepdefinitions.BaseTest;

public class Listeners extends BaseTest{
	public void onTestSuccess(ITestResult result) 
	{
		BaseTest.test.pass(result.getName()+"Test passed");
		BaseTest.test.pass(MarkupHelper.createLabel("pass",ExtentColor.GREEN));
	}
	public void onTestFailure(ITestResult result)
	{
		BaseTest.test.fail(result.getName()+"Test failed");
		BaseTest.test.pass(MarkupHelper.createLabel("fail",ExtentColor.RED));
		try {
			BaseTest.test.addScreenCaptureFromPath(CommonUtils.getScreenShot(BaseTest.getDriver()));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
