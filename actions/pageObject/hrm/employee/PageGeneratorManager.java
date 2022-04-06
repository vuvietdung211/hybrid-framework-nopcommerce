package pageObject.hrm.employee;

import org.openqa.selenium.WebDriver;

public class PageGeneratorManager {
		public static LoginPO getLoginPagePage(WebDriver driver) {
			return new LoginPO(driver);
		}
		public static DashBoardPO getDashBoardPage(WebDriver driver) {
			return new DashBoardPO(driver);
		}
		
		public static PersonalDetailPO getPersonalDetailPage(WebDriver driver) {
			return new PersonalDetailPO(driver);
		}
		public static AddEmployeeListPO getAddEmployeeListPage(WebDriver driver) {
			return new AddEmployeeListPO(driver);
		}
}
