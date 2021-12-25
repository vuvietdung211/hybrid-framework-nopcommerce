package javaBasic;

import java.util.Scanner;

import org.testng.annotations.Test;

//Class
public class Topic_09_While_Do_While {
	static Scanner scanner = new Scanner(System.in);
	// Function
	// public static void main(String[] args) {
	//
	// int i = 0;
	// //Block code
	// for (i = 0; i < 5; i++) {
	// System.out.println("For " + i);
	// }
	//
	// System.out.println("Biến i sau khi done vòng for: " + i);
	//
	// //i = 5 ko thỏa mãn điều kiện của while
	//
	// while (i < 5) {
	// System.out.println("While" + i);
	// i++;
	//
	// if (i == 3) {
	//
	// }
	// }
	//
	// // do while chạy ít nhất 1 lần trước rồi mới kiểm tra điều kiện
	// do {
	// System.out.println("While " + i);
	// i++;
	// } while (i < 5);
	// }
	//

	public void TC01() {
		int number = scanner.nextInt();

		for (int i = number; i < 100; i++) {

			if (i % 2 == 0) {
				System.out.println(i);
			}
		}
	}

	public void TC02_While() {
		int number = scanner.nextInt();

		while (number < 100) {
			if (number % 2 == 0) {
				System.out.println(number);

			}
			number++;
		}

	}

	public void TC03_Do_While() {
		int number = scanner.nextInt();

		do {
			if (number % 2 == 0) {
				System.out.println(number);
				number++;
			}
		} while (number < 100);

	}

	public void TC04_Exercise_2() {
		int numberA = scanner.nextInt();
		int numberB = scanner.nextInt();

		while (numberA < numberB) {
			if (numberA % 3 == 0 && numberA % 5 == 0) {
				System.out.println(numberA);

			}
			numberA++;
		}

	}

	public void TC05() {
		int numberA = scanner.nextInt();
		int numberB = scanner.nextInt();

		for (int i = numberA; i < numberB; i++) {

			if (i % 3 == 0 && i % 5 == 0) {
				System.out.println(i);
			}
		}
	}

	public void TC06() {
		int number = scanner.nextInt();
		int tong = 0;

		for (int i = 0; i <= number; i++) {

			if (i % 2 == 1) {
				tong = tong + i;

			}

		}
		System.out.println(tong);
	}

	public void TC07() {
		int numberA = scanner.nextInt();
		int numberB = scanner.nextInt();

		while (numberA < numberB) {
			if (numberA % 3 == 0) {
				System.out.println(numberA);
			}
			numberA++;
		}

	}

	public void TC08() {
		int number = scanner.nextInt();
		int a = 1;

		for (int i = number; i > 0; i--) {
			a = a * i;
		}
		System.out.println(a);
	}

	public void TC09() {
		int number = scanner.nextInt();
		int a = 1;

		while (number > 0) {
			a = a * number;
			number--;
		}
		System.out.println(a);
	}

	
	public void TC10() {
		int n = scanner.nextInt();

		for (int i = 1; i <= n; i++) {
			// in ky tu khoang trang
			for (int j = i; j < n; j++) {
				System.out.print(" ");
			}

			// in ky tu ngoi sao
			for (int j = 1; j <= (2 * i - 1); j++) {
				System.out.print("*");

			}
			System.out.println();
		}
		
	}
	
	@Test
	public void TC11() {
		int n = scanner.nextInt();

		for (int i = 1; i <= n; i++) {
			// in ky tu khoang trang
			for (int j = 1; j < i; j++) {
				System.out.print(" ");
			}

			// in ky tu ngoi sao
			for (int j = 1; j <= (n*2 -(2*i-1)); j++) {
				System.out.print("*");

			}
			System.out.println();
		}
		
	}
}
