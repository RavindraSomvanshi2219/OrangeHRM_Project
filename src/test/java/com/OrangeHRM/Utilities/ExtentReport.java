package com.OrangeHRM.Utilities;



import org.testng.Assert;
import org.testng.ITestNGListener;
import org.testng.ITestResult;
import org.testng.SkipException;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

import com.relevantcodes.extentreports.LogStatus;

public class ExtentReport implements ITestNGListener {
	
	
	ExtentReports Report;
	ExtentTest test;
	
	
	@BeforeTest
	public void StartReport() {
		Report = new ExtentReports("/Banking_Project/ExtentReports/LoginTest.html");
		Report.addSystemInfo("Host Name", "Guru99");
		Report.addSystemInfo("Environment", "Tester");
		Report.addSystemInfo("User Name", "Ravindra Somvanshi");
	}
	
	@AfterMethod
	public void getResult(ITestResult result) {
	    test = Report.startTest(result.getName()); // Initialize the test object

	    if(result.getStatus() == ITestResult.FAILURE) {
	        test.log(LogStatus.FAIL, "Test Case Failed is "+result.getName());
	        test.log(LogStatus.FAIL, "Test Case Failed due to "+result.getThrowable());
	    } else if(result.getStatus() == ITestResult.SKIP) {
	        test.log(LogStatus.SKIP, "Test Case Skipped due to "+result.getName());	
	    }

	    // ending test
	    // endTest(logger) : It ends the current test and prepares to create HTML report
	    Report.endTest(test);	
	}


	@AfterTest
	public void endReport(){
		        Report.flush();
                Report.close();
    }

}
