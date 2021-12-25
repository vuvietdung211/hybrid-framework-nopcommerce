package javaBasic;

import java.util.ArrayList;
import java.util.Iterator;

import org.testng.annotations.Test;

public class Topic_11_Array {
	int number[] = {20, 7, 6, 8, 9, 15, 40, 2, 14};
//	//public static void main(String[] args) {
//
//		int student[] = { 12, 7, 5, 3, 5, 7, 8 };
//
//		String studentName[] = { "Nam", "Hoa", "Long", "An" };
//		// Gán lại value
//		studentName[0] = "Hoa";
//
//		for (int i = 0; i < studentName.length; i++) {
//			System.out.println(studentName[i]);
//		}
//
//		// foreach ko kết hợp được với điều kiện
//		for (String std : studentName) {
//			System.out.println(std);
//		}
//		
//		// Động
//		ArrayList<String> stdName = new ArrayList<>();
//		// khi chạy code mới add
//		for (String std : stdName) {
//			stdName.add(std);
//		}
//	}
	
	//@Test
	public void TC01_Find_Maximum_Number() {
		
		
		int x = 0;
		for (int i = 0; i < number.length; i++) {
			if (x < number[i]) {
				x = number[i];
			}
		}
	
		System.out.println("Maximun number = " + x);
	} 

	
	
	//@Test
	public void TC02Sum_First_And_Last_Number() {
		
		System.out.println("Sum first number and last number = " + (number[0] + number[number.length - 1]));
		
	}
	
	//@Test
	public void TC03_Even_Number() {
		for (int i = 0; i < number.length; i++) {
			if (number[i] % 2 == 0) {
				System.out.println("Even number = " + number[i]);
			}
		}
		
		
	}
	//@Test
	public void TC04() {
		for (int i = 0; i < number.length; i++) {
			if (number[i] >= 0 && number[i] <= 10) {
				System.out.println("number in (0<=number<=10) = " + number[i]);
			}
		}
		
		
	}
	
	//@Test
	public void TC05() {
		int sum = 0;
		for (int i = 0; i < number.length; i++) {
			sum = sum + number[i];
		}
		System.out.println(sum);
		
	}
	
	@Test
	public void TC06() {
		int sumOdd = 0;
		for (int i = 0; i < number.length; i++) {
			if (number[i] % 2 != 0) {
				sumOdd = sumOdd + number[i];
			}
		}
		System.out.println(sumOdd);
		
	}
	
//	@Test
//	public class Student() {
//		String name;
//		int age;
//		public Student[String name, int age] {
//			this.name = name;
//			
//			this.age = age;
//		}
//		
//		public void display() {
//			System.out.println("Name: " + name);
//			System.out.println("Age: " + age);
//		}
//		
//		public static void main(String[] args) {
//			Student[] students = new Student[3];
//			Student[0] = new Student("Tuan", 24);
//			Student[1] = new Student("Nam", 24);
//			Student[1] = new Student("Hoang", 24);
//			for (int i = 0; i < 3; i++) {
//				student[i].display();
//			}
//		}
//	
	}
	
		




