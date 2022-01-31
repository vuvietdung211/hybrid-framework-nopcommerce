package javaOOP;
	
	
public class carPOP {
	static String carCompany;
	static String carType;
	static String fuelType;
	static Float mileAge;
	static Double carPrice;
	
	public static void main(String[] args) {
		carCompany = "Honda";
		carType = "City";
		fuelType = "Petrol";
		mileAge = 200f;
		carPrice = 50000d;
		System.out.println("Car company = " + carCompany);
		System.out.println("Car type = " + fuelType);
		System.out.println("Car mile age = " + mileAge);
		System.out.println("Car price = " + carPrice);
		
		carCompany = "Huyndai";
		carType = "Kona";
		fuelType = "Diesel";
		mileAge = 300f;
		carPrice = 45000d;
		System.out.println("Car company = " + carCompany);
		System.out.println("Car type = " + fuelType);
		System.out.println("Car mile age = " + mileAge);
		System.out.println("Car price = " + carPrice);
	}
}
