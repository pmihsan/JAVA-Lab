package execution;

import java.util.Scanner;

public class Prefix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the string 1");
		String s = in.next();
		System.out.println("Enter the string 2");
		String t = in.next();
		LCP(s,t);
		in.close();
	}
	
	public static void LCP(String s, String t){
		String res = "";
		int i = 0, j = 0;
		while(i < s.length() && j < t.length()){
			if(s.charAt(i) == t.charAt(j) && s.contains(res)) res += s.charAt(i);
			else break;
			i++;j++;
		}
		if(!res.isEmpty()){
			System.out.println("Longest Common Prefix: " + res);
		}
		else{
			System.out.println("No Common Prefix");
		}
	}

}
