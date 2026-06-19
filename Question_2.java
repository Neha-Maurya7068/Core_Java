package assignment_generics;

public class Question_2 <T>{
	
	// Upper Bond ************
	
	static <T extends Number> void printDoubleValue(T num) {
		System.out.println(num.doubleValue());
	}
	
	public static void main(String[] args) {
		printDoubleValue(123);
	}

}
