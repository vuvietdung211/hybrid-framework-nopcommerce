package javaBasic;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Topic_02_Data_Type {
	// Primitive type/ value type: Nguyên thủy (primitive)
	byte bNumber = 6;
	
	short sNumber = 1500;
	
	int iNumber = 65000; 
	
	long lNumber = 65000; //64 bit
	
	float fNumber = 15.68f;
	
	double dNumber = 15.78d; //64bit
	
	char cChar     = '1'; //1 Ký tự
	
	boolean bStatus;
	
	// Reference type: Tham chiếu(non primitive)
	
	// Array ( có thẻ chứa nhiều kiểu dữ liệu)
	String[] stdAdress = {"Hanoi", "Da Nang"};
	Integer[] stdNumber = {15,20,40};
	
	// String
	String Address = "Ha Noi";
	
	// Class
	Topic_02_Data_Type topic;
	
	// Interface
	WebDriver driver;
	
	// Object là 1 kiểu dữ liệu> có thể convert sang kiểu khác
	Object aObject;
	
	//Collection
	// List/ Set/ Queue / Map
	List<WebElement> homePageLinks = driver.findElements(By.tagName("a")); // List cho lưu trùng
	Set<String> allWindows = driver.getWindowHandles(); // Set ko lưu trùng
	
	List<String> pName = new ArrayList<String>();
	
	public void clickToElement(){
		// Các kiểu tham chiếu sẽ có các hàm kèm theo, hàm nguyển thủy ko có
		stdNumber.clone();
		topic.equals(aObject);
		homePageLinks.isEmpty();
		
		
		
	}
	
	public static void main(String[] args) {
		
	}
}
	 










































//// global variable
//String adress = "Ha Noi";
//static int number; // biến global sẽ có giá trị default.biến local thì ko/
//public static void main(String[] args) {
//	// local variable
//	int stdnumber = 0;  //biến local thì phải gán giá trị/ ko cần static vì đã ở trong hàm có static
//	
//	System.out.println(number);
//	
//	System.out.println(stdnumber);
//	
//	
//	Topic_02_Data_Type topic = new Topic_02_Data_Type();
//	
//	System.out.println(topic.adress);
//}