package methods_returntype;

import java.util.Scanner;

public class Factorial {
	
	public static int getFactorial(int n) {
		
		int fact = 1;
		
		for(int i = 1; i <= n; i++) {
			fact *= i;	
		}
		
		System.out.println("Hello"); 
		
		return fact;
		
//	 // 	System.out.println("Hello"); // Unreachable code / Dead Code
	}
	
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number : ");
		
		int n = sc.nextInt();
		
		// System.out.println(getFactorial(n));
		
		int factorial = getFactorial(n);
//		
		System.out.println("Factorial Of "+n+ " Is : "+factorial);
		
//		getFactorial(n);
		
	}

}
