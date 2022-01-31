package javaOOP;

public class Topic_05_This_Super extends BaseOOP{
	private int a;
	private int b;
	public long shortTimeout = 15;
	protected long longTimeout = 45;
	
	public Topic_05_This_Super() {
		super();
	}
	public Topic_05_This_Super(int a, int b) {
		this.a = a;
		this.a = b;
	}
	public void sumNumber() {
		System.out.println(this.a + this.b);
	}
	public void showNumber() {
		this.sumNumber();
	}
	
	public static void main(String[] args) {
		Topic_05_This_Super topic = new Topic_05_This_Super(15, 17);
	}


}
