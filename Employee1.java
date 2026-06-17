package constructor;

public class Employee {

	int id;
	String name;
	double salary;

	// Default Constructor **
	// No-Args Constructor **

	/*
	 * OverLoading :- **
	 *  (i) Change No of Parameter
	 *  (ii) Changing The DataType 
	 *  (iii) Changing The Sequences
	 */

	Employee() {
		System.out.println("No-Args Constructor !!");
	}

	// Parameterized constructor **

	/*
	 * Employee(int i){
	 *  System.out.println("Parameterized constructor !!"); 
	 * 		id = i;
	 * }
	 */

	Employee(int id) {
		System.out.println("Parameterized constructor !!");
		this.id = id;
	}

	Employee(String name) {
		this.name = name;
	}

	Employee(double salary) {
		this.salary = salary;
	}

	Employee(int id, String name) {
		this.id = id;
		this.name = name;
	}

	Employee(String name, int id) {
		this.name = name;
		this.id = id;
	}

	Employee(String name, double salary) {
		this.name = name;
		this.salary = salary;
	}

	Employee(double salary, String name) {
		this.name = name;
		this.salary = salary;
	}

	Employee(int id, double salary) {
		this.id = id;
		this.salary = salary;
	}

	Employee(double salary, int id) {
		this.id = id;
		this.salary = salary;
	}

	Employee(int id, String name, double salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	Employee(String name, int id, double salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	Employee(String name, double salary, int id) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	Employee(double salary, String name, int id) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	
	// Display Method **

	void display() {
		System.out.println("ID : " + id);
		System.out.println("Name : " + name);
		System.out.println("Salary : " + salary);
	}
	
}
