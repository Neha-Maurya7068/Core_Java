package loop;

import java.util.Scanner;

public class DoWhileLoop {

	public static void main(String[] args) {

		/*
		 * Syntax :-
		 * 
		 * initialization; do{
		 * 
		 * statements
		 * 
		 * inc/dec }while(condition);
		 * 
		 */

//		int i = 6;
//		while(i <= 5) {                             // i <= 5 => 6 <= 5 = False
//			System.out.println(i);
//			i++;
//		}
//		

//		int i = 6;
//		do {
//			System.out.println(i);   // 6
//			i++;
////			System.out.println(i);   // 7
//		}while(i <= 5);

//		Scanner sc = new Scanner(System.in);
//		
//		System.out.println("Welcome To Game zone !!");
//		System.out.println("Game Starts Now !!");
//		char choice;
//		do {
//			System.out.println("Game Is In Progress !!");
//			
//			System.out.println("Do You Want To Play Again Then Press Y/y and  For Quit Press any Character !! ");
//			choice = sc.next().charAt(0);
//			
//		}while(choice == 'Y' || choice == 'y');
//		
//		System.out.println("Game Over !!");

		// Calculator Game !! *************************

		Scanner sc = new Scanner(System.in);

		System.out.println("Game Starts *********");
		System.out.println("Calculator Open Sucessfully !! ");

		char choice;

		do {

			System.out.println("Calculation is in progress......");
			System.out.println("choose operator (+,-,* , % Or /) ");
			char operator = sc.next().charAt(0);

			System.out.println("Enter first number :");
			int a = sc.nextInt();

			System.out.println("Enter second number :");
			int b = sc.nextInt();

			int result;

			switch (operator) {
			case '+':
				result = a + b;
				System.out.println("Addition : " + result);

				break;
			case '-':
				result = a - b;
				System.out.println("Substraction : " + result);

				break;

			case '*':
				result = a * b;
				System.out.println("Multiplication : " + result);
				break;

			case '%':
				result = a % b;
				System.out.println("Remender : " + result);
				break;

			case '/':
				if (b != 0) {
					result = a / b;
					System.out.println("Division : " + result);

				} else {
					System.out.println("If You Divide Any Number With Zero Then Answer Is :-> Infinity");

				}

				break;

			default:
				System.out.println("Invalid Operation !!!!! ");

			}

			System.out.println(
					"Do You Want To Continue The Calculation ? (If yes then Press Y / y otherwise other character !!)");

			choice = sc.next().charAt(0);

		} while (choice == 'Y' || choice == 'y');

		System.out.println("Calculator Closed Sucessfully !!");

		System.out.println("Game Over ***********");
		System.out.println("Thanks For Visit !!");

	}

}
