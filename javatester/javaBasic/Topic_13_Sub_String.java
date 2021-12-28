package javaBasic;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Topic_13_Sub_String {
	
	

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", ".\\browserDrivers\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		String schoolName = "automation testing";
		
		String schoolNameLow = schoolName.toLowerCase();
		
		System.out.println("Kiem tra 2 bien co bang nhau = " + schoolName == schoolNameLow);
		// KL : khi sử dụng method thay đổi String thì String sẽ tạo dl  mới chứ ko ghị lại.
		
		String schoolAddress = "Ho Chi Minh City";
		
		String courseName = "AUTOMATION TESTING";
		
		System.out.println("Do dai = " + schoolName.length());
		
		System.out.println("lay ra ky tu = " + schoolName.charAt(2));
		
		System.out.println("Noi 2 chuoi  = " + schoolName.concat(schoolAddress));
		
		System.out.println("Kiem tra 2 chuoi bang nhau tuyet doi = " + schoolName.equals(schoolAddress));
		
		System.out.println("Kiem tra 2 chuoi bang nhau tuyet doi = " + schoolName.equals("Automation Testing"));
		
		// Ko phân biệt hoa thường
		System.out.println("Kiem tra 2 chuoi bang nhau tuong doi = " + schoolName.equalsIgnoreCase(courseName));
		
		// startWith/ endWith / contains 

		System.out.println("bat dau bang " + schoolName.startsWith("automation"));
		
		System.out.println("ket thuc bang " + schoolName.endsWith("testing"));
		
		System.out.println("co chua " + schoolName.contains("mation"));
		
		System.out.println("Vi tri cua 1 ki tu trong chuoi " + schoolName.indexOf("automation"));
		System.out.println("Vi tri cua 1 ki tu trong chuoi " + schoolName.indexOf("u"));
		System.out.println("Vi tri cua 1 ki tu trong chuoi " + schoolName.indexOf("testing"));
		
		// Tách chuỗi
		
		System.out.println("Tách 1 ki tu trong chuoi " + schoolName.substring(11));
		System.out.println("Tách 1 ki tu trong chuoi " + schoolName.substring(11, 15));
		
		// Dùng split tách String thành mảng dựa vào kí tự/ chuỗi ký tự
		// Alert
		String result = "Viewing 48 of 132 results";
		
		String results[] = result.split(" ");
		
		System.out.println(results[1]);
		
		// Replace
		
		String productPrice = "$100.00";
		// Replace chữ $
		productPrice = productPrice.replace("$", "");
		System.out.println(productPrice);

		// convert từ String sang Float 
		float productPriceF = Float.parseFloat(productPrice);
		System.out.println(productPriceF);
		
		// convert lại sang String
		productPrice = String.valueOf(productPriceF);
		
		String osName = System.getProperty("os.name");
		System.out.println(osName);
		// Windows 10
		// Handle mutiple OS: WIN/ MAC (Actons - key - CTRL / COMMAND)
		if (osName.toLowerCase().contains("windows")) {
			Keys key = Keys.CONTROL;
		} else {
			Keys key = Keys.COMMAND;
		}
		
		// mutiple browser toUpperCase
		
		String driverInstanceName = driver.toString();
		System.out.println(driverInstanceName);
		
		//FirefoxDriver: firefox on WINDOWS (ea18f16d-b123-4ee9-8b0a-c046f9a1dd40)
		// Close browser/ driver
		
		// Trim() cắt bỏ khoảng trắng đầu / cuối dòng/ xuống dòng/ tab
		String helloWorld = "      \n  \t      Hello World      \t ";
		System.out.println(helloWorld);
		System.out.println(helloWorld.trim());
		
		// isEmpty/ isBlank
		
		// Dynamic locator
		// Đại diện cho 1 chuỗi :%$
		// %b %t %d
		String dynamicButtonXpath = "//button[@id='%$']";
		System.out.println("click to login button = " + dynamicButtonXpath.format(dynamicButtonXpath, "login"));
		System.out.println("click to search button = " + dynamicButtonXpath.format(dynamicButtonXpath, "search"));
		System.out.println("click to register button = " + dynamicButtonXpath.format(dynamicButtonXpath, "register"));
		
	}
}
