package methods;

public class Method {

	/*
	 * Methods :-
	 * 
	 * Modifiers :- |-> Access Modifiers eg :- public , private ... |->Non-Access
	 * Modifiers eg :- static , abstract ...
	 * 
	 * Access Modifiers :- public Non-Access Modifiers:- static return type :- void
	 * method Name :- (Camel Case Letter) getSum Parameter :- () Method Body / Block
	 * :- { }
	 * 
	 * method Name + Parameter = Method Signature (:-> getSum() , getSum(int a, int
	 * b) <-:) Modifiers + Method Signature = Method Deceleration (:-> public static
	 * void getSum() <-:)
	 * 
	 * Method Deceleration + Method Body / Block :- (:-> public static void getSum()
	 * { .... } <-:)
	 * 
	 * Method Types :- (i) No-Args Method ( getSum() ) (i) Parameterized Method (
	 * getSum(int a, int b) )
	 * 
	 * Argument :- (i) Formal Argument eg:- public static void getSum(int a, int b)
	 * (ii) Actual Argument eg:- getSum(); , getSum(20, 30);
	 * 
	 * 
	 * Binding = Formal Argument == Actual Argument
	 * 
	 */

	// No-Args Method **
	// getSum Method

	public static void getSum() {

		System.out.println("No-Args Method ");
		int a = 10;
		int b = 20;

		int sum = a + b;

		System.out.println("Sum Is : " + sum);

	}

	// Parameterized Method **

	public static void getSum(int a, int b) {
		System.out.println("Parameterized Method ");
		int sum = a + b;
		
		System.out.println("Sum Is : "+sum);
	
	}

//	static public void getSum(int a, int b) {
//		System.out.println("Parameterized Method ");
//		int sum = a + b;
//
//		System.out.println("Sum Is : " + sum);
//
//	}

	public static void main(String[] args) {
		System.out.println("Main Method Starts...");

		getSum();

		int a = 50;
		int b = 90;

		// getSum(20, 30);

		getSum(a, b);

		System.out.println("Main Method Ends...");
	}

}
