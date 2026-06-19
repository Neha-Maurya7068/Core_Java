package inheritance;

public class Parent extends GrandParent {

	int b = 20;
	int sum1 = a + b;

	public void test() {
		System.out.println("This is Parent Class Test Method");
		System.out.println("Sum From Parent : " + sum1);

		getData(); // From Grand Parent *******

		System.out.println("From Parent Value Of A : " + a);
		System.out.println("From Parent Value Of B : " + b);
	}

}
