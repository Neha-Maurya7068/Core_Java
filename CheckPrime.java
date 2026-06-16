package methods_returntype;
import java.util.Scanner;
public class CheckPrime {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter The Number : ");
		int n = sc.nextInt();
		int c = getPrime(n);
		
		if(c == 0) {
			System.out.println(n +" Is Prime Number");
		}
		else {
			System.out.println(n +" Is Not Prime Number");
		}
	}

	public static int getPrime(int n) {

		int count = 0;
		for (int i = 2; i <= n/2; i++) {

			if (n % i == 0) {
				count++;
				break;
			}
		}
		return count;
	}

}
