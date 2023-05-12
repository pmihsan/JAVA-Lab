package execution;

import java.util.Scanner;

public class Rectangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter length and width");
		double l = in.nextDouble();
		double w = in.nextDouble();
		
		// Area and Perimeter of Rectangle
		System.out.println("Area of Rectangle " + (l * w));
		System.out.println("Perimeter of rectangle " + (2 * (l + w)));
		
		in.close();
	}

}
