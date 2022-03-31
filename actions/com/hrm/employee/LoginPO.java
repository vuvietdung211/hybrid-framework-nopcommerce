package com.hrm.employee;

import org.openqa.selenium.WebDriver;

import commons.BasePage;
import pageUI.hrm.LoginPageUI;

public class LoginPO extends BasePage{
	WebDriver driver;

	public LoginPO(WebDriver driver) {
		this.driver = driver;
	}

	public void loginToSytem(WebDriver driver, String userName, String password) {
		waitForElementVisible(driver, LoginPageUI.USER_NAME_TEXTBOX);
		sendkeyToElement(driver, LoginPageUI.USER_NAME_TEXTBOX, userName);
		
		waitForElementVisible(driver, LoginPageUI.PASSWORD_TEXTBOX);
		sendkeyToElement(driver, LoginPageUI.PASSWORD_TEXTBOX, password);
		
	}

		
}
