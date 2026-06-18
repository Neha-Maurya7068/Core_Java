package methods;

public class MethodDriver {
	
	public static void main(String[] args) {
		
		Static_NonStatic.getSum(100, 200);
		
		Static_NonStatic sn1 = new Static_NonStatic();
		
		sn1.getSum(100, 200, 200);
		
		sn1.getSum(70, 40);
		
	}

}
