package tests.listeners;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class CustomListener implements ITestListener {

	public void onFinish(ITestContext arg0) {
		System.out.println("onFinish()");
	}

	public void onStart(ITestContext arg0) {
		System.out.println("onStart()");
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult arg0) {
		System.out.println("onTestFailedButWithinSuccessPercentage()");
	}

	public void onTestFailure(ITestResult arg0) {
		// System.out.println("testName : " + arg0.getTestName());

		System.out.println("Test case name: " + arg0.getName());
		System.out.println("onTestFailure()");
	}

	public void onTestSkipped(ITestResult arg0) {
		System.out.println("onTestSkipped()");
	}

	public void onTestStart(ITestResult arg0) {
		System.out.println("onTestStart()");
	}

	public void onTestSuccess(ITestResult arg0) {
		System.out.println("onTestSuccess()");
	}

}
