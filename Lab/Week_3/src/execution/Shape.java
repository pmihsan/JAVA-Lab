package execution;

import java.util.Scanner;

public class Shape {
	public static void main(String[] args){
		
		Scanner in = new Scanner(System.in);
		System.out.println("Enter width and height");
		double w = in.nextDouble();
		double h = in.nextDouble();
		
		// User Input 
		Rectangle rect = new Rectangle(w, h);
		System.out.println("Default values " + rect.width + " " + rect.height);
		System.out.println("Perimeter " + rect.getPerimeter());
		System.out.println("Area " + rect.getArea());
		System.out.println();
		
		
		// Sample Cases
		Rectangle rt1 = new Rectangle();
		System.out.println("Default values " + rt1.width + " " + rt1.height);
		System.out.println("Perimeter " + rt1.getPerimeter());
		System.out.println("Area " + rt1.getArea());
		System.out.println();
		
		Rectangle rt2 = new Rectangle(4, 40);
		System.out.println("Rectangle values " + rt2.width + " " + rt2.height);
		System.out.println("Perimeter " + rt2.getPerimeter());
		System.out.println("Area " + rt2.getArea());
		System.out.println();
		
		Rectangle rt3 = new Rectangle(3.5, 35.9);
		System.out.println("Rectangle values " + rt3.width + " " + rt3.height);
		System.out.println("Perimeter " + rt3.getPerimeter());
		System.out.println("Area " + rt3.getArea());
		
		in.close();
	}
}
