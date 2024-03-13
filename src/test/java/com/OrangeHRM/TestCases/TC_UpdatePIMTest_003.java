package com.OrangeHRM.TestCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.OrangeHRM.PageObjects.AddEmployeePage;
import com.OrangeHRM.PageObjects.EmpPersonalDetailPage;
import com.OrangeHRM.PageObjects.HomePage;
import com.OrangeHRM.PageObjects.LoginPage;
import com.OrangeHRM.PageObjects.PIMHomePage;



public class TC_UpdatePIMTest_003 extends BaseClass{

	LoginPage getLoginPage;
	HomePage getHomePage;
	PIMHomePage getPimHomePage;
	AddEmployeePage getAddEmployeePage;
	EmpPersonalDetailPage getEmpPersonalDetailPage;
	
	
	@Test
	public void UpdatePIMTest_003() {
		
		getLoginPage = new LoginPage(driver);
		getHomePage = new HomePage(driver);
		getPimHomePage = new PIMHomePage(driver);
		getAddEmployeePage = new AddEmployeePage(driver);
		getEmpPersonalDetailPage = new EmpPersonalDetailPage(driver);
		
// Launch URL.........................
		
		driver.get(BaseURL);
	
// Logged into application...............
		
		getLoginPage.UserName(UName);
		getLoginPage.Password(PassWord);
		getLoginPage.LoginBtn();
		
// Click PIM Link & Search EmpId...............
		
		getHomePage.ClickPIM();
		getPimHomePage.SearchEmpId("5050");
		getPimHomePage.SearchButton();
		
// Click on Edit & Update Job Employment Status...............		
		
		getPimHomePage.EditClick();

		getEmpPersonalDetailPage.JobLink();
		setSleepTime(2000);
		getEmpPersonalDetailPage.EmpJobStatus();
		getEmpPersonalDetailPage.SelectJobStatus();
		setSleepTime(1000);
		getEmpPersonalDetailPage.SaveBtn();
		setSleepTime(5000);
		
// Click on PIM Link & Search EmpID..........
		
		getHomePage.ClickPIM();
		getPimHomePage.SearchEmpId("5050");
		getPimHomePage.SearchButton();
		
// Verify PIM Updation.........................
		
		String UpdatedJobTitle = getPimHomePage.EmpStatus();
		if(UpdatedJobTitle.equals("Full-Time Permanent")) {
			Assert.assertTrue(true);
			System.out.println("********* PIM Updation Successfully *********");
		}else {
			takeScreenShot("./ScreenShots/UpdatePIM_Failed.png");
			Assert.assertTrue(false);
			System.out.println("********* PIM Updation Failed *********");
		}
		
// Close Browser...............
		
		driver.quit();
	}
	
}
