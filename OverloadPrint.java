package inheritance;

import java.util.Scanner;

public class OverloadPrint {
	
	static void print()
	{
		System.out.println("This function contains no arguments");
	}
	
	static void print(int n)
	{
		System.out.println("This function has an integer as argument. In thise case: " + n);
	}
	
	static void print(int x, int y)
	{
		System.out.println("THis function takes 2 integers as arguments. Here their value is " + x + " and " + y);
	}

	public static void main(String[] args) {
		int a,b;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter 2 numbers: ");
		a = s.nextInt();
		b = s.nextInt();
		print();
		print(a);
		print(a,b);
	}

}
