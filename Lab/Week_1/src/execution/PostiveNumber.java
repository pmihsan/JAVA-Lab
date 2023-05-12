package execution;

import java.util.Scanner;
public class PostiveNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter a 5 digit positive number");
		int n = in.nextInt();
		
		System.out.println("Each Digit of " + n);
		int temp = n;
		
		temp /= 10000;
		System.out.println(temp % 10);
		temp = n;
		temp /= 1000;
		System.out.println(temp % 10);
		temp = n;
		temp /= 100;
		System.out.println(temp % 10);
		temp = n;
		temp /= 10;
		System.out.println(temp % 10);
		temp = n;
		System.out.println(temp % 10);
		
		in.close();
	}

}
