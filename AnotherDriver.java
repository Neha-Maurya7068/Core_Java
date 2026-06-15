package access_modifires_another;

import access_modifires.Modifires;

public class AnotherDriver {
	
	public static void main(String[] args) {
		
		Modifires m1 = new Modifires();
		
		System.out.println("Public A : "+m1.a);
		
//		System.out.println("Protected B : "+m1.b);
		
//		System.out.println("Default C : "+m1.c);
//		System.out.println("Private D : "+m1.d);s
		
		Another a2 = new Another();
		
		a2.getData();
		
		
	}

}
