package encapsulation;

import java.util.Scanner;

public class Employee {

	private int id;
	private String name;
	private double salary;
	private int pwd = 12345;

	// getter **********************************

	public int getId() {
		// validation
		return id;
	}

	public String getName() {
		// validation
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Password !!");

		int upwd = sc.nextInt();

		if (pwd == upwd) {
			System.out.println("Your Password Matched Sucessfull !!");
			return name;
		} else {
			System.out.println("Your Password Is InCorrect !!");
			return null;
		}
		
	}

	public double getSalary() {
		// validation
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter Password !!");
//
//		int upwd = sc.nextInt();
//
//		if (pwd == upwd) {
//			System.out.println("Your Password Matched Sucessfull !!");
//			return salary;
//		} else {
//			System.out.println("Your Password Is InCorrect !!");
//			return 0;
//		}
		
		return salary;
	}

	// setter ***********************************

	public void setID(int id) {
		// validation
		this.id = id;
	}

	public void setName(String name) {
		// validation
		this.name = name;
	}

	public void setSalary(double salary) {
		// validation
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Password !!");

		int upwd = sc.nextInt();

		if (pwd == upwd) {
			System.out.println("Your Password Matched Sucessfull Data Saved Sucessfully !!");
			this.salary = salary;
			
		} else {
			System.out.println("Your Password Is InCorrect Data Not Saved !!");
		}
		
	}

}
