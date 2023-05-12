package spot;

import java.util.Scanner;

public class DateMain {

	public static void main(String[] args) {
			
		Date dt0 = new Date(23,12,2015);
		dt0.display();
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter n");
		int n = in.nextInt();
		
		Date[] dt = new Date[n];
		for(int i=0;i<n;i++){
			System.out.println("Enter day,month,year");
			int d,m,y;
			d = in.nextInt();m = in.nextInt();y = in.nextInt();
			dt[i] = new Date(d,m,y);
		}
		System.out.println("Recent date");
		Date.recentDate(dt);
		in.close();
	}

}
