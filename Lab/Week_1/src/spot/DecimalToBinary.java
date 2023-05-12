package spot;

import java.util.Scanner;
public class DecimalToBinary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		
		System.out.println("Do you want to enter decimal(1) or binary(2) number");
		int choice = in.nextInt();
		if(choice == 1){
			System.out.println("Enter Decimal Number");
			int dec = in.nextInt();
//			System.out.println(Integer.toBinaryString(dec));
			int t = dec;
			String s = "";
			while(dec > 0){
				s += dec % 2;
				dec /= 2;
			}
			String res = "";
			for(int i=s.length()-1;i>=0;i--){
				res += s.charAt(i);
			}
			System.out.print("Decimal " + t + " to Binary is " + res);
		}
		else if(choice == 2){
			System.out.println("Enter Binary Number");
			int bin = in.nextInt();
//			System.out.println(Integer.parseInt(Integer.toString(bin), 2));
			int t = bin;
			int res = 0;
			int i = 0;
			while(bin > 0){
				res += bin%10 * Math.pow(2,i);
				i++;
				bin /= 10;
			}
			System.out.println("Binary " + t + " to Decimal is " + res);
		}
		in.close();

	}

}
