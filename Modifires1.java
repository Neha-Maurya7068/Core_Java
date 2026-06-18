package access_modifires;

public class Modifires {
	
	public int a = 10;
	protected int b = 20;
	   int c = 30;
	private int d = 40;
	
	
	
	public static void main(String[] args) {
		
		Modifires m1 = new Modifires();
		
		System.out.println("Public A : "+m1.a);
		System.out.println("Protected B : "+m1.b);
		System.out.println("Defult C : "+m1.c);
		System.out.println("Private D : "+m1.d);
		
	}
	

}
