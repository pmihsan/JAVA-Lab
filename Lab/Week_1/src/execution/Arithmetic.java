package execution;

import java.util.Scanner;

public class Arithmetic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter two numbers");
		int a = in.nextInt();
		int b = in.nextInt();
		
		// Arithmetic
		System.out.println("Addtion of " + a + " and " + b + " is " + (a+b));
		System.out.println("Subtraction of " + a + " and " + b + " is " + (a-b));
		System.out.println("Multiplication of " + a + " and " + b + " is " + (a*b));
		System.out.println("Division of " + a + " and " + b + " is " + ((float)a/b));
		
		in.close();
	}

}
