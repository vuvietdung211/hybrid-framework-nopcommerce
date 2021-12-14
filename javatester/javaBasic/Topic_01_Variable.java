package javaBasic;

public class Topic_01_Variable {
	
	public Topic_01_Variable() {// đây là hàm khởi tạo/ trùng tên vs tên class
		
	}
	
	static int studentNumber;// Trong 1 Hàm Static Muốn dùng 1 biến static bên ngoài thì biến cũng phải là static
	static boolean status; 
	static final String BROWSER_NAME = "Chrome";// Final được dùng khi biến này là duy nhất không thể override giá trị khác 
	// hay gọi là hằng số(phải viết hoa)
	String studentName = "automationFC";
	
	
	public static void main(String[] args) {
		System.out.println(studentNumber);
		System.out.println(status);
		int studentPrice = 5;// biến local phải đc gán giá trị
		System.out.println(studentPrice);
		
		System.out.println(Topic_01_Variable.BROWSER_NAME);
		Topic_01_Variable topic = new Topic_01_Variable();// Nếu biến ko có thuộc tính static thì truy cập theo cách này
		//New 1 đối tượng
		System.out.println(topic.studentName);
	
		
		
	}
	
	//Getter: getCurrentUrl/ getTitle/ getText/ getDimension/ getPosition
	public String getStudentName() {
		return this.studentName;
		
		
		
	}
	//Setter: click/sendkey/ clear/ select/ back/ forward/ refresh/get/..
	public void setStudentName(String stdName) {
		this.studentName = stdName;
	}


}
