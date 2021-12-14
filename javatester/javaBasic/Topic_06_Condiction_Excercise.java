package javaBasic;

import java.util.Scanner;

import org.testng.annotations.Test;

public class Topic_06_Condiction_Excercise {
	Scanner scanner = new Scanner(System.in);
	
	public void TC01() {
		int number = scanner.nextInt();
		if (number % 2 == 0) {
			System.out.println("số" + number + "là số chẵn");
		} else {
			System.out.println("số" + number + "là số lẻ");
		}
	}

	
	public void TC02() {
		int numberA = scanner.nextInt();
		int numberB = scanner.nextInt();
		if (numberA > numberB) {
			System.out.println(numberA + "lon hon" + numberB);
		} else if (numberA < numberB) {
			System.out.println(numberA + "nho hon" + numberB);
		} else {
			System.out.println(numberA + "bang" + numberB);
		}
		
		}
	
	public void TC03() {
		String nameA = scanner.nextLine();
		String nameB = scanner.nextLine();
		if (nameA.equals(nameB)) {
			System.out.println("2 nguoi la cung ten");
		} else {
			System.out.println("2 nguoi la khac ten");
		}
	}
	
	public void TC04() {
		int numbera = scanner.nextInt();
		int numberb = scanner.nextInt();
		int numberc = scanner.nextInt();
		
		if (numbera > numberb && numbera > numberc) {
			System.out.println(numbera + "la so lon nhat");
		} else if (numberb > numberc) {
			System.out.println(numberb + "la so lon nhat");
		} else {
			System.out.println(numberc + "la so lon nhat");
		}
	}
	public void TC05() {
		int a = scanner.nextInt();
		if (a > 10 && a < 100) {
			System.out.println(a + "nam trong khoang[10,100]");
		} else {
			System.out.println(a + " ko nam trong khoang[10,100]");
		}
	}
	
	public void TC06() {
		System.out.println("vui long nhap diem so");
		float S = scanner.nextFloat();
		if (S >=8.5 && S <=10) {
			System.out.println("Diem A");
		} else if (S >=7.5 && S <8.5) {
			System.out.println("Diem B");
		} else if (S >=5 && S <7.5) {
			System.out.println("Diem C");
		} else if (S >=0 && S <5) {
			System.out.println("Diem D");
		} else {
			System.out.println("vui long nhap so hop le");
		}
	}
	@Test
	public void TC07() {
		int M = scanner.nextInt();
		if (M ==1 || M == 3 || M ==5 || M ==7 || M ==8 || M ==10 || M ==12) {
			System.out.println("thang " + M + " có 31 ngay");
		} else if (M ==4 || M == 6 || M ==9 || M ==11 ) {
			System.out.println("thang " + M + " có 30 ngay");
		} else if (M ==2 ) {
			System.out.println("thang " + M + " có 28 ngay");
		} else {
			System.out.println("vui long nhap dung dinh dang");
		}
	}

}

