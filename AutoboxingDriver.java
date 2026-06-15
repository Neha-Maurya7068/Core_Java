package typecasting;

public class AutoboxingDriver {

	public static void main(String[] args) {

//		Child c1 = new Child();	
//		c1.earn();
//		c1.eat();

//		Parent p1 = new Parent();
//		p1.earn();
//		p1.eat();

		// Upcasting *************

//		Parent p1 = new Child();
//		p1.earn();
//		p1.eat();

		// Downcasting ***********

//		Parent p1 = new Parent();
//		System.out.println(p1);
//		Child c1 = (Child) p1;    // ClassCastException **
//		c1.earn();
//		c1.eat();

		
		
		Parent p1 = new Child();
		Child c1 = (Child) p1;

		c1.earn();
		c1.eat();

	}

}
