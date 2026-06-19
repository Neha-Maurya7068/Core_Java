package methods_returntype;

import java.util.Scanner;

public class PrimeNumber {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter The Number : ");
		int n = sc.nextInt();
		
//		boolean b = checkPrime(n);
		
//		if(b) {
//			System.out.println(n+" Is Prime Number !!");
//		}
//		else {	
//			
//			System.out.println(n+" Is Not Prime Number !!");	
//		}
		
		
		if(checkPrime(n)) 
			System.out.println(n+" Is Prime Number !!");
		
		else 
			System.out.println(n+" Is Not Prime Number !!");	
		
			
	}
	
	// Check the prime *******
	
	public static boolean checkPrime (int n) {
		
		for(int i = 2; i <= n/2; i++) {
			
			if(n % i == 0) {
				return false;
			}
		}
		
		return true;
	}
	
}
