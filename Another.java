package access_modifires_another;

import access_modifires.Modifires;

public class Another extends Modifires{
	
	void getData(){
		System.out.println("Get Data Method");
		System.out.println("Protected B : "+ b);
	}
	
	public static void main(String[] args) {
		
		Another a1 = new Another();
		
//		System.out.println("Protected B : "+ a1.b);
		
		a1.getData();
	}
	

}
