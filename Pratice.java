package interfaces;

public interface Pratice {

}

// Single Level ************

interface A{
	int a = 10;
}

interface B extends A{
	int b = 20;
	
	int sum_b = a + b;
}

// Multilevel *********

interface C{
	int c = 30;
}

interface D extends C{
	int d = 40;
}

interface E extends D{
	int e = 50;
	int sum_d = c + d + e;
}

class F implements B , E {
	
	public void getData() {
		System.out.println("Sum Of Single Level : "+ sum_b);
		System.out.println("Sum Of MultiLevel : "+ sum_d);
		
		int total_sum = sum_b + sum_d;
		
		System.out.println("Total Sum Is : "+total_sum);
	}
	
}

class DriverAll{
	public static void main(String[] args) {
		
		F f1 = new F();
		
		f1.getData();
	}
}
