package oops;

public class EmployeeDriver {

	public static void main(String[] args) {

		Employee e1 = new Employee();

		e1.lunch();
		e1.presentation();
		e1.task();

		System.out.println("=================");

		Employee e2= new Employee();
		
		e2.presentation();
		e2.task();

		
	}

}
