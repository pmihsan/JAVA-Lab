package execution;

import java.util.Arrays;
import java.util.Scanner;

public class Words {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the string");
		String s = in.nextLine();
		String[] temp = s.split(" ");
		System.out.println("Number of words " + temp.length);
		for(int i=0;i<temp.length;i++){
			temp[i] = strReverse(temp[i]);
		}
		
		System.out.println(Arrays.toString(temp));
		in.close();
	}

	public static String strReverse(String t){
		String r = "";
		for(int i=t.length()-1;i>=0;i--){
			r += t.charAt(i);
		}
		return r;
	}
}
