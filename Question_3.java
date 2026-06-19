package assignment_generics;

public class Question_3<T> {

	static <T extends Number> double square(T num) {

		double sq = num.doubleValue() * num.doubleValue();

		return sq;
	}

	public static void main(String[] args) {

//		System.out.println(square(7));

		System.out.println(square(5));

	}

}
