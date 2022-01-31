package javOOPpolymorphism;

public class Operator {
	public void sum(int a, int b) {
		System.out.println();
	}
	public void sum(double a, double b) {
		
	}
	public void sum(float a, float b) {
		
	}
	public void sum(long a, long b) {
		
	}

	 public static void main(String[] args) {
		Operator opr = new Operator();
		
		opr.sum(5, 8);
		opr.sum(455.5d, 4545.d);
		opr.sum(45l, 347l);
		opr.sum(54.554f, 989.898f);
		
	}



}
