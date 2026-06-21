package loop;

import java.util.Scanner;

public class WhileLoop {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number : ");
		int n = sc.nextInt();

		/*
		 * Initialization;
		 *  while (condition){ 
		 *  // Loop body/block
		 *   inc / dec 
		 *   }
		 */

//		int i = 1;
//		
//		while(i <= 5) {
//			System.out.println(i);
//			i++;
//		}

//		int sum = 0;
//		int i = 1;
//
//		while (i <= 5) {
//			sum += i;
//			i++;
//		}
//		System.out.println("Sum IS : "+sum);

//		int fact = 1;
//		int i = 1;
//		
//		while(n >= i) {
//			fact *= i; 
//			i++;
//		}
//		System.out.println("Factorial Is : "+ fact);

		/*
		 * Count the Digit *******
		 */

//		int count = 0;
//		
//		while(n > 0) {
//			count++;
//			
//			n = n / 10;
//		}
//		
//		System.out.println("Total Digits Are : "+count);

		/*
		 * Remove The Digits ....
		 */


//		while (n > 0) {
//			
//			int rem = n % 10;
//			System.out.println("Remender Is : "+rem);
//			n = n / 10;
//		}
		
		/*
		 * Reverse The Number **********
		 */

//		int temp = n;
//		int reverse = 0;
//		
//		while (n > 0) {
//			
//			int rem = n % 10;
//			
//			reverse = (reverse * 10) + rem ;
//			
//			n = n / 10;
//		}
//		
//		System.out.println("Reverse Is : "+reverse);
//		
//		System.out.println("Orignal Is : "+temp);
		
		// Pallindrome Number ***********
		
//		int temp = n;
//		int reverse = 0;
//		
//		while (n > 0) {
//			
//			int rem = n % 10;
//			
//			reverse = (reverse * 10) + rem ;
//			
//			n = n / 10;
//		}
//		
//		System.out.println("Reverse Is : "+reverse);
//		
//		System.out.println("Orignal Is : "+temp);
//		
//		if(reverse == temp) {
//			System.out.println(temp+" Is a Pallindrome Number");
//		}
//		else {
//			System.out.println(temp+" Is Not a Pallindrome Number");
//		}
		
		/*
		 * Perfect Number ************
		 */
//		int sum = 0 ;
//		int i = 1;
//		while(i <= n/2) {
////			System.out.println(i);
//			if(n % i == 0) {
//				sum = sum + i;
//			}
//			
//			i++;
//		}
//		
//		if(n == sum) {
//		System.out.println(n +" Is a Perfect Number");
//		}
//		else {
//			System.out.println(n +" Is Not a Perfect Number");
//		}
		
		
		/*
		 * Prime Number ******************
		 */
		
		int count = 0;
		int i = 2;
		
		while(i <= n/2) {
			
			//  System.out.println(i);
			
			if(n % i == 0) {
				 count++;
				 break;
			}
			i++;
		}
		
		if(count == 0) {
			System.out.println(n +" Is a Prime Number !!");
		}
		else {
			System.out.println(n +" Is Not a Prime Number !!");
		}	
		
	}

}
