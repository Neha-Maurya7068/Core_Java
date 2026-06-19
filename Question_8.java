package assignment_generics;

public class Question_8 <T> {

	static <T extends Number> boolean isZero(T num) {

		return num.doubleValue() == 0.0;
	}

	
	public static void main(String[] args) {

//		System.out.println(isZero(89));
		
		System.out.println(isZero(0));
		
	}

}
