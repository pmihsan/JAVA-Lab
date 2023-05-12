package execution;

import java.util.Scanner;
import java.util.Arrays;

public class PrimarySort {
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		System.out.println("Enter m and n");
		int m = in.nextInt();
		int n = in.nextInt();
		System.out.println("Enter you "+ m + "x" + n + " elements");
		int[][] arr = new int[m][n];
		for(int i=0;i<m;i++){
			for(int j=0;j<n;j++){
				arr[i][j] = in.nextInt();
			}
		}
//		int[][] arr = {
//				{4, 2},
//				{1, 7},
//				{4, 5},
//				{1, 2},
//				{1, 1},
//				{4, 1}
//		};
//		int n = 6;
		for(int i=0;i<m-1;i++){
			for(int j=0;j<m-i-1;j++){
				if(isSwap(arr[j], arr[j+1])){
					swap(arr, j, j+1);
				}
			}
		}
		System.out.println();
		for(int i=0;i<m;i++){
			System.out.println(Arrays.toString(arr[i]));
		}
		in.close();
	}
	
	public static boolean isSwap(int[] a, int[] b){
		int i = 0;
		while(i < a.length){
			if(a[i] > b[i]) return true;
			else if(a[i] < b[i]) return false;
			i++;
		}
		return false;
	}
	
	public static void swap(int[][] arr, int i, int j){
		int[] temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
}
