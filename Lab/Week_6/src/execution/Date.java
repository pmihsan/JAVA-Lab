package execution;

import java.util.Scanner;
import java.util.ArrayList;

public class Date {

/*
16-3-2022
17-03-2030
17-8-2020
15-9-2023
13-4-2021
13-4-2021
17-8-2020
17-8-2020
*/

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		ArrayList<String> date = new ArrayList<>();
		
		System.out.println("Enter n");
		int n = in.nextInt();
		System.out.println("Enter values");
		for(int i=0;i<n;i++){
			String v = in.next();
			addDate(date, v);
		}
		System.out.println();
		
		System.out.println("Recent Date is at index: " + recentDate(date));
		System.out.println();
		
		System.out.println("Enter a date to check");
		String dt = in.next();
		if(checkDate(date, dt)){
			System.out.println("Date " + dt + " Found");
		}
		else{
			System.out.println("Date " + dt + " Not Found");
		}
		System.out.println();
		
		System.out.println("Removing Last Occurence of duplicate dates");
		System.out.println(date);
		removeLastOccur(date);
		System.out.println(date);
		System.out.println();
		
		System.out.println("Enter a new and old date");
		String newDT = in.next();
		String oldDT = in.next();
		System.out.println("Replacing First Occurence of old with new date");
		System.out.println(date);
		setFirstOccur(date, oldDT, newDT);
		System.out.println(date);
		System.out.println();
		in.close();
	}
	
	public static void setFirstOccur(ArrayList<String> dates, String d1, String d2){
		int index = dates.indexOf(d1);
		dates.set(index, d2);
	}
	
	public static void removeLastOccur(ArrayList<String> dates){
		ArrayList<String> dt = new ArrayList<>();
		for(int i=0;i<dates.size();i++){
			if(dates.lastIndexOf(dates.get(i)) != i && !(dt.contains(dates.get(i)))){
				dt.add(dates.get(i));
				dates.remove(dates.lastIndexOf(dates.get(i)));
			}
		}
	}
	
	public static void addDate(ArrayList<String> dates, String val){
		dates.add(val);
	}
	
	public static boolean checkDate(ArrayList<String> dates, String date){
		for(int i=0;i<dates.size();i++){
			if(date.equals(dates.get(i))){
				return true;
			}
		}
		return false;
	}
	
	public static int recentDate(ArrayList<String> dates){
		String[] s = dates.get(0).split("-");
		int day = Integer.parseInt(s[0]);
		int mon = Integer.parseInt(s[1]);
		int year = Integer.parseInt(s[2]);
		int res = 0;
		for(int i=1;i<dates.size();i++){
			String[] d = dates.get(i).split("-");
			if(Integer.parseInt(d[2]) >= year){
				year = Integer.parseInt(d[2]);
				mon = Integer.parseInt(d[1]);
				day = Integer.parseInt(d[0]);
				res = i;
			}
			else continue;
			if(Integer.parseInt(d[1]) >= mon){
				year = Integer.parseInt(d[2]);
				mon = Integer.parseInt(d[1]);
				day = Integer.parseInt(d[0]);
				res = i;
			}
			else continue;
			if(Integer.parseInt(d[0]) >= day){
				year = Integer.parseInt(d[2]);
				mon = Integer.parseInt(d[1]);
				day = Integer.parseInt(d[0]);
				res = i;
			}
		}
		return res; 
	}
}
