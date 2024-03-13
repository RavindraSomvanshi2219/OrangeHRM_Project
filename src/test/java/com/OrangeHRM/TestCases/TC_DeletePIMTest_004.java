package com.OrangeHRM.TestCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.OrangeHRM.PageObjects.HomePage;
import com.OrangeHRM.PageObjects.LoginPage;
import com.OrangeHRM.PageObjects.PIMHomePage;

public class TC_DeletePIMTest_004 extends BaseClass{

	LoginPage getLoginPage;
	HomePage getHomePage;
	PIMHomePage getPimHomePage;
	
	@Test
	public void DeletePIMTest() {
		
		getLoginPage = new LoginPage(driver);
		getHomePage = new HomePage(driver);
		getPimHomePage = new PIMHomePage(driver);
		
// Launch URL...............
		
		driver.get(BaseURL);
		
// Logged into application................
		
		getLoginPage.UserName(UName);
		getLoginPage.Password(PassWord);
		getLoginPage.LoginBtn();
		
// Click on PIM Link & Search EmpId............
		
		getHomePage.ClickPIM();
		getPimHomePage.SearchEmpId("5050");
		getPimHomePage.SearchButton();
		
// Delete Created PIM.........................
		
		getPimHomePage.DeleteCreateEmp();
		setSleepTime(2000);

// Click on PIM Link & Search EmpId............
		
		getHomePage.ClickPIM();
		setSleepTime(3000);
		getPimHomePage.SearchEmpId("5050");
		getPimHomePage.SearchButton();
		
		
// Verify PIM Deletion................................
		
		String RecordMsg = getPimHomePage.RecordMsg();
		if(RecordMsg.equals("No Records Found")) {
			Assert.assertTrue(true);
			System.out.println("********* PIM Deletion Successfully *********");
		}else {
			takeScreenShot("./ScreenShot/DeletePIM_Failed.png");
			Assert.assertTrue(false);
			System.out.println("********* PIM Deletion Failed *********");
		}
		
// CLose Browser.............
		
		driver.quit();
	}
}
