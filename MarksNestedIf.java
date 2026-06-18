  public class MarksNestedIf{
  
  public static void main(String[]args){
    

    int mark = 70;
    
    if(mark <= 100 && mark >= 80){
     
   if(mark <= 100 && mark >= 90){
    
    System.out.println("Grade A");

      }
     else {

      System.out.println("Grade B");

     }
   System.out.println("First Division");

    }

     else if (mark < 80 && mark >= 60){
     
     if(mark < 80 && mark >= 70) {

                System.out.println("Grade: C");
            } 
             else {
 
                System.out.println("Grade: D");
         }
      System.out.println("Second Division");
       }
     
     else if (mark < 60 && mark >= 40) {


            if(mark < 60 && mark >= 50) {

                System.out.println("Grade: E");

            } else { 

                System.out.println("Grade: F");
            }

            System.out.println("Third Division");

            }

           else if (mark < 40 && mark >= 0) {

            System.out.println("Fail !!");

            System.out.println("Division: No Division");

        } else {

            System.out.println("Invalid Marks !! Enter between 0 to 100.");
        }

   }
   
   }