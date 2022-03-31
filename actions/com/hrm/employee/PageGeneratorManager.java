package com.hrm.employee;

import org.openqa.selenium.WebDriver;

public class PageGeneratorManager {
		public static LoginPO getLoginPagePage(WebDriver driver) {
			return new LoginPO(driver);
		}
		public static DashBoardPO getDashBoardPage(WebDriver driver) {
			return new DashBoardPO(driver);
		}
		
		public static PersonalDetail getPersonalDetailPage(WebDriver driver) {
			return new PersonalDetail(driver);
		}
		public static EmployeeList getEmployeeListPage(WebDriver driver) {
			return new EmployeeList(driver);
		}
}
