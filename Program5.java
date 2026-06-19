package polymorphism;

public class Program2 {
	
	public static void main(String name) {
		System.out.println("Main Name Method : \n Name Is : "+name);
	}

	
	public static void main(int age) {
		System.out.println("Main Age Method : \n Age Is : "+age);
	}
	
	public static void main() {
		System.out.println("Main Method : \n Hello World !!");
	}
	
	public static void main(String[] args) {
		System.out.println("Main Method Starts");
		main();
		main("Shyam");
		main(20);
		System.out.println("Main Method Ends");
	}
}
