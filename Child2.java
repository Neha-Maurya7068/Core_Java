package typecasting;

public class Child extends Parent{

	@Override
	void eat() {
		System.out.println("Child Only Eats But Do Nothing !!");
	}
	
	@Override
	void earn() {
		System.out.println("Child Earn 0 rs per Month !!");
	}
}
