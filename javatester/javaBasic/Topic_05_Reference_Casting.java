package javaBasic;

public class Topic_05_Reference_Casting {
		public String sName;
		
		public String getName() {
			return sName;
		}
		
		public void setName(String sName) {
			this.sName = sName;
		}
		
		public void printName() {
			System.out.println("Name: " + sName);
	
		}
		
		public static void main(String[] args) {
			Topic_05_Reference_Casting name1 = new Topic_05_Reference_Casting();
			Topic_05_Reference_Casting name2 = new Topic_05_Reference_Casting();
			
			name1.setName("ABC");
			name2.setName("DEF");
			
			// ép kiểu
			name1 = name2;
			
			name1.getName();
			name2.getName();
			
			name2.setName("DUNG");
			
			name1.getName();
			name2.getName();
		}
}
