  public class CalculatorOperation{
  
  public static void main(String[]args){

  int a = 20;
  
  int b = 10;
  
  String calculator = "+";
  
  switch(calculator){
  
  case "+" : 
  
  int sum = a + b;
  
  System.out.println(sum);
  
  break;


   case "-" : 
  
  int sub = a - b;
  
  System.out.println(sub);
  
  break;


   case "*" : 
  
  int mul = a * b;
  
  System.out.println(mul);
  
  break;

   case "/" : 
  
  int div = a / b;
  
  System.out.println(div);
  
  break;

  
   case  "%" :
  
  int mod = a % b;
  
  System.out.println(mod);
  
  break;
  
  default:
   
  System.out.println("Invalid Operation");
   
  }

  }
  }