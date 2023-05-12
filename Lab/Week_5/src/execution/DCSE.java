package execution;

import java.util.Scanner;

public class DCSE {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the string");
		String s = in.nextLine();
		String t = "";
		for(int i=0;i<s.length();i++){
			if(s.charAt(i) >= 65 && s.charAt(i) <= 90){
				t += s.charAt(i);
			}
		}
		System.out.println(t);
		in.close();
	}

}
