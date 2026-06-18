 public class LeapYear{
 
 public static void main(String[]args){

  int year = 3400;

  String result = (year % 100 !=0 && year % 4 == 0) || (year % 400 == 0)?
  
 "Leap Year" : "Not a Leap year";
 
  System.out.println(result);

}
}


