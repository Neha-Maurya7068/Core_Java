package Methods;

import java.util.Scanner;

public class Question {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

//		System.out.println("Enter a Number : ");
//		int n = sc.nextInt();
//		
//		int factorial = getFactorial(n);
//		System.out.println("Factorial Of "+n+" Is : "+factorial);
		
	// System.out.println(	demo()); // ❌
		demo();

	}

	public static void demo() {
		System.out.println("This is Demo Method !!");
	}
	
	// Factorial Method **********
	
	public static int getFactorial(int a) {
		int fact = 1;
		for (int i = 1; i <= a; i++) {
			fact = fact * i;
		}
		return fact;
	}

}
