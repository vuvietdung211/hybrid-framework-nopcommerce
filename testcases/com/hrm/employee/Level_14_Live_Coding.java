package com.hrm.employee;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import commons.BaseTest;


public class  Level_14_Live_Coding extends BaseTest{
	@Parameters({"browser" , "url"})
	@BeforeClass
	public void beforeClass(String browserName, String appUrl) {
		log.info("Pre-Condition - STEP 01: Open browser '" + browserName + "' and  navigate to '" + appUrl + "' ");
		driver = getBrowserDriver(browserName, appUrl);
		loginPage = com.hrm.employee.PageGeneratorManager.getLoginPagePage(driver);
		
		log.info("Pre-Condition - STEP 01: Log in with usernam = " + adminUserName + "and password = " + adminPassword);
		loginPage.loginToSytem(driver, "Admin", "admin123");
		dashBoardPage = com.hrm.employee.PageGeneratorManager.getDashBoardPage(driver);
	}

	@Test
	public void Employee_01_Add_New_Employee() {
		log.info("Add_New_01_Step_01:Open Employee List Page ");
		dashBoardPage.openChildSubMenuByPageName(driver, adminPassword, adminUserName, adminPassword);
	
	
	
	}
	
	
	
	
	
	@AfterClass
	public void afterClass() {
		log.info("Post-Condition - STEP 01: Close browser");
		driver.quit();
	}
	private WebDriver driver;

	LoginPO loginPage;
	PersonalDetail personalDetailPage;
	EmployeeList employeeListPage;
	DashBoardPO dashBoardPage;
	String adminUserName = "Admin";
	String adminPassword = "admin123";
}
