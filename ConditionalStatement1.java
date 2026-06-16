class ConditionalStatement {

	public static void main (String[] args){

	/*
	int age = 19;

	if(age >= 18){
	    System.out.println("You can Vote !!");

	}
	*/

	/*

	int age = 17;

	if(age >= 18){
	    System.out.println("You can Vote !!");

	}else{
	 System.out.println("You Can't Vote !!");

	 }
	*/

	/*

	int age = 17;

	if(age >= 18)
	    System.out.println("You can Vote !!");

	else
	 System.out.println("You Can't Vote !!");

	 */

	/*

	int age = 17;

	if(age >= 18)
	    System.out.println("You can Vote !!");
	
	else
	 System.out.println("You Can't Vote !!");
	*/

	/*
	int marks = 17;
	
	if(marks < 0 || marks > 100){
	System.out.println("Invalid Marks !!");
	}
	else if(marks > 90){
	 System.out.println("Grade : A");
	}
	else if(marks > 80){
        System.out.println("Grade : B");
	}
	else if(marks > 70){
        System.out.println("Grade : C");
	}
	else if(marks > 60){
        System.out.println("Grade : D");
	}
	else{
	 System.out.println("Fail !!");
	}
	*/

	/*
	int n = -27;

	if(n > 0){
		 System.out.println("Number Is Positive!!");

		if(n % 2 == 0){
		 System.out.println("Positive Even Number!!");
		  }
		else{
		 System.out.println("Positive Odd Number!!");
		  }
	}
	else{
		 System.out.println("Number Is Negative!!");

		if(n % 2 == 0){
		 System.out.println("Negative Even Number!!");
		  }
		else{
		 System.out.println("Negative Odd Number!!");
		  }
	
	}
	

*/


	int marks = 47;
	if(marks < 0 || marks > 100){
		System.out.println("Invalid Marks !!");
	}
	else if(marks > 80){
		System.out.println("First Division !!");
		if(marks > 90){
	 		System.out.println("Grade : A");
		}else{
			System.out.println("Grade : B");
		}
	}
	else if(marks > 60){
        	System.out.println("Second Division !!");
		if(marks > 70){
	 		System.out.println("Grade : C");
		}else{
			System.out.println("Grade : D");
		}
	}
	else if(marks > 40){
		System.out.println("Third Division !!");
		if(marks > 50){
	 		System.out.println("Grade : E");
		}else{
			System.out.println("Grade : F");
		}
        }
	else{
		System.out.println("Fail !!");
	}


	
		
   }
}