package methods;

public class Static_NonStatic {
	
	
	// Static Method **
	
	public static void getSum(int a, int b) {
		System.out.println("Parameterized Static Method ");
		int sum = a + b;
		
		System.out.println("Sum Is : "+sum);
	
	}
	
	// Non-Static Method **
	
	public void getSum(int a, int b, int c) {
		System.out.println("Parameterized Non-Static Method ");
		int sum = a + b + c;
		
		System.out.println("Sum Is : "+sum);
	       
	}

	
	public static void main(String[] args) {
		System.out.println("Main Method Starts...");

		int a = 50;
		int b = 90;
		int c = 10;

		// getSum(20, 30);

		getSum(a, b);
		
		Static_NonStatic sn = new Static_NonStatic();
		sn.getSum(a, b , c);

		System.out.println("Main Method Ends...");
	}


}
