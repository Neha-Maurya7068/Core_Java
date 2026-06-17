package loop;

import java.util.Scanner;

public class DoWhile {

	public static void main(String[] args) {

//		int i = 6; 
//		
//		while(i <= 5) {   
//			System.out.println(i);
//			i++;
//		}

//		int i = 6; 
//		do {
//			System.out.println(i);
//			i++;
//		}while(i <= 5);

		/*
		 * ******************************************************
		 */

		/*
		 * Scanner sc = new Scanner(System.in);
		 * 
		 * System.out.println("Game Starts *********");
		 * System.out.println("Calculator Open Sucessfully !! ");
		 * 
		 * char choice;
		 * 
		 * do {
		 * 
		 * System.out.println("Calculation is in progress......");
		 * System.out.println("choose operator (+,-,* , % Or /) "); char operator =
		 * sc.next().charAt(0);
		 * 
		 * System.out.println("Enter first number :"); int a = sc.nextInt();
		 * 
		 * System.out.println("Enter second number :"); int b = sc.nextInt();
		 * 
		 * int result;
		 * 
		 * switch (operator) { case '+': result = a + b;
		 * System.out.println("Addition : " + result);
		 * 
		 * break; case '-': result = a - b; System.out.println("Substraction : " +
		 * result);
		 * 
		 * break;
		 * 
		 * case '*': result = a * b; System.out.println("Multiplication : " + result);
		 * break;
		 * 
		 * case '%': result = a % b; System.out.println("Modulus : " + result); break;
		 * 
		 * case '/': if (b != 0) { result = a / b; System.out.println("Division : " +
		 * result);
		 * 
		 * } else { System.out.
		 * println("If You Divide Any Number With Zero Then Answer Is :-> Infinity");
		 * 
		 * }
		 * 
		 * break;
		 * 
		 * default: System.out.println("Wrong Operation !!!!! ");
		 * 
		 * }
		 * 
		 * System.out.println(
		 * "Do You Want To Continue The Calculation ? (If yes then Press Y / y otherwise other character !!)"
		 * );
		 * 
		 * choice = sc.next().charAt(0);
		 * 
		 * } while (choice == 'Y' || choice == 'y');
		 * 
		 * System.out.println("Calculator Closed Sucessfully !!");
		 * 
		 * System.out.println("Game Over ***********");
		 * System.out.println("Thanks For Visit !!");
		 * 
		 */
		/*
		 **************************************** 
		 */

		// forEach ***************

//		int[] arr = { 10, 20, 30, 40, 50 };

//		System.out.println(arr[0]);

//		System.out.println(arr[4]);

//		System.out.println(arr.length);

//		for(int i = 0; i < arr.length; i++ ) {
//			
//			System.out.println(arr[i]);
//		}

//		for (int i = 0; i <= arr.length - 1; i++) {
//
//			System.out.println(arr[i]);
//		}

//		int sum = 0;
//
//		for (int i = 0; i < arr.length; i++) {
//			sum = sum + arr[i];
//		}
//		System.out.println("Sum : "+sum);

		// // For Each **************

//		int[] arr = { 10, 20, 30, 40, 50 };

//		for(int i : arr) {
//			System.out.println(i);
//		}

//		int sum = 0;
//		for(int i : arr) {
//		sum = sum + i;
//	}
//		System.out.println("Sum : "+sum);

		// Nested Loop ************

//		int n = 4;

//		for(int i = 0; i < n; i++) {
//			
//			for(int j = 0; j < n; j++) {
//				System.out.print("* ");
//			}
//			System.out.println();
//		}

//		int n = 11;
//		
//		for (int i = 1; i <= n; i++) {
//
//			for (int j = 1; j <= n; j++) {
//				if(i == 1 || i == n || j == 1 || j == n || i == (n+1)/2 || j == (n+1)/2 || i == j || i+j == n+1) {
//				System.out.print("* ");
//				}else {
//					System.out.print("  ");
//				}
//			}
//			System.out.println();
//		}
		
//		int[] arr1 = {10, 20, 30};
//		System.out.println("Arr1 : "+arr1);
		
	/*	int[][] arr = {
				//		j=0  j=1 j=2
						{1,	 2,	 3},  // i = 0
						{4,	 5,	 6},  // i = 1
						{7,	 8,	 9},  // i = 2
				      };
	*/				      
		
//		System.out.println(arr[2][1]);
		
//		System.out.println("Arr : "+arr);
		
		

	}
}

//  i == j || i+j == n+1
// i == (n+1)/2 || j == (n+1)/2
//  (i == (n+1)/2 && j == (n+1)/2) 
// i == 2 || i == n - 1 || j == 2 || j == n - 1
