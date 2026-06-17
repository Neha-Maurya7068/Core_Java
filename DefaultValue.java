class DefaultValue{

	byte a;
	short b;
	int c;
	long d;	

	float e;
	double f;

	boolean g;

	char ch;
	

	public static void main(String[] args){	

		DefaultValue d1 = new DefaultValue();

		System.out.println("Integer Value");

		System.out.println("Byte : "+d1.a);
		System.out.println("Short : "+d1.b);
		System.out.println("Int : "+d1.c);
		System.out.println("Long : "+d1.d);

		System.out.println("Floting Value");

		System.out.println("Float : "+d1.e);
		System.out.println("Double : "+d1.f);

		System.out.println("Boolean Value");

		System.out.println("Boolean : "+d1.g);

		System.out.println("Character Value");

		System.out.println("Char : "+d1.ch);  // '\u0000'

		
		

	}

}