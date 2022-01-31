package javaOOP;

public class Person {
	
	private String personName;
	public class Pupil{
		String name = "";
	}
	
	public static void main(String[] args) {
		Person person = new Person();
		// Person = class;
		// person = instance/ biến / object
		Person.Pupil pupil = person.new Pupil();
		pupil.name = "";
		
		
	}

}
