package javaBasic;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.testng.annotations.Test;

public class Topic_08_For_Foreach {
	
	
	@Test
	public void TC01() {
		
		  for (int i = 0; i <=10 ; i++) {
			System.out.println(i);
		}
		  
		  // Vế 1 : biến tạm dùng để tăng giá trị lên sau mỗi lần duyệt
		  // dùng để so sánh với tổng giá trị (i<=10)
		  // Vế 2: so sánh vs tổng
		  // Vế 3: tăng i thêm 1 đơn vị sau khi chạy vào thân vòng for
		  
		  // Lần 1
		  // i = 0
		  // 0 < 5 đúng
		  // System.out.println(0)
		  // i++: tăng 1 đơn vị =1
		  
		  // Lần 2
		  // i = 1
		  // 1 < 5 đúng
		  // System.out.println(1)
		  // i++: tăng 1 đơn vị =2
		  
		  // Lần 3
		  // i = 2
		  // 2 < 5 đúng
		  // System.out.println(2)
		  // i++: tăng 1 đơn vị =3
		  
		  // Lần 4
		  // i = 3
		  // 3 < 5 đúng
		  // System.out.println(3)
		  // i++: tăng 1 đơn vị =4
		  
		  // Lần 5
		  // i = 4
		  // 4 < 5 đúng
		  // System.out.println(3)
		  // i++: tăng 1 đơn vị =5
		  
		  
		  // Lần 6
		  // i = 5
		  // 5 < 5 sai
		  //Ko chạy nữa
		  
		// Array  
		  
		  // for kết hợp if: thỏa mãn điều kiện mới action thì dùng for
		  // vì có Biến đếm: dùng điều kiện để filter
		  String[] cityName = {"Ha noi", "HCM" ,"Da Nang" , "Can Tho"};
		  for (int i = 0; i < cityName.length; i++) {// Lấy ra kích thước của mảng (Array) thì dùng Length
			  if (cityName[i].equals("HCM")) {
				  //Action
				  System.out.println("Do actions!!"); 
				  break;
			  }
		  }
		  
		  for (int i = 0; i < cityName.length; i++) {// Lấy ra kích thước của mảng (Array) thì dùng Length
			  if (cityName[i].equals("HCM")) {
				//Action
				System.out.println("Do actions!!"); 
				
			}
			  
			
			// dùng foreach để chạy qua tất cả các giá trị
			
			for (String city : cityName) {
				if (city.equals("HCM")) {
					System.out.print(city);
					
				}
			}
		}
	  
	}
	
	public void TC02() {
		String[] cityName = {"Ha noi", "HCM" ,"Da Nang" , "Can Tho"};
		
		// Class: ArayList/ LinkedList/ Vector
		// Interface: List/ Set/ Queue
		List<String> cityAdress = new ArrayList<String>();
		System.out.println(cityAdress.size());
		
		// Compile (Coding) add trong khi code
		cityAdress.add("HM");
		cityAdress.add("Ninh Binh");
		cityAdress.add("Ha Giang");
		System.out.println(cityAdress.size());
		
		
		//Runtime (running)add trong khi chạy vòng lặp
		for (String city : cityName) {
			cityAdress.add(city);
		}
		System.out.println(cityAdress.size());
	}



}
