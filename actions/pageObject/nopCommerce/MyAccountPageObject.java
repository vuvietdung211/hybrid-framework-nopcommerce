package pageObject.nopCommerce;

import org.openqa.selenium.WebDriver;

import commons.BasePage;
import pageUI.nopCommerce.MyAccountPageUI;

public class MyAccountPageObject extends BasePage{
	WebDriver driver;

	public MyAccountPageObject(WebDriver driver) {
		this.driver = driver;
	}

	public void clickToNewsletterCheckbox() {
		waitForElementClickable(driver,MyAccountPageUI.NEWSLETTER_CHECKBOX);
		clickToElement(driver, MyAccountPageUI.NEWSLETTER_CHECKBOX);
	}
}
