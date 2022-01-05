package com.testng1;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListenersUnimplement implements ITestListener{

	public void onTestStart(ITestResult result) {
System.out.println("Test case is going to run");		
	}

	public void onTestSuccess(ITestResult result) {
System.out.println("Test case is success");		
	}

	public void onTestFailure(ITestResult result) {
		System.out.println("Test case is failure");		
	}

	public void onTestSkipped(ITestResult result) {
		System.out.println("Test case is skipped");		
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		System.out.println("Test case is failed with success percentage");		
	}

	public void onStart(ITestContext context) {
		System.out.println("before everything");		
	}

	public void onFinish(ITestContext context) {
		System.out.println("after everything");		
	}

}
