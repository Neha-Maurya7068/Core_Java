package inheritance;

public class AnimalDriver {

	public static void main(String[] args) {

		Animal a1 = new Animal();

		a1.eat();
		a1.sound();

		System.out.println("============================");

		Dog d1 = new Dog();

		d1.eat();
		d1.sound();
		d1.run();

		System.out.println("============================");
		
		Cat c1 = new Cat();

		c1.eat();
		c1.sound();
		c1.jump();
		
		

	}

}
