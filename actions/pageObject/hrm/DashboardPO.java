package pageObject.hrm;

import org.openqa.selenium.WebDriver;

import commons.BasePage;
import pageObject.nopCommerce.portal.PageGeneratorManager;
import pageUI.nopCommerce.admin.LoginPageUI;

public class DashboardPO extends BasePage{
	WebDriver driver;

	public DashboardPO(WebDriver driver) {
		this.driver = driver;
	}
	
}