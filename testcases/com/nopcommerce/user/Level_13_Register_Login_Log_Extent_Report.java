package com.nopcommerce.user;

import java.lang.reflect.Method;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import commons.BaseTest;
import pageObject.nopCommerce.portal.PageGeneratorManager;
import pageObject.nopCommerce.portal.UserHomePageObject;
import pageObject.nopCommerce.portal.UserLogInPageObject;
import pageObject.nopCommerce.portal.UserRegisterPageObject;
import reportConfig.ExtentTestManager;


public class  Level_13_Register_Login_Log_Extent_Report extends BaseTest{
	@Parameters({"browser" , "url"})
	@BeforeClass
	public void beforeClass(String browserName, String appUrl) {
		driver = getBrowserDriver(browserName, appUrl);
		homePage = PageGeneratorManager.getUserHomePage(driver);
		
		emailAddress = "auto" + getRamdomNumber() + "@mail.vn";
		firstName = "automation";
		lastName = "fc";
		password = "123456";
		
	}

	@Test
	public void User_01_Register(Method method) {
		ExtentTestManager.startTest(method.getName(), "User_01_Register");
		ExtentTestManager.getTest().log(LogStatus.INFO, "User_01_Register - Step 01: Click to register link");
		registerPage =  homePage.clickToRegisterLink();
		
		ExtentTestManager.getTest().log(LogStatus.INFO, "User_01_Register - Step 02: Enter to First Name textbox with value " + firstName);
		registerPage.inputToFirstNameTextBox(firstName);
		
		ExtentTestManager.getTest().log(LogStatus.INFO, "User_01_Register - Step 03: Enter to Last Name textbox with value " + lastName);
		registerPage.inputToLastNameTextBox(lastName);
		
		ExtentTestManager.getTest().log(LogStatus.INFO, "User_01_Register - Step 04: Enter to Email textbox with value " + emailAddress);
		registerPage.inputToEmailTextBox(emailAddress);
		
		ExtentTestManager.getTest().log(LogStatus.INFO, "User_01_Register - Step 05: Enter to Password textbox with value " + password);
		registerPage.inputToPasswordTextBox(password);
		
		ExtentTestManager.getTest().log(LogStatus.INFO, "User_01_Register - Step 06: Enter to Confirm Password textbox with value " + password);
		registerPage.inputToConfirmPasswordTextBox(password);
		
		ExtentTestManager.getTest().log(LogStatus.INFO, "User_01_Register - Step 07: Click to Register button");
		registerPage.clickToRegisterButton();
		
		ExtentTestManager.getTest().log(LogStatus.INFO, "User_01_Register - Step 08: Verify success message displayed");
		verifyEquals(registerPage.getRegisterSuccessMessage(), "Your registration completed");
		
		ExtentTestManager.getTest().log(LogStatus.INFO, "User_01_Register - Step 09: Click to Logout link");
		homePage = registerPage.clickToLogOutLink();
		
		ExtentTestManager.endTest();
	}
	
	@Test
	public void User_02_Login(Method method) {
		ExtentTestManager.startTest(method.getName(), "User_02_Login");
		ExtentTestManager.getTest().log(LogStatus.INFO, "User_02_Login - Step 1: Click to Login link");
		loginPage = homePage.openLoginPage();
		
		ExtentTestManager.getTest().log(LogStatus.INFO, "User_02_Login - Step 2: Enter to Email textbox with value" + emailAddress);
		loginPage.inputToEmailTextBox(emailAddress);
		
		ExtentTestManager.getTest().log(LogStatus.INFO, "User_02_Login - Step 3: Enter to Password textbox with value " + password);
		loginPage.inputToPasswordTextBox(password);

		ExtentTestManager.getTest().log(LogStatus.INFO, "User_02_Login - Step 4: Click to Login Button");
		homePage = loginPage.clickToLoginButton();
		
		ExtentTestManager.getTest().log(LogStatus.INFO, "User_02_Login - Step 5: Verify My Account link is displayed");
		verifyFalse(homePage.isMyAccountLinkDisplayed());
		
		ExtentTestManager.endTest();
	}
	

	@AfterClass
	public void afterClass() {
		
		
		driver.quit();
	}
	private WebDriver driver;
	private String emailAddress, firstName, lastName, password;
	private UserHomePageObject homePage;
	private UserRegisterPageObject registerPage;
	private UserLogInPageObject loginPage;


}
