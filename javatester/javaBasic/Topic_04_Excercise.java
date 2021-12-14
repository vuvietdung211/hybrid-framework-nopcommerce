package javaBasic;

import java.util.Scanner;

import org.testng.annotations.Test;

public class Topic_04_Excercise {
	
	
	public void swapNumber() {
		int a =5;
		int b =6;
		
		a= a + b;
		b= a - b;
		a= a - b;
		System.out.println("a= " + a);
		System.out.println("b= " + b);
	}
	
	public void swap() {
		int a =6;
		int b =4;
		
		boolean status = (a > b && a!=b) ? true : false;
		System.out.println(status);	
		
		
		
	}
	@Test
	public void swap2() {
		Scanner scanner = new Scanner(System.in);
		String name = scanner.nextLine();
		
		int age = scanner.nextInt();
		String a = name + age;
		System.out.println("After 15 years, age of " + name + "will be" + (age + 15));
		System.out.println(a);
		scanner.close();
	}

}

