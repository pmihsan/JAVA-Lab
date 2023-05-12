package execution;

import java.util.Arrays;
import java.util.Scanner;

public class Random2DArray {
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int n = 6;
		int[][] arr = new int[n][n];
		for(int i=0;i<n;i++){
			for(int j=0;j<n;j++){
				arr[i][j] = (int)Math.round(Math.random());
			}
		}
		
		for(int i=0;i<n;i++){
			System.out.println(Arrays.toString(arr[i]));
		}
		
		System.out.println();
		for(int i=0;i<n;i++){
			System.out.print("ROW " + i + " ");
			checkRow(arr, i);
		}
		
		System.out.println();
		for(int i=0;i<n;i++){
			System.out.print("COLUMN " + i + " ");
			checkRow(arr, i);
		}
		in.close();
	}
	
	public static void checkRow(int[][] arr, int i){
		int count = 0;
		for(int j=0;j<arr.length;j++){
			if(arr[i][j] == 1){
				count++;
			}
		}
		if(count % 2 == 0){
			System.out.println("Even Number of 1's");
		}
		else{
			System.out.println("Not Even Number of 1's");
		}
	}
	
	public static void checkColumn(int[][] arr, int i){
		int count = 0;
		for(int j=0;j<arr.length;j++){
			if(arr[j][i] == 1){
				count++;
			}
		}
		if(count % 2 == 0){
			System.out.println("Even Number of 1's");
		}
		else{
			System.out.println("Not Even Number of 1's");
		}
	}

}
