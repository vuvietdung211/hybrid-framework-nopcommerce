package javaOOP.abstraction;

public class Laptop extends Computer{

	@Override
	public void setRam() {
		System.out.println("8GB");
		
	}
	
	public void renderVideo() {
		showCPU();
	}
	
	// có thể override hàm non-astract hoặc ko
	@Override
	public void showCPU() {
		
	}
}
