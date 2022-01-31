package javaOOP;

public class BaseOOP {
	public long shortTimeout = 15;
	protected long longTimeout = 45;
	
	
	public BaseOOP() {
		System.out.println("Constructor tại class cha ");
	}
	public BaseOOP(String name) {
		System.out.println("Constructor tại class cha " + name);
	}
	public BaseOOP(int number) {
		System.out.println("Constructor tại class cha " + number);
	}
}
