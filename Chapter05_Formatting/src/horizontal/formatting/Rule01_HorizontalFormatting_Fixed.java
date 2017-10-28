package horizontal.formatting;

public class Rule01_HorizontalFormatting_Fixed {
	
    public Rule01_HorizontalFormatting_Fixed() {
    	super();
    }
    
    public static int getSumIntegers(int number1, int number2){
    	return number1 + number2;
    }
    
	public static void main(String[] args) {
		String strNumberA = "123";
		String strNumberB = "456";
		Integer numberA = Integer.parseInt(strNumberA);
		Integer numberB = Integer.parseInt(strNumberB);	
		System.out.println("" + getSumIntegers(numberA,numberB));
	}
}
