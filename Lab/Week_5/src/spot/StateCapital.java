package spot;

import java.util.Scanner;

public class StateCapital {
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		String[][] state_cap = {
				{"Tamil Nadu", "Chennai"},	
				{"Kerala", "Trivandrum"},	
				{"Karnataka", "Bengalore"},	
				{"Delhi", "Agra"},
				{"Telungana", "Hyderabad"},	
				{"Andhra Pradesh", "Amaravathi"},
				{"Jharkand", "Ranchi"},	
				{"West Bengal", "Kolkata"},
				{"Maharastra", "Mumbai"},	
				{"Jammu", "Srinagar"},
		};
		
		int i = 0;
		int marks = 0;
		System.out.println("State - Capital\n");
		while(i < state_cap.length){
			System.out.println("Provide capital for - " + state_cap[i][0]);
			String cap = in.next();
			if(cap.equalsIgnoreCase(state_cap[i][1])){
				System.out.println("Answer Correct");
				marks++;
			}
			else{
				System.out.println("Wrong Capital");
			}
			System.out.println();
			i++;
		}
		System.out.println("Total Correct Answers: " + marks + "/" + state_cap.length);
		in.close();
	}
}
