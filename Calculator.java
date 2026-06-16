import java.util.Scanner;

class Calculator {
    public static void main(String[] args) {

  Scanner sc = new Scanner(System.in);

   System.out.print("Enter 1st Number: ");
     int a = sc.nextInt();

   System.out.print("Enter 2nd Number: ");
        int b = sc.nextInt();

   System.out.println("Enter Operator (+, -, *, /, %): ");
   char op = sc.next().charAt(0);

    switch(op) {

       case '+':
      System.out.println("Addition: " + (a + b));
                break;

      case '-':
       System.out.println("Subtraction: " + (a - b));
                break;

      case '*':
      System.out.println("Multiplication: " + (a * b));
                break;

     case '/':
      if (b != 0)
       System.out.println("Division: " + (a / b));
         else
      System.out.println("Infinity");
        break;

      case '%':
        System.out.println("Modulus: " + (a % b));
         break;

       default:
       System.out.println("Invalid Operator");
    }

    sc.close();
    }
}