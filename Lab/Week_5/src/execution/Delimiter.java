package execution;

import java.util.Arrays;
import java.util.Scanner;

public class Delimiter {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the string");
		String s = in.next();
		String[] t = split(s, "#");
		System.out.println(Arrays.toString(t));
		in.close();
	}
	
	public static String[] split(String s, String delim){
		String[] temp = s.split(delim);
		String[] res = new String[temp.length + (temp.length - 1)];
		int j = 0;
		for(int i=0;i<res.length;i++){
			if(i % 2 == 0){
				res[i] = temp[j];
				j++;
			}
			else{
				res[i] = delim;
			}
		}
		return res;
	}
}
