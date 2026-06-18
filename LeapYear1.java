class LeapYear {

	public static void main(String[] args){

		int year = 2026;

		if(year % 100 != 0){
			System.out.println(year+" Is Normal Year !!");

			if(year % 4 == 0){
				System.out.println(year+" Is Leap Year !!");
			}else{
				System.out.println(year+" Is Not a Leap Year !!");
			}
		}
		else{
			System.out.println(year+" Is Century Year !!");

			if(year % 400 == 0){
				System.out.println(year+" Is Leap Year !!");
			}else{
				System.out.println(year+" Is Not a Leap Year !!");
			}

		}

      }

}