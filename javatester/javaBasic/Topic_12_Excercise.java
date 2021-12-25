package javaBasic;

import java.lang.reflect.Array;
import java.util.Collections;

import org.testng.annotations.Test;

public class Topic_12_Excercise {
	String courseName = "Automation Testing Advanced 54 56";

	@Test
	public void TC01() {

		char courseNameArr[] = courseName.toCharArray();
		int countUpper = 0;
		int countLower = 0;
		int countNumber = 0;
		for (char character : courseNameArr) {
			if (character <= 'Z' && character >= 'A') {
				countUpper++;
			}
			if (character <= 'z' && character >= 'a') {
				countLower++;
			}
			if (character <= '9' && character >= '0') {
				countNumber++;
			}
		}
		System.out.println("Sum of upper Case = " + countUpper);
		System.out.println("Sum of lower Case = " + countLower);
		System.out.println("Sum of number Case = " + countNumber);
		System.out.println(courseName.indexOf("Testing"));
	}
	
	
	@Test
	public void TC03_Reverse_String() {
		
		char courseNameArr[] = courseName.toCharArray();
		
		for (int i = courseNameArr.length - 1; i >= 0; i--) {
			System.out.print(courseNameArr[i]);
		}
	}
}
