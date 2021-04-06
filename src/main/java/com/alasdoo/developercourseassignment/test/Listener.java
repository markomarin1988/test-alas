package com.alasdoo.developercourseassignment.test;


import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listener extends LaunchAplication implements ITestListener {
	
	
	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println("Faild test");
		failed();
	}

	
	

}
