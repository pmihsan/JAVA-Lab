package execution;

import java.util.Scanner;
public class Clock {
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		
		int h,m,s;
		int elapse;
		
		System.out.println("Enter hours, minute, seconds");
		h = in.nextInt();
		m = in.nextInt();
		s = in.nextInt();
		
		System.out.println("Enter Time elapsed");
		elapse = in.nextInt();
		
		// User Input
		Time t = new Time(h, m, s);
		System.out.println("Time 0 ");
		t.getTime();
		t.timeElapsed(elapse);
		t.getTime();
		System.out.println();
		
		// Sample Cases
		Time t1 = new Time();
		System.out.println("Default ");
		t1.getTime();
		t1.timeElapsed(275); // 4 min 35 sec
		t1.getTime();
		System.out.println();
		
		Time t2 = new Time(3, 48, 23);
		System.out.println("Time 1 ");
		t2.getTime();
		t2.timeElapsed(1000); // 16 min 40 sec
		t2.getTime();
		System.out.println();
		
		Time t3 = new Time(11, 25, 45);
		System.out.println("Time 2 ");
		t3.getTime();
		t3.timeElapsed(1070); // 17 min 50 sec
		t3.getTime();
		System.out.println();
		
		in.close();
	}
}
