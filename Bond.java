package generics;

import java.util.Arrays;
import java.util.List;

public class Bond {

	public static void main(String[] args) {

	//	System.out.println(getSum(Arrays.asList(10, 20, 2.5, 9, 1.3)));
		
		printValue(Arrays.asList(10, 20 , 25.0000000005, 12f, 12l));

	}

	// Upper Bond **********
	
//	public static double getSum(List< ? extends Number> num) {
//
//		double sum = 0;
//
//		for (Number n : num) {
//			sum = sum + n.doubleValue();
//		}
//
//		return sum;
//	}
	
	// Lower Bond **********
	
	public static void printValue(List< ? super Integer> list) {
		
		for(Object obj : list) {
			System.out.println(obj);
		}
		
	}

}
