package pageObject.hrm;

import org.openqa.selenium.WebDriver;

import commons.BasePage;

public class PageGeneratorManager extends BasePage{
	WebDriver driver;
	public LoginPO getLoginPage(WebDriver driver) {
		return new LoginPO(driver);
		
	}

}
