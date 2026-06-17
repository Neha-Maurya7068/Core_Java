package constructor1;

public class Employee {

	int id;
	String name;
	double salary;

	// Constructor Chaining
	// Copy Constructor

	// // Constructor Chaining ****************

	Employee() {
		System.out.println("Object Created !!");
	}

	Employee(int id) {
		this();
		System.out.println("ID Constructor");
		this.id = id;
	}

	Employee(int id, String name) {
		this(id);
		System.out.println("ID, Name Constructor");
		this.name = name;
	}

	Employee(int id, String name, double salary) {
		this(id, name);
		System.out.println("ID, Name, Salary Constructor");
		this.salary = salary;
	}

	// // Copy Constructor *********************

	Employee(Employee emp) {
		id = emp.id;
		name = emp.name;
		salary = emp.salary;
	}

	// Display Method !!

	void display() {
		System.out.println("ID : " + id);
		System.out.println("Name : " + name);
		System.out.println("Salary : " + salary);

	}

}
