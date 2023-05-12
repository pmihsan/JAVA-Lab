package spot;

import java.util.Scanner;
public class ReverseNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter a number");
		int n = in.nextInt();
		
		int temp = n;
		int last = 0, rev1 = 0;
		while(temp > 0){
			last = temp % 10;
			rev1 = (rev1 * 10) + last;
			temp /= 10;
		}
		System.out.println("Using While Loop the reversed number is " + rev1);
		
		last = 0;
		temp = n;
		int rev2 = 0;
		do {
			last = temp % 10;
			rev2 = rev2 * 10 + last;
			temp /= 10;
		}while(temp > 0);
		
		System.out.println("Using Do-While Loop the reversed number is " + rev2);
		in.close();

	}

}
