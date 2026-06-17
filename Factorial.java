package methods;

public class Factorial {

	// Factorial ******************

//	public void getFactorial(int n) {
//
//		int fact = 1;
//
//		for (int i = 1; i <= n; i++) {
//
//			fact = fact * i;
//
//		}
//		System.out.println("Factorial Of " + n + " Is : " + fact);
//	}

	// Prime Number ******************

	public void getPrimeNumber(int n) {

		int count = 0;
		int i = 2;

		while (i <= n / 2) {

			if (n % i == 0) {
				count++;
				break;
			}
			i++;
		}

		if (count == 0) {
			System.out.println(n + " Is a Prime Number !!");
		} else {
			System.out.println(n + " Is Not a Prime Number !!");
		}

	}

}
