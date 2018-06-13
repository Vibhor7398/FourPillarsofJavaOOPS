package inheritance;

class Animal {
	
	void speak()
	{
		System.out.println("All animals have different voice.");
	}
}
class Dog extends Animal{
	void speak()
	{
		System.out.println("A dog barks.");
	}
}

class Cat extends Animal{
	void speak()
	{
		System.out.println("A cat purrs and also meows.");
	}
}

public class AnimalQues {

	public static void main(String[] args) {
		Animal a = new Animal();
		Animal d = new Dog();
		Animal c = new Cat();
		a.speak();
		d.speak();
		c.speak();

	}

}
