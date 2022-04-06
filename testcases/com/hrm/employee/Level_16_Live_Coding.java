package com.hrm.employee;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import commons.BaseTest;
import pageObject.hrm.employee.AddEmployeeListPO;
import pageObject.hrm.employee.DashBoardPO;
import pageObject.hrm.employee.LoginPO;
import pageObject.hrm.employee.PageGeneratorManager;
import pageObject.hrm.employee.PersonalDetailPO;


public class  Level_16_Live_Coding extends BaseTest{
	@Parameters({"browser" , "url"})
	@BeforeClass
	public void beforeClass(String browserName, String appUrl) {
		log.info("Pre-Condition - STEP 01: Open browser '" + browserName + "' and  navigate to '" + appUrl + "' ");
		driver = getBrowserDriver(browserName, appUrl);
		loginPage = PageGeneratorManager.getLoginPagePage(driver);
		
		log.info("Pre-Condition - STEP 02: Log in with usernam = " + adminUserName + "and password = " + adminPassword);
		loginPage.enterToTextboxByID(driver, "Admin", "txtUsername");
		loginPage.enterToTextboxByID(driver, "admin123", "txtPassword");
		loginPage.clickToButtonByID(driver, "btnLogin");
		dashBoardPage = PageGeneratorManager.getDashBoardPage(driver);
	}

	@Test
	public void Employee_01_Add_New_Employee() {
		log.info("Add_New_01_Step_01:Open Employee List Page ");
		dashBoardPage.openSubMenuPage(driver, "PIM", "Employee List" );
		addEmployeeListPage = PageGeneratorManager.getAddEmployeeListPage(driver);
		
		log.info("Add_New_01 - Step_02:Click to 'Add' button");
		addEmployeeListPage.clickToButtonByID(driver, "btnAdd");
		
		log.info("Add_New_01 - Step_03:Input valid value to 'First Name' textbox");
		addEmployeeListPage.enterToTextboxByID(driver,"autotest","firstName");
		
		log.info("Add_New_01 - Step_04:Input valid value to 'Last Name' textbox");
		addEmployeeListPage.enterToTextboxByID(driver,"AFC","lastName");
		
		log.info("Add_New_01 - Step_05:Get value of 'Employee ID' ");
		addEmployeeListPage.getValueTextboxByID(driver, "value","employeeId");
		
		log.info("Add_New_01 - Step_06:Click to 'Create Login Details' checkbox");
		addEmployeeListPage.checkToCheckBoxByLabel(driver, "Create Login Details");
		
		log.info("Add_New_01 - Step 07: Enter valid info to 'User Name' textbox");
		addEmployeeListPage.enterToTextboxByID(driver,"dung","user_name");
		
		log.info("Add_New_01 Step 08: Enter valid info to 'Password' textbox");
		addEmployeeListPage.enterToTextboxByID(driver,"123456","user_password");
		
		log.info("Add_New_01 - Step 09: Enter valid info to 'Confirm Password' textbox");
		addEmployeeListPage.enterToTextboxByID(driver,"123456","re_password");
		
		log.info("Add_New_01 Step 10: Select 'Enabled' value in 'Status' dropdown");
		addEmployeeListPage.selectDropdownByID(driver,"Enabled","status");
		
		log.info("Add_New_01 - Step 11: Click to 'Save' button");
		addEmployeeListPage.clickToButtonByID(driver, "btnSave");
		personalDetailPage = PageGeneratorManager.getPersonalDetailPage(driver);
		
		log.info("Add_New_01 - Step 12: Open 'Employee List' page");
		personalDetailPage.openSubMenuPage(driver, "PIM", "Employee List" );
		addEmployeeListPage = PageGeneratorManager.getAddEmployeeListPage(driver);
		
		log.info("Add_New_01 - Step 13: Enter valid info to 'Employee Name' textbox");
		addEmployeeListPage.enterToTextboxByID(driver,"dung","empsearch_employee_name_empName");
		
		log.info("Add_New_01 - Step 14: Click to 'Search' button");
		addEmployeeListPage.clickToButtonByID(driver, "searchBtn");
		
		log.info("Add_New_01 - Step 15: Verify Employee Infomation displayed at 'Result Table'");
		addEmployeeListPage.isEmployeeInfoDisplayedAtTable("", "", "");
	}
	
	
	
	
	
	@AfterClass
	public void afterClass() {
		log.info("Post-Condition - STEP 01: Close browser");
		driver.quit();
	}
	private WebDriver driver;

	LoginPO loginPage;
	PersonalDetailPO personalDetailPage;
	AddEmployeeListPO addEmployeeListPage;
	DashBoardPO dashBoardPage;
	String adminUserName = "Admin";
	String adminPassword = "admin123";
}
