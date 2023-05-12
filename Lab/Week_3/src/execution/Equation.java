package execution;

import java.util.Scanner;
public class Equation {
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter a,b,c,d,e,f");
		double a,b,c,d,e,f;
		a = in.nextDouble();
		b = in.nextDouble();
		c = in.nextDouble();
		
		d = in.nextDouble();
		e = in.nextDouble();
		f = in.nextDouble();
		
		// User Input
		LinearEquation eq = new LinearEquation(a,b,c,d,e,f); 
		System.out.println("EQUATION 1:");
		if(eq.isSolvable()){
			System.out.println("X value: " + eq.getX());
			System.out.println("Y value: " + eq.getY());
		}
		System.out.println();
		
		// Sample Cases
		// 3x + 4y = 12; 3x + 4y = 20;
		LinearEquation le = new LinearEquation(3, 4, 3, 4, 12, 20); 
		System.out.println("EQUATION 2:");
		if(le.isSolvable()){
			System.out.println("X value: " + le.getX());
			System.out.println("Y value: " + le.getY());
		}
		System.out.println();
		
		// 3x + 2y = 9; 1x + 5y = 7;
		LinearEquation eq1 = new LinearEquation(3, 2, 1, 5, 9, 7); 
		System.out.println("EQUATION 3:");
		if(eq1.isSolvable()){
			System.out.println("X value: " + eq1.getX());
			System.out.println("Y value: " + eq1.getY());
		}
		System.out.println();
		
		in.close();
	}
}
