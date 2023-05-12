package observation;

import java.util.Scanner;

public class GCD {
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		System.out.println("Enter x and y");
		int x = in.nextInt();
		int y = in.nextInt();
		System.out.println("GCD of " + x + " and " + y + " is " + gcd(x,y));
		in.close();
	}
	
	public static int gcd(int x, int y){
		while(x != y){
			if(x > y) x = x - y;
			else y = y - x;
		}
		return y;
	}

}
