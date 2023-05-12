package spot;

import java.util.Arrays;
import java.util.Scanner;

public class Stores {
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		double[][] Sales = new double[3][12];
		
		System.out.println("Enter the sales of 3 stores for 12 years");
		double[] least = new double[3];
		for(int i=0;i<3;i++){
			double s = 0;
			for(int j=0;j<12;j++){
				Sales[i][j] = in.nextDouble();
				s += Sales[i][j];
			}
			least[i] = s;
		}
		
		System.out.println("Cumulative Sales of each store " + Arrays.toString(least));
		
		double min = least[0];
		int ind = 1;
		for(int i=1;i<3;i++){
			if(least[i] < min){
				min = least[i];
				ind = i+1;
			}
		}
		System.out.println("Store " + ind + " => made least sale across the year");
		
		double max = Sales[2][0];
		int month = 0;
		for(int i=1;i<12;i++){
			if(Sales[2][i] > max){
				max = Sales[2][i];
				month = i + 1;
			}
		}
		
		System.out.println("In Month - " + month + " => Store 3 made highest sales");
		
		in.close();
	}
}
