package assignment_generics;

import java.util.Arrays;
import java.util.List;

public class Question_5 {

	public static void main(String[] args) {

		List<Integer> l2 = Arrays.asList(10, 30, 50 , 20);

		System.out.println("Sum Of WildCard Character : " + getSum(l2));

	}

	static double getSum(List<? extends Number> l1) {

		double total = 0;

		for (Number n : l1) {
			total = total + n.doubleValue();
		}
		return total;
	}

}
