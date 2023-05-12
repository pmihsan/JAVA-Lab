package execution;

import java.util.Scanner;
public class Grade {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("Enter marks");
		float marks = in.nextFloat();
		
		if(marks >= 91){
			System.out.print("O ");
		}
		else if(marks >= 81){
			System.out.print("A+ ");
		}
		else if(marks >= 71){
			System.out.print("A ");
		}
		else if(marks >= 61){
			System.out.print("B+ ");
		}
		else if(marks >= 51){
			System.out.print("B ");
		}
		else{
			System.out.print("F ");
		}
		System.out.println("Grade");
		in.close();
	}

}
