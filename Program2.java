package package_2;



public class Program2 {
	
	int b = 50;
	
	
	
	public void getData1(){
		System.out.println("This is Package 2 Data");
		
	}
	
	public static void main(String[] args) {
		
		Program2 p2 = new Program2();
		
		System.out.println(p2.b);
		p2.getData1();
		
		System.out.println(package_1.Program1.a);
		
	
	
		
		
	}

}
