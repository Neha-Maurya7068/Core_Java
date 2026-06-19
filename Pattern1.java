package loop;

public class Pattern {

	public static void main(String[] args) {

//		int n = 5;
//		
//		for(int i = 1; i <= n; i++) {
//			
//			for(int j = 1; j <= n; j++) {
//				System.out.print("* ");
//			}
//			System.out.println();
//		}
		
		
		// (i == 1 || i == n || j == 1 || j == n || i == j || i+j == n+1)
		// (i == 1 || i == n || j == 1 || j == n ||  i == j || i+j == n+1 || (n+1) / 2 == i || (n+1) / 2 == j)
// (i == 1 || i == n || j == 1 || j == n || i == 2 || i == n - 1 || j == 2 || j == n - 1 || ((n+1) / 2 == i && (n+1) / 2 == j))
		int n = 11;

		for (int i = 1; i <= n; i++) {

			for (int j = 1; j <= n; j++) {
				if (i == 1 || i == n || j == 1 || j == n || i == 2 || i == n - 1 || j == 2 || j == n - 1 || ((n+1) / 2 == i && (n+1) / 2 == j)) {
					System.out.print("* ");
				} else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		
		
		// Check Number Is Prime Number
		// Perfect Number 
		// superspy number
		// Fibonacii series
		// Armstrong Number
		// Strong Number
		// Sum Of Digits 
		

	}

}
