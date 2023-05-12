package execution;

import java.util.Scanner;

public class Case {
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the string");
		String s = in.nextLine();
		System.out.println("Result: " + toggleCase(s));
		in.close();
	}
	public static String toggleCase(String s){
		String t = "";
		for(int i=0;i<s.length();i++){
			if(s.charAt(i) >= 65 && s.charAt(i) <= 90){
				t += (char)(s.charAt(i) - 'A' + 'a');
			}
			else if(s.charAt(i) >= 97 && s.charAt(i) <= 122){
				t += (char)(s.charAt(i) - 'a' + 'A');
			}
			else{
				t += s.charAt(i);
			}
		}
		return t;
	}
}
