package observation;

import java.util.Scanner;

public class Armstrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter a number");
		int n = in.nextInt();
		
		int c = 0,temp = n, last = 0, sum = 0;
		
		while(temp > 0){
			temp /= 10;
			c++;
		}
		temp = n;
		while(temp > 0){
			last = temp % 10;
			sum += (Math.pow(last, c));
			temp /= 10;
		}
		if(sum == n){
			System.out.println("Armstrong Number");
		}
		else{
			System.out.println("Not an Armstrong Number");
		}
		
		in.close();
	}

}
