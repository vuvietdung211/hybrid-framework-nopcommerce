package com.hrm.employee;

import org.openqa.selenium.WebDriver;

import commons.BasePage;
import pageObject.nopCommerce.portal.PageGeneratorManager;
import pageUI.nopCommerce.admin.LoginPageUI;

public class EmployeeList extends BasePage{
	WebDriver driver;

	public EmployeeList(WebDriver driver) {
		this.driver = driver;
	}
	
		
}
