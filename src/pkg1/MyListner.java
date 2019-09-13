package pkg1;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class MyListner implements ITestListener {

	@Override
	public void onFinish(ITestContext arg0) {
	System.out.println("onfinish");
		
	}

	@Override
	public void onStart(ITestContext arg0) {
		System.out.println("onstart");

		
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult arg0) {
		// TODO Auto-generated method stub
		System.out.println("onTestFailedButWithinSuccessPercentage");

	}

	@Override
	public void onTestFailure(ITestResult arg0) {
		// TODO Auto-generated method stub
	System.out.println("onTestFailure");
	}

	@Override
	public void onTestSkipped(ITestResult arg0) {
		// TODO Auto-generated method stub
		System.out.println("onTestSkipped");
	}

	@Override
	public void onTestStart(ITestResult arg0) {
		// TODO Auto-generated method stub
		System.out.println("onTestStart");

	}

	@Override
	public void onTestSuccess(ITestResult arg0) {
		// TODO Auto-generated method stub
		System.out.println("onTestSuccess");

	}
	
	

}
