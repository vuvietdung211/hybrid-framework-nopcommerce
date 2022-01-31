package javaOOP;

public class Topic_04_Non_Access_Modifier {
	static String browserName = "Chrome";
	// Static: variable/method
	// Dùng cho tất cả các instance/ object 
	String servername = "Testing";
	
	public static void main(String[] args) {
		browserName = "Firefox";
		fileName(); 
		Topic_04_Non_Access_Modifier obj = new Topic_04_Non_Access_Modifier();
		obj.servername ="cloud"; 
	}
	
	// truy cập trực tiếp từ tên class 
	// Không cần tạo instance/ object
	// Ứng dụng để khởi tạo class( che giấu việc khởi tạo đối tượng)
	public static void fileName() {
		System.out.println("");
	}

}
