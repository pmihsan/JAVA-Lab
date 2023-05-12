package observation;

import java.util.Arrays;
import java.util.Scanner;

public class Sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("Enter n");
		int n = in.nextInt();
		System.out.println("Enter n elements");
		int[] arr = new int[n];
		for(int i=0;i<n;i++){
			arr[i] = in.nextInt();
		}
		bsort(arr);
		System.out.println(Arrays.toString(arr));
		in.close();

	}
	public static void bsort(int[] arr){
		for(int i=0;i<arr.length-1;i++){
			for(int j=0;j<arr.length-i-1;j++){
				if(arr[j] > arr[j+1]) swap(arr, j+1, j);
			}
		}
	}
	
	public static void swap(int[] arr, int a, int b){
		int t = arr[a];
		arr[a] = arr[b];
		arr[b] = t;
	}
	

}
