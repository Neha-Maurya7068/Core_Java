import java.util.Scanner;

public class CheckEvenOddInput {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number (1 to 10): ");
        int num = sc.nextInt();

        // Check number range
        if(num >= 1 && num <= 10) {

            // Even–Odd check
            if(num % 2 == 0) {
                System.out.println(num + " is Even");
            } else {
                System.out.println(num + " is Odd");
            }

        }

        sc.close();
    }
}
