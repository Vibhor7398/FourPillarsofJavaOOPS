package inheritance;

public class Staticeg {

	static int x, y, z;

	static {
		System.out.println("Entered static");
		x = 10;
		y = 20;
	}

	Staticeg() {
		System.out.println("Entered Constructor");
	}

	void display() {
		System.out.println(z);
	}

	public static void main(String[] args) {
		z = x + y;
		Staticeg s = new Staticeg();
		s.display();

	}

}
