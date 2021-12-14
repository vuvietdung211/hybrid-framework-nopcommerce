package javaBasic;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Topic_07_Switch_Case {
	WebDriver driver;
	String projectPath = System.getProperty("user.dir");
	Scanner scanner = new Scanner(System.in);
	@Parameters("browser")
	
	public void TC_02_If_Else_If_Else(String browserName) {
		driver= getBrowserDriver(browserName);
		
		System.out.println(browserName);
		System.out.println(driver.toString());
		driver.quit();
	}
	
	public WebDriver getBrowserDriver(String browserName) {
		switch (browserName) {
		case "chrome":
			System.setProperty("webdriver.chrome.driver", projectPath + "\\browserDrivers\\chromedriver.exe");
			driver = new ChromeDriver();
			break;
		case "firefox":
			System.setProperty("webdriver.gecko.driver", projectPath + "\\browserDrivers\\geckodriver.exe");
			driver = new FirefoxDriver();
			break;
		case "edge":
			System.setProperty("webdriver.edge.driver", projectPath + "\\browserDrivers\\msedgedriver.exe");
			driver = new EdgeDriver();
			break;
		case "internet explorer":
			System.setProperty("webdriver.ie.driver", projectPath + "\\browserDrivers\\IEDriverServer.exe");
			driver = new InternetExplorerDriver();
			break;	
		default:
			new RuntimeException("Please input correct name");
			break;
		}
		return driver;
	}
	
	public void TC03() {
		int M = scanner.nextInt();
		switch (M) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			System.out.println("thang " + M + " có 31 ngay");
			break;
		case 2:
			System.out.println("thang " + M + " có 28 ngay");	
		case 4:
		case 6:
		case 9:
		case 11:
			System.out.println("thang " + M + " có 30 ngay");		
		default:
			System.out.println("vui long nhap dung dinh dang");	
			break;
		}
		
	}
	@Test
	public void TC04() {
		int firstNum = scanner.nextInt();
		int secondNum = scanner.nextInt();
		String operator = scanner.next();
		switch (operator) {
		case "+":
			System.out.println("A+B = " +(firstNum + secondNum));
			break;
		case "-":
			System.out.println("A+B = " +(firstNum - secondNum));
			break;
		case "*":
			System.out.println("A*B = " +(firstNum * secondNum));
			break;
		case "/":
			System.out.println("A/B = " +(firstNum / secondNum));
			break;
		case "%":
			System.out.println("A%B = " +(firstNum % secondNum));
			break;
		}
		
	}
}
