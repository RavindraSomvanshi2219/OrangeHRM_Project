package com.OrangeHRM.PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.OrangeHRM.Utilities.SeleniumUtility;

public class HomePage extends SeleniumUtility {
	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//div[@class=\"oxd-sidepanel-body\"]/ul/li[2]/a/span")
	private WebElement pimLink;
	
	@FindBy(xpath="//li[@class=\"oxd-userdropdown\"]/span/p")
	private WebElement profileLink;
	
	@FindBy(xpath="//ul[@class=\"oxd-dropdown-menu\"]/li[4]/a")
	private WebElement logOutLink;

//___________________________________________________________________________________
	
	public WebElement getPimLink() {
		return pimLink;
	}

	public WebElement getProfileLink() {
		return profileLink;
	}

	public WebElement getLogOutLink() {
		return logOutLink;
	}
//__________________________________________________________________________________
	
	public void ClickPIM() {
		clickOnElement(pimLink);
	}
	
	public void ClickProfile() {
		clickOnElement(profileLink);
	}
	
	public void ClickLogOut() {
		clickOnElement(logOutLink);
	}
	
	public void CloseBrowser() {
		clickOnElement(profileLink);
		clickOnElement(logOutLink);
	}
	}
