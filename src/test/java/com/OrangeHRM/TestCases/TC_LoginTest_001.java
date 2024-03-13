package com.OrangeHRM.TestCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.devtools.v115.css.CSS.TakeCoverageDeltaResponse;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.OrangeHRM.PageObjects.LoginPage;

public class TC_LoginTest_001 extends BaseClass{
	
	LoginPage getLoginPage;
	
	@Test
	public void LoginTest() {
		
		getLoginPage = new LoginPage(driver);
	
//  Launch Application URL .............
		
		driver.get(BaseURL);
		
//  Enter Valid Credentials .............
		
		getLoginPage.UserName(UName);
		getLoginPage.Password(PassWord);
		getLoginPage.LoginBtn();
		
// Verify Login Functionality.................
		
		if(driver.getCurrentUrl().contains("dashboard")) {
			Assert.assertTrue(true);
			System.out.println("********* Login Test Is Passed  *********");
		}else {
			takeScreenShot("./ScreenShots/LoginFailed.png");
			Assert.assertTrue(false);
			System.err.println("*********  Login Test Is Failed  *********");
		}
		
// Close Browser.................
		
		driver.quit();
	}
	

}
