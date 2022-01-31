package javaOOP;

public class Topic_03_Method {
	void showCarName() {
		System.out.println("Huyndai Tucson");
	}
	
	static void showCarColor() {
		System.out.println("Toyota Wigo");
	}

	public static void main(String[] args) {
		// gọi vào trong 1 hàm static khác được
		showCarColor();
		
		// hàm ko static phải gọi qua instance/ object
		Topic_03_Method obj = new Topic_03_Method();
		obj.showCarName();  
		
		// static way - gọi hàm static ngoài class
		Topic_03_Method.showCarColor();
	}


}
