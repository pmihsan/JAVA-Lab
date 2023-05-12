package spot;

import java.util.Scanner;
import java.util.Arrays;

public class Employee {
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		System.out.println("Enter n for(employees)");
		int n = in.nextInt();
		System.out.println("Enter you "+  n + " rows");
		int[][] arr = new int[n][7];
		int[] sum = new int[7];
		for(int i=0;i<n;i++){
			int s = 0;
			for(int j=0;j<7;j++){
				arr[i][j] = in.nextInt();
				s += arr[i][j];
			}
			sum[i] = s;
		}
		for(int i=0;i<n-1;i++){
			for(int j=0;j<n-i-1;j++){
				if(sum[j] < sum[j+1]){
					swap(arr, j, j+1, sum);
				}
			}
		}
		
		System.out.println();
		for(int i=0;i<n;i++){
			System.out.println(Arrays.toString(arr[i]) + " Working Hours => " + sum[i]);
		}
		in.close();
	}
	
	public static void swap(int[][] arr, int i, int j, int[] sum){
		int[] temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
		int t = sum[i];
		sum[i] = sum[j];
		sum[j] = t;
	}
	
}
