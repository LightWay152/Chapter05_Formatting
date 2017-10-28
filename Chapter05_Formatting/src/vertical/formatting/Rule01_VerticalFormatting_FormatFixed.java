package vertical.formatting;

public class Rule01_VerticalFormatting_FormatFixed {
	private static String topic;
	private	static int number1, number2;
	
	public static String getTopic(){
		topic = "Sum of 2 integers";
		return topic;
	}
	public static int getSum(){
		number1 = 6;
		number2 = 9;
		return number1 + number2;
	}
	
	public static void main(String[] args) {
		System.out.println("Topic: " + getTopic());
		System.out.println("Sum: " + getSum());
	}
}
