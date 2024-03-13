package com.OrangeHRM.PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.OrangeHRM.Utilities.SeleniumUtility;

public class LoginPage extends SeleniumUtility {
	
	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//input[@name='username']")
	private WebElement usernameField;
	
	@FindBy(xpath="//input[@name='password']")
	private WebElement passwordFiled;
	
	@FindBy(className="orangehrm-login-button")
	private WebElement loginBtn;
	
// ******************************************************

	public WebElement getUsernameField() {
		return usernameField;
	}

	public WebElement getPasswordFiled() {
		return passwordFiled;
	}

	public WebElement getLoginBtn() {
		return loginBtn;
	}
	
// ******************************************************
	
	public void UserName(String Username) {
		typeInput(usernameField, Username);
	}
	
	public void Password(String pwd) {
		typeInput(passwordFiled, pwd);
	}
	
	public void LoginBtn() {
		clickOnElement(loginBtn);
	}
	
	public void LogIntoApplication(String Username, String Password) {
		typeInput(usernameField, Username);
		typeInput(passwordFiled, Password);
		clickOnElement(loginBtn);
	}
	
	
	

}
