package com.OrangeHRM.PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.OrangeHRM.Utilities.SeleniumUtility;

public class PIMHomePage extends SeleniumUtility {
	public PIMHomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//div[@class=\"oxd-topbar-body\"]/nav/ul/li[3]/a")
	private WebElement addEmpBtn;
	
	@FindBy(css=".oxd-form-row>div>*:nth-child(2)>div>*:nth-child(2)>input")
	private WebElement empId;
	
	@FindBy(xpath="//div[@class=\"oxd-form-actions\"]/button[2]")
	private WebElement searchBtn;
	
	@FindBy(xpath="(//span[normalize-space()='(1) Record Found'])[1]")
	private WebElement searchResultCountMsg;
	
	@FindBy(xpath="//div[contains(text(),'Full-Time Permanent')]")
	private WebElement empstatus;
	
	@FindBy(css=".oxd-table-body>div:nth-child(1) label")
	private WebElement firstEmpCheckBox;
	
	@FindBy(css=".oxd-table-body>div:nth-child(1) .bi-pencil-fill")
	private WebElement firstEmpEditSymbol;
	
	@FindBy(css=".oxd-table-body>div:nth-child(1) .bi-trash")
	private WebElement firstEmpDeleteSymbol;
	
	@FindBy(css=".orangehrm-modal-footer>button:nth-of-type(2)")
	private WebElement yesButtonOnConfirmationPopup;
	
	@FindBy(xpath="//span[text()='No Records Found']")
	private WebElement recordmsg;
	
	
	
//__________________________________________________________________________________

	public WebElement getRecordmsg() {
		return recordmsg;
	}

	public void setRecordmsg(WebElement recordmsg) {
		this.recordmsg = recordmsg;
	}

	public WebElement getAddEmpBtn() {
		return addEmpBtn;
	}

	public WebElement getEmpstatus() {
		return empstatus;
	}

	public WebElement getEmpId() {
		return empId;
	}

	public WebElement getSearchBtn() {
		return searchBtn;
	}

	public WebElement getSearchResultCountMsg() {
		return searchResultCountMsg;
	}

	public WebElement getFirstEmpCheckBox() {
		return firstEmpCheckBox;
	}

	public WebElement getFirstEmpEditSymbol() {
		return firstEmpEditSymbol;
	}

	public WebElement getFirstEmpDeleteSymbol() {
		return firstEmpDeleteSymbol;
	}

	public WebElement getYesButtonOnConfirmationPopup() {
		return yesButtonOnConfirmationPopup;
	}
	
	
//_____________________________________________________________________
	
	public void AddEmpBtn() {
		clickOnElement(addEmpBtn);
	}
	
	public void SearchEmpId(String EmpId) {
		clickOnElement(empId);
		typeInput(empId, EmpId);
	}
	
	public void SearchButton() {
		clickOnElement(searchBtn);
	}
	
	public String SearchResultMsg() {
		setSleepTime(2000);
		return getTextForElement(searchResultCountMsg);
	}
	
	
	public void EditClick() {
		clickOnElement(firstEmpEditSymbol);
	}
	
	public void DeleteCreateEmp() {
		clickOnElement(firstEmpDeleteSymbol);
		clickOnElement(yesButtonOnConfirmationPopup);
	}
	
	public String EmpStatus() {
		return getTextForElement(empstatus);
	}
	
	public String RecordMsg() {
		return getTextForElement(recordmsg);
	}
	

}

