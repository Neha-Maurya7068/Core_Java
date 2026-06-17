package methods;

import java.util.Scanner;

public class FactoroialDriver {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Number : ");
		int a = sc.nextInt();
		
//		Factorial f1 = new Factorial();
//		f1.getFactorial(a);
		
		
		Factorial f1 = new Factorial();
		f1.getPrimeNumber(a);
		
		
	}

}
