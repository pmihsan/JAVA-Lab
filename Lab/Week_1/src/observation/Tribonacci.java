package observation;

import java.util.Scanner;

public class Tribonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter a number");
		int n = in.nextInt();
		
		System.out.println("Tribonacci Series");
		int a = 0, b = 1, c = 1, d = a + b + c;
		
		System.out.print(a + " " + b + " " + c + " " );
		for(int i=4;i<=n;i++){
			System.out.print(d + " ");
			a = b;
			b = c;
			c = d;
			d = a + b + c;
		}
		in.close();
	}

}
