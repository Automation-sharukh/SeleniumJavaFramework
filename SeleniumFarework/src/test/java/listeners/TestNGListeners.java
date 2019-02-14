package listeners;

import org.testng.ITest;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class TestNGListeners implements ITestListener
{  

	@Override
	public void onFinish(ITestContext context) {
		System.out.println("*****Test Completed :"+context.getName());
		
	}

	@Override
	public void onStart(ITestContext arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTestFailure(ITestResult arg0) {
		System.out.println("*****Test Fail :"+arg0.getName());
		
	}

	@Override
	public void onTestSkipped(ITestResult arg0) {
		System.out.println("*****Test Skipped :"+arg0.getName());
		
		
		}

	@Override
	public void onTestStart(ITestResult arg0) {
		System.out.println("*****Test Started :"+arg0.getName());
		
	}

	@Override
	public void onTestSuccess(ITestResult arg0) {
		System.out.println("*****Test Successful :"+arg0.getName());
		
	}

}
