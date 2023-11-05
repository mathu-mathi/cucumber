package listener;

import org.testng.ITestResult;

import com.aventstack.extentreports.markuputils.MarkupHelper;

import stepdefinitions.BaseTest;

public class Listener extends BaseTest {
	@Override
	public void onTestSuccess(ITestResult result) 
	{
		BaseTest.test.pass(result.getName()+"Test passed");
		BaseTest.test.pass(MarkupHelper.createLabel("pass",ExtentColor.GREEN));
	}
	@Override
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
