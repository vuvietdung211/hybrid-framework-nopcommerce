package com.hrm.employee;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import commons.BaseTest;
import pageObject.hrm.DashboardPO;
import pageObject.hrm.EmployeeListPO;
import pageObject.hrm.LoginPO;
import pageObject.hrm.PersonalDetailPO;

public class  Level_16_Live_Coding extends BaseTest{
	@Parameters({"browser" , "url"})
	@BeforeClass
	public void beforeClass(String browserName, String appUrl) {
		log.info("Pre-Condition - STEP 01: Open browser '" + browserName + "' and  navigate to '" + appUrl + "' ");
		driver = getBrowserDriver(browserName, appUrl);
		
		
	}
	@Test
	public void Employee_01_Add_New_Employee() {
		log.info("Add_New_01 - Step 01: Open 'Employee List' page");
		
		
		log.info("Add_New_01 - Step 02: Click to 'Add' button");
		
		
		log.info("Add_New_01 - Step 02: Input valid value to 'First Name' textbox");
		
		
		log.info("Add_New_01 - Step 02: Input valid value to 'Last Name' textbox");
		
		
		log.info("Add_New_01: Step 05: Get value of 'Employee ID'");
		
		
		log.info("Add_New_01: Step 06: Click to 'Create Login Detail' check box");
		
		
		log.info("Add_New_01: Open 'Employee List' page");
		
		
		log.info("Add_New_01: Open 'Employee List' page");
		
		
		log.info("Add_New_01: Open 'Employee List' page");
		
		
		log.info("Add_New_01: Open 'Employee List' page");
		
	}
	
	@Test
	public void User_02_Login() {
		
	}
	

	@AfterClass
	public void afterClass() {
		log.info("Post-Condition - STEP 01: Close browser");
		driver.quit();
	}
	private WebDriver driver;
	private LoginPO loginPage;
	private DashboardPO dashboardPage;
	private EmployeeListPO employeeListPage;
	private PersonalDetailPO personalDetailPage;


}
