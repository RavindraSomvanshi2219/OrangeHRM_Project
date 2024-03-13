package com.OrangeHRM.PageObjects;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.OrangeHRM.Utilities.SeleniumUtility;

public class AddEmployeePage extends SeleniumUtility{
	public AddEmployeePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//input[@name=\"firstName\"]")
	private WebElement firstNameField;
	
	@FindBy(xpath="//input[@name=\"lastName\"]")
	private WebElement lastNameField;
	
	@FindBy(xpath="//div[@class=\"oxd-grid-2 orangehrm-full-width-grid\"]/div/div/div[2]/input")
	private WebElement empIdField;
	
	@FindBy(xpath="//div[@class=\"oxd-form-actions\"]/button[2]")
	private WebElement EmpId_saveBtn;
	
//___________________________________________________________________________________________

	public WebElement getFirstNameField() {
		return firstNameField;
	}

	public WebElement getLastNameField() {
		return lastNameField;
	}

	public WebElement getEmpIdField() {
		return empIdField;
	}

	public WebElement getEmpId_saveBtn() {
		return EmpId_saveBtn;
	}
	
//__________________________________________________________________________________________________
	
	public void CreateEmp(String FirstName, String LastName, String EmpId) {
		clickOnElement(firstNameField);
		typeInput(firstNameField, FirstName);
		
		clickOnElement(lastNameField);
		typeInput(lastNameField, LastName);
		
		lastNameField.sendKeys(Keys.TAB,Keys.BACK_SPACE);
		typeInput(empIdField, EmpId);
			
	}
	public void EmpID_saveBtn() {
		clickOnElement(EmpId_saveBtn);
	}

}
