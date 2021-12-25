package EclipseTips;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

@Test
public class Topic_02_Debug {
	
	WebDriver driver;
	
	String projectPath = System.getProperty("user.dir");

	public void TC01() {
		System.setProperty("webdriver.chrome.driver", projectPath + "\\browserDrivers\\chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		String headerText = driver.findElement(By.xpath("//img[@alt='Facebook']/parent::div/following-sibling::h2")).getText();
		
		Assert.assertEquals(headerText, "Facebook helps you connect and share with the people in your life.");
	
		boolean loginStatus = driver.findElement(By.name("login")).isDisplayed();
		Assert.assertTrue(loginStatus);
		
	for (int i = 0; i < 5; i++) {
		
	}
	}
	
}
