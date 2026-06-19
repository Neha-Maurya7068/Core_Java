package polymorphism;

public class OverloadingDriver {

	public static void main(String[] args) {

		Program1 p1 = new Program1();

		System.out.println(p1.getSum());

		System.out.println(p1.getSum(10, 20));
		System.out.println(p1.getSum(10, 20.0));
		System.out.println(p1.getSum(10.0, 20));
		System.out.println(p1.getSum(10.0, 20.0));

		System.out.println(p1.getSum(10, 20, 30));
		System.out.println(p1.getSum(10, 20, 30.0));
		System.out.println(p1.getSum(10, 20.0, 30));
		System.out.println(p1.getSum(10.0, 20, 30));

		System.out.println(p1.getSum(10, 20.0, 30.0));
		System.out.println(p1.getSum(10.0, 20.0, 30));
		System.out.println(p1.getSum(10.0, 20.0, 30.0));
		System.out.println(p1.getSum(10.0, 20, 30.0));

	}

}
