package spot;

import java.util.Scanner;

public class Overload {
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		System.out.println("Enter Date1 => date,month, year");
		int d1 = in.nextInt();
		int m1 = in.nextInt();
		int y1 = in.nextInt();
		System.out.println("Enter Date2 => date,month, year");
		int d2 = in.nextInt();
		int m2 = in.nextInt();
		int y2 = in.nextInt();
		prior(d1, m1, y1, d2, m2, y2);
		
		System.out.println("Enter time1 => hours,minute");
		int h1 = in.nextInt();
		int min1 = in.nextInt();
		System.out.println("Enter time2 => hours,minute");
		int h2 = in.nextInt();
		int min2 = in.nextInt();
		prior(h1, min1, h2, min2);
		
		in.close();
	}
	
	public static void prior(int d1, int m1, int y1, int d2, int m2, int y2){
		if(y1 > y2){
			System.out.println("Date2 is Prior");
			return;
		}
		else if(y1 < y2){
			System.out.println("Date1 is Prior");
			return;
		}
		else{
			if(m1 > m2){
				System.out.println("Date2 is Prior");
				return;
			}
			else if(m1 < m2){
				System.out.println("Date1 is Prior");
				return;
			}
			else{
				if(d1 > d2){
					System.out.println("Date2 is Prior");
					return;
				}
				else if(d1 < d2){
					System.out.println("Date1 is Prior");
					return;
				}
				else{
					System.out.println("Both are same dates");
				}
			}
		}
	}
	
	public static void prior(int h1, int min1, int h2, int min2){
		if(h1 > h2){
			System.out.println("Hour2 is Prior");
			return;
		}
		else if(h1 < h2){
			System.out.println("Hour1 is Prior");
			return;
		}
		else{
			if(min1 > min2){
				System.out.println("Hour2 is Prior");
				return;
			}
			else if(min1 < min2){
				System.out.println("Hour1 is Prior");
				return;
			}
			else{
				System.out.println("Both are same time");
			}
		}
	}

}
