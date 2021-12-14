package javaBasic;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
	
public class Topic_06_Condiction_Statement {
	WebDriver driver;
	String projectPath = System.getProperty("user.dir");
	
	
	
	public void TC_01_If() {
		boolean status = 5 > 3;
// IF		
		// Hàm if sẽ nhận vào điều kiện đúng
		// Kiểm tra duy nhất 1 ĐK
		// Nếu ĐK đúng thì action
		if (status) {
			// Đúng thì vào phần thân if
			// Sai thì bỏ qua
			System.out.println("Go to if");
		}
		
		WebDriver driver = new ChromeDriver();
		
		// Element luôn có trong DOM dù popup hiển thị hay ko
		WebElement salePopup = driver.findElement(By.id(""));
		if (salePopup.isDisplayed()) {
			
		}
		
		// Element ko có trong DOM khi popup ko hiển thị
		List<WebElement> salePopups = driver.findElements(By.id(""));
		if (salePopups.size() > 0 && salePopups.get(0).isDisplayed()) {
		}
		 // Gán (asign)
		int stdNumber = 10;
		// So sánh (compare)
		status = (stdNumber == 10);
		System.out.println(status);
	
		// Uncheck to checkbox
		WebElement languageCheckbox = driver.findElement(By.id(""));
		if (languageCheckbox.isSelected()  ) {
			languageCheckbox.click();
		// Uncheck to checkbox	
		if (!languageCheckbox.isSelected()  ) {
			languageCheckbox.click();
		}
		}
	}		
	
	
	public void TC_02_If_Else() {
		// IF ELSE
				// Có tới 2 ĐK đúng vào IF, sai vào ELSE
		
		// Nếu driver start vs browser như Chome/ FireFox/ Edge/ Safari thì dùng hàm click
		// thông thường (builtin) của Selenium Webdriver
		
		// Nếu driver là IE thì dùng hàm click của JavaScriptExecutor
		
		System.setProperty("webdriver.ie.driver", projectPath + "\\browerDrivers\\IEdriver.exe");
		driver = new InternetExplorerDriver();
		
		System.setProperty("webdriver.chrome.driver", projectPath + "\\browerDrivers\\chromedriver.exe");
		driver = new ChromeDriver();
		
		if (driver.toString().contains("internet explorer")) {
			System.out.println("click by Javascript Executor");
		} else {
			System.out.println("click by Selenium WebElement");
			
		}
	
	}
	@Parameters("browser")
	
	public void TC_02_If_Else_If_Else(String browserName) {
		if (browserName.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", projectPath + "\\browserDrivers\\chromedriver.exe");
			driver = new ChromeDriver();
		} else if (browserName.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", projectPath + "\\browserDrivers\\geckodriver.exe");
			driver = new FirefoxDriver();
		} else if (browserName.equalsIgnoreCase("edge")) {
			System.setProperty("webdriver.edge.driver", projectPath + "\\browserDrivers\\msedgedriver.exe");
			driver = new EdgeDriver();
		} else if (browserName.equalsIgnoreCase("internet explorer")) {
			System.setProperty("webdriver.ie.driver", projectPath + "\\browserDrivers\\IEdriver.exe");
			driver = new InternetExplorerDriver();
		} else {
			throw new RuntimeException("Please input correct name");
		}
		System.out.println(browserName);
		System.out.println(driver.toString());
		driver.quit();
	}		
		
		// If-else
		@Test
		public void TC_02_If_Else_() {
		int age = 18;
		String access = (age < 18) ? "You cannot access" : "Welcome to our system";
		// bằng với 
		if (age < 18) {
			access = "You cannot access";
		} else {
			access = "Welcome to our system";

		}
		
		System.out.println(access);
	
	
		}	


}
