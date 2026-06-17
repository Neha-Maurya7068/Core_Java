package encapsulation;

public class EmployeeDriver {

	public static void main(String[] args) {
		
		Employee e1 = new Employee();
		
// 	//	System.out.println("ID : "+e1.id);
//	//	System.out.println("ID : "+e1.getId());
		
		e1.setID(101);
		System.out.println("ID : "+e1.getId());
		

		e1.setName("Akansha");
		System.out.println("Name : "+e1.getName());

	
//		System.out.println("password : "+e1.pwd);
//		System.out.println("password : "+e1.getPwd());
		
		e1.setSalary(35000.00);
		System.out.println("Salary : "+e1.getSalary());
		
		
		
	}
}
