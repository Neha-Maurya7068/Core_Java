package constructor;

public class EmployeeDriver {

	public static void main(String[] args) {

		Employee e1 = new Employee();
		e1.display();

		System.out.println("==========================");

		Employee e2 = new Employee(101);
		e2.display();

		System.out.println("==========================");

		Employee e3 = new Employee("Akansha");
		e3.display();

		System.out.println("==========================");

		Employee e4 = new Employee(25000.0);
		e4.display();
		
		System.out.println("==========================");

		Employee e5 = new Employee(102, "Neha" , 55000.0);
		e5.display();

		Employee e0 = new Employee(102, "Neha");
		e0.display();

		System.out.println("==============================");

		Employee e6 = new Employee("Akansha", 104);
		e6.display();

		System.out.println("==============================");

		Employee e7 = new Employee("Akansha", 10000.00);
		e7.display();
		
		System.out.println("==============================");

		Employee e8 = new Employee(25000.00,"Akansha");
		e8.display();

		
		System.out.println("==============================");

		Employee e9 = new Employee(105,25000.00);
		e9.display();

		
		System.out.println("==============================");

		Employee e10 = new Employee(106,"Akshit",25000.00);
		e10.display();
		
		System.out.println("==============================");

		Employee e11 = new Employee("Akshit",107,25000.00);
		e11.display();
		
		System.out.println("==============================");

		Employee e12 = new Employee("Akshit",25000.00, 108);
		e12.display();

	}

}
