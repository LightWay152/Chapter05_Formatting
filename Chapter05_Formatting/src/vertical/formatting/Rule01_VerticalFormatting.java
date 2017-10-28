package vertical.formatting;
public class Rule01_VerticalFormatting {
	/**
	 * getT: getTopic
	 * */
	public static String getT(){
		t = "Sum of 2 integers";
		return t;
	}
	public static int getResultOfN1AndN2(){
		n1 = 6;
		n2 = 9;
		return n1 + n2;
	}
	private static String t;//t: topic
	private	static int n1;//n1: number1
	public static void main(String[] args) {
		System.out.println("Topic: " + getT());
		System.out.println("Sum: " + getResultOfN1AndN2());
	}
	private static int n2;//n2: number2
}
