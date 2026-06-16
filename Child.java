package inheritance;

public class Child extends Parent {

	int c = 30;
	int sum = a + b + c;

	public void demo() {

		System.out.println("This Is Child Class Demo Method");

		System.out.println("*************************************");

		test(); // From Parent Class************
		System.out.println("*************************************");
		getData(); // From Grand Parent *******

		System.out.println("*************************************");
		
		System.out.println("Sum From Child : " + sum);

		System.out.println("From Child Value Of A : " + a);
		System.out.println("From Child Value Of B : " + b);
		System.out.println("From Child Value Of C : " + c);
	}

}
