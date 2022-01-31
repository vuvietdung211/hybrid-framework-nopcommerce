package javaOOP.abstraction;

public interface IAnimal {
	String getName();
	
	void setName(String name);
	
	abstract String getAdress();
	
	abstract void setAddress(String address);
}
