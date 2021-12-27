package pageObject.nopCommerce.portal;

import org.openqa.selenium.WebDriver;

import commons.BasePage;
import pageUI.nopCommerce.user.LogInPageUI;

public class UserLogInPageObject extends BasePage {
	private WebDriver driver;
		
	public UserLogInPageObject(WebDriver driver) {
		this.driver = driver;
	}

	public UserHomePageObject clickToLoginButton() {
		waitForElementClickable(driver, LogInPageUI.LOGIN_BUTTON);
		clickToElement(driver, LogInPageUI.LOGIN_BUTTON);
		 return PageGeneratorManager.getUserHomePage(driver);
	}

	public String getErrorMessageAtEmailTextBox() {
		waitForElementVisible(driver, LogInPageUI.EMAIL_ERROR_MESSAGE);
		return getElementText(driver, LogInPageUI.EMAIL_ERROR_MESSAGE);
	}

	public void inputToEmailTextBox(String invalidEmail) {
		waitForElementVisible(driver, LogInPageUI.EMAIL_TEXTBOX);
		sendkeyToElement(driver, LogInPageUI.EMAIL_TEXTBOX, invalidEmail);
	}

	public void inputToPasswordTextBox(String password) {
		waitForElementVisible(driver, LogInPageUI.PASSWORD_TEXTBOX);
		sendkeyToElement(driver, LogInPageUI.PASSWORD_TEXTBOX, password);
	}

	public String getErrorMessageAtHeaderTextBox() {
		waitForAllElementVisible(driver, LogInPageUI.HEADER_ERROR_MESSAGE);
		return getElementText(driver, LogInPageUI.HEADER_ERROR_MESSAGE);
	}

	public UserHomePageObject loginAsUser(String emailadress, String password) {
		inputToEmailTextBox(emailadress);
		inputToPasswordTextBox(password);
		return clickToLoginButton();
	}

}
