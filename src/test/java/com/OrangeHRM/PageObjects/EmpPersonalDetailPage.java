package com.OrangeHRM.PageObjects;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.OrangeHRM.Utilities.SeleniumUtility;

public class EmpPersonalDetailPage extends SeleniumUtility{
	public EmpPersonalDetailPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(css="div:nth-child(6) a:nth-child(1)")
	private WebElement joblink;
	
	@FindBy(xpath="//div[7]//div[1]//div[2]//div[1]//div[1]//div[2]//i[1]")
	private WebElement empjobstatus;
	
	@FindBy(xpath="//span[normalize-space()='Full-Time Permanent']")
	private WebElement selectjobstatus;
	
	@FindBy(xpath="//button[normalize-space()='Save']")
	private WebElement saveBtn;
	
//_____________________________________________________________________________________
	
	
	public WebElement getSaveBtn() {
		return saveBtn;
	}

	public WebElement getJoblink() {
		return joblink;
	}

	public WebElement getEmpjobstatus() {
		return empjobstatus;
	}

	public WebElement getSelectjobstatus() {
		return selectjobstatus;
	}


//_______________________________________________________________________________________
	
	public void JobLink() {
		clickOnElement(joblink);
	}
	
	public void EmpJobStatus() {
		clickOnElement(empjobstatus);
	}
	
	public void SelectJobStatus() {
		clickOnElement(selectjobstatus);
	}
	
	public void SaveBtn() {
		clickOnElement(saveBtn);
	}

	
}
