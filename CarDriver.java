package oops;

public class CarDriver {
	
	public static void main(String[] args) {
		
		Car c1 = new Car();
		
		System.out.println(c1);
		
		c1.start();	
		c1.stop();
		
		System.out.println("=====================");
		
		Car c2 = new Car();
		
		System.out.println(c2);
		
		c2.start();
		c2.start();
		
		
		
	}

}
