package com.OrangeHRM.TestCases;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import com.OrangeHRM.TestData.ReadConfig;
import com.OrangeHRM.Utilities.SeleniumUtility;

public class BaseClass extends SeleniumUtility{
	
	ReadConfig  RC = new ReadConfig();
	
	public String BaseURL = RC.GetAppUrl();
	public String UName = RC.GetUserName();
	public String PassWord = RC.GetPassword();
	public static WebDriver driver;
	
	public static Logger logger;
	
	@BeforeClass
	public void SetuUp() {
		driver = setUp("Chrome", BaseURL);
		
		
	}
	
	@AfterClass
	public void TearDown() {
		driver.quit();
	}

}
