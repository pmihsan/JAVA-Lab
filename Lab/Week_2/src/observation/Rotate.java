package observation;

import java.util.Arrays;
import java.util.Scanner;

public class Rotate {

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
		System.out.println("Enter k");
		int k = in.nextInt();
		k = k % arr.length;
		reverse(arr, 0, arr.length - 1);
		reverse(arr, 0, n-k-1);
		reverse(arr, n-k, arr.length - 1);
		System.out.println(Arrays.toString(arr));
		in.close();

	}
	public static void reverse(int[] arr, int s, int e){
		
		while(s < e){
			int t = arr[s];
			arr[s] = arr[e];
			arr[e] = t;
			s++;
			e--;
		}
	}
	
	public static void swap(int[] arr, int a, int b){
		int t = arr[a];
		arr[a] = arr[b];
		arr[b] = t;
	}
}
