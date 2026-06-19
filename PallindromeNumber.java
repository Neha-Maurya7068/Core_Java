package methods_returntype;

import java.util.Scanner;

public class PallindromeNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter The Number : ");
		int n = sc.nextInt();
		
		if(checkPallindrome(n)) {
			System.out.println(n+" Is Pallindrome Number !!");
		}
		else {
			System.out.println(n+" Is Not a Pallindrome Number !!");
		}
	}
	

	public static boolean checkPallindrome(int n) {
		
		int temp = n;
		int rev = 0;
		
		while(n > 0) {
			int rem = n % 10;
			rev = ( rev * 10 ) +rem ;
			n = n / 10;
		}
		return rev == temp;
	
	}
}
