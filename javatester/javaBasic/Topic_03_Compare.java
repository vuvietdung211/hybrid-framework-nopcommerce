package javaBasic;

public class Topic_03_Compare {
	
		int number = 8;
	  public static void main(String[] args) {
		// 1 vùng nhớ biến x
		  int x = 5;
		  
		// 1 vùng nhớ biến y
		  int y= x;
		  
		  System.out.println("x= " + x);
		  System.out.println("y= " + y);
		  
		  y = 10;// tạo 1 vùng nhớ mới
		  System.out.println("x = " + x);
		  System.out.println("y = " + y);
		  
		  
		  Topic_03_Compare firstVariable = new Topic_03_Compare();
		  
		  Topic_03_Compare secondVariable = new Topic_03_Compare();
		//  Topic_03_Compare secondVariable = firstVariable;
		  
		  System.out.println("Before x = " + firstVariable.number);
		  System.out.println("Before y = " + secondVariable.number);
		  
		  secondVariable.number = 15;// ko tạo mà tham chiếu đến 
		  
		  System.out.println("After x = " + firstVariable.number);
		  System.out.println("After y = " + secondVariable.number);
	}
}
