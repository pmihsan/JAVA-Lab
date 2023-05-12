package observation;

import java.util.Scanner;

public class Prime {

	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		System.out.println("Enter n");
		int n = in.nextInt();
		
		if(isPrime(n)){
			System.out.println("PRIME");
		}
		else{
			System.out.println("NOT PRIME");
		}
		in.close();
	}
	
	public static boolean isPrime(int n){
		for(int i=2;i*i<n;i++){
			if(n % i == 0){
				return false;
			}
		}
		return true;
	}
}
