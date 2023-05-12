package spot;

import java.util.Scanner;
import java.util.InputMismatchException;

public class RationalMain {
	public static void main(String[] args) throws InputMismatchException{
		try{
			Rational r1 = new Rational(2.3f, 0.0f);
			r1.disp();
		}
		catch(IllegalArgumentException iae){
			System.out.println("Exception: " + iae.getMessage());
		}
		
		Rational[] arr = new Rational[3];
		arr[0] =  new Rational(23.45f, 1.1f);
		arr[1] =  new Rational(46.78f, 7.8f);
		arr[2] =  new Rational(32f, 9.0f);
		
		try{
			for(int i=0;i<4;i++){
				arr[i].disp();
			}
		}
		catch(ArrayIndexOutOfBoundsException aob){
			System.out.println("Exception: Index " + aob.getMessage() + " Out of Bound");
		}
		System.out.println("Enter two float numbers");
		Scanner sc = new Scanner(System.in);
		try{
			float f1 = sc.nextFloat();
			float f2 = sc.nextFloat();
			Rational r2 = new Rational(f1, f2);
			r2.disp();
		}
		catch(InputMismatchException ime){
			System.out.println("Exception: Input mismatch for float numbers");
		}
		catch(IllegalArgumentException iae){
			System.out.println("Exception: " + iae.getMessage());
		}
//		System.out.println("Enter two float numbers for runtime");
//		float f3 = sc.nextFloat();
//		float f4 = sc.nextFloat();
//		try{
//			if(f4 == 0){
//				throw new RuntimeException("Do not provide zero for denominator");
//			}
//			sc.close();
//			Rational r3 = new Rational(f3, f4);
//			r3.disp();
//		}
//		catch(RuntimeException re){
//			System.out.println("Runtime Exception: " + re.getMessage());
//		}
		sc.close();
	}
}

class Rational{
	float n,d;
	
	Rational(float n,float d){
		if(d == 0){
			throw new IllegalArgumentException("Denominator is Zero");
		}
		this.n = n;
		this.d = d;
	}
	
	public void disp(){
		System.out.println("Rational Number -> numerator = " + n + ", denominator = " + d);
	}
}

class CustomException extends RuntimeException {
	CustomException(String s){
		super(s);
	}
}
