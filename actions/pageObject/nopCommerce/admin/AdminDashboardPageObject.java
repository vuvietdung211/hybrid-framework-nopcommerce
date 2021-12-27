package pageObject.nopCommerce.admin;

import org.openqa.selenium.WebDriver;

import commons.BasePage;
import pageUI.nopCommerce.admin.AdminDashboardUI;

public class AdminDashboardPageObject extends BasePage{
	WebDriver driver;

	public AdminDashboardPageObject(WebDriver driver) {
		this.driver = driver;
	}
	public boolean isDashboardDisplayed() {
		waitForElementVisible(driver, AdminDashboardUI.DASHBOARD_HEADER);
		return isElementDisplayed(driver, AdminDashboardUI.DASHBOARD_HEADER);
	}

}
