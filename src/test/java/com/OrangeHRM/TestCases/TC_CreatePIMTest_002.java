package com.OrangeHRM.TestCases;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.OrangeHRM.PageObjects.AddEmployeePage;
import com.OrangeHRM.PageObjects.HomePage;
import com.OrangeHRM.PageObjects.LoginPage;
import com.OrangeHRM.PageObjects.PIMHomePage;

public class TC_CreatePIMTest_002 extends BaseClass {

	LoginPage getLoginPage;
	HomePage getHomePage;
	PIMHomePage getPimHomePage;
	AddEmployeePage getAddEmployeePage;

	@Test
	public void CreatePIMTest() {

		getLoginPage = new LoginPage(driver);
		getHomePage = new HomePage(driver);
		getPimHomePage = new PIMHomePage(driver);
		getAddEmployeePage = new AddEmployeePage(driver);

// Launch URL...................	
		
		driver.get(BaseURL);
		
// Logged into application.................
		
		getLoginPage.UserName(UName);
		getLoginPage.Password(PassWord);
		getLoginPage.LoginBtn();
		
// Click on PIM & AddEmp button..............
		
		getHomePage.ClickPIM();
		getPimHomePage.AddEmpBtn();
		setSleepTime(2000);
		
// Create Employee Id.................		
		
		getAddEmployeePage.CreateEmp("Dhruv", "Jurel", "5050");
		getAddEmployeePage.EmpID_saveBtn();
		setSleepTime(2000);
		
// Click on PIM Link & Search EmpID....................	
		
		getHomePage.ClickPIM();
		setSleepTime(2000);
		getPimHomePage.SearchEmpId("5050");
		getPimHomePage.SearchButton();
		
// Verify PIM Creation..............................
		
		String SearchResult = getPimHomePage.SearchResultMsg();
		if (SearchResult.equals("(1) Record Found")) {
			Assert.assertTrue(true);
			System.out.println("********* PIM Creation Successfully *********");
		} else {
			takeScreenShot("./ScreenShots/PIMCreate_Failed.png");
			Assert.assertTrue(false);
			System.out.println("********* PIM Creation Failed *********");
		}
		
// Close Browser..................
		
		driver.quit();

	}

}
