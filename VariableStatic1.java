class VariableStatic {

		// Global *****

		// (i) Static Variable **

			static int a = 10;
	
	public static void main(String[] args){
		
			// Local Variable **

			int b = 20;
			int a = 30;

		System.out.println("Local : "+a);  // 30

		System.out.println("Static : "+ VariableStatic.a);  // 10

		System.out.println(b);  // 20

		
	}

}