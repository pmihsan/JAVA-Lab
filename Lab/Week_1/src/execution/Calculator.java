package execution;

import java.util.Scanner;
public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter two numbers");
		float a = in.nextFloat();
		float b = in.nextFloat();
		
		System.out.println("Enter Operation (+,-,*,/,%,^)");
		char ch = in.next().charAt(0);
		
		switch(ch){
		case '+':
			System.out.println("Addtion:");
			System.out.println("Result " + (a + b));
			break;
		case '-':
			System.out.println("Subtraction:");
			System.out.println("Result " + (a - b));
			break;
		case '*':
			System.out.println("Multiplication:");
			System.out.println("Result " + (a * b));
			break;
		case '/':
			System.out.println("Division:");
			System.out.println("Result " + (a / b));
			break;
		case '%':
			System.out.println("Modulo:");
			System.out.println("Result " + (a % b));
			break;
		case '^':
			System.out.println("Power:");
			System.out.println("Result " + Math.pow(a,b));
			break;
		default:
			System.out.println("Invalid OPERATION");
			break;
		}
		
		in.close();
	}

}
